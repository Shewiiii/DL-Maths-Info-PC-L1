import os
import base64
from io import BytesIO
from PIL import Image, UnidentifiedImageError, ImageFile
from time import sleep
from pathlib import Path
from itertools import chain
from typing import Optional

from dotenv import load_dotenv
from google import genai
from google.genai.errors import ServerError
from sympy import simplify_logic, SympifyError

# Supporte:
# Expressions SymPy, images en base64, images dans la racine du script


load_dotenv(dotenv_path="./.env")
GEMINI_API_KEY = os.getenv("GEMINI_API_KEY")
if GEMINI_API_KEY:
    client = genai.Client(api_key=GEMINI_API_KEY)


def interprete_arbre(
    url_base64_image: Optional[str] = None, image: Optional[ImageFile.ImageFile] = None
) -> str:
    if not (url_base64_image or image):
        return ""

    if not GEMINI_API_KEY:
        print(
            "Pour interpréter une image, ajoutez dans un .env "
            "une clé API Gemini en se basant sur la template."
        )
        return ""

    if url_base64_image:
        base64_image = url_base64_image.removeprefix("data:image/png;base64,")
        image_bytes = base64.b64decode(base64_image)
        image = Image.open(BytesIO(image_bytes))

    prompt_text = (
        "Analyse l'arbre ou l'expression de logique propositionnelle dans l'image. "
        "Écris l'expression au format SymPy (sans utiliser ^ (XOR))"
        "Ne donne que l'expression, sans explication ni texte supplémentaire."
        "Exemple: a & (b | c) & (~b | ~c)"
    )

    try:
        response = client.models.generate_content(
            model="gemini-2.5-pro", contents=[image, prompt_text]
        )

    except ServerError as e:
        if e.code == 503:
            print("Model surchargé, nouvelle tentative..")
            return interprete_arbre(url_base64_image, image)
        # ...
        else:
            raise e

    return response.text.strip().replace("`", "")


def main():
    compteur = 1
    i = ""
    while 1:
        i = input("Donner une expression (exit ou e pour quitter): ")

        try:
            if i.lower() in {"exit", "e"}:
                break

            elif "data" in i:  # Si le lien d'une image est donné
                i = interprete_arbre(i)

            else:  # Si une image est donnée
                images = chain.from_iterable(
                    Path(".").glob(f"*.{ext}") for ext in ["jpg", "png"]
                )
                for im in images:
                    # Prend juste la première image
                    i = interprete_arbre(image=Image.open(im))
                    im.unlink()
                    break

            simplifiee = simplify_logic(i)
            print(f"Expression {compteur}: {i}")
            print(f"Simplification {compteur}: {simplifiee}\n")
            compteur += 1

            sleep(0.5)  # Clear print buffer
        except UnidentifiedImageError:
            print("Image invalide")
            continue

        except SympifyError:
            print(f"Expression invalide: {i}")
            continue


if __name__ == "__main__":
    main()
