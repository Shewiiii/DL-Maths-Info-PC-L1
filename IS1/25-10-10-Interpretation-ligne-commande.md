# Interprétation de la ligne de commande
**Commande simple**:
```bash
$ cmd options arguments
```
L'espace est un caractère spécial du shell, c'est-à-dire qu'il est interprété par le Shell. Il a un role de séparateur des éléments de la ligne de commande.

En général, les **options** sont introduites par le caractère spécial du shell `-`.  
Les arguments et les options peuvent être en nombre variable.

La commande peut être:
- Un fichier **binaire**, directement interprétable et donc exécutable par la machine → Il faut avoir le droit `x` pour pouvoir l'exécuter.

```bash
$ ./toto
$ /home/Cerise/mybin/toto
```
<div style="margin: 40px"></div>

Un **script shell**, c'est un fichier texte qui contient des commandes shell et qui est interprété par le Shell.  
Les commandes peuvent être complexes.  
Les shells sont des langages de programmation.

Exemple de script:
```bash
echo
echo "Bonjour, aujourd'hui nous somme le"
date
echo
```
Que l'on exécute avec:
- `bash salutations.sh` → droit `r` sur le script nécessaire.
- `./salutations.sh` → droit `r`et `x` sur le script nécessaires.  

On peut mettre un shebang `#!` (sharp: #, bang: !) au début du script pour dire quel programme shell doit interpréter le script:

```bash
#!bin/bash
```
<div style="margin: 40px"></div>

Enfin, on peut **déspécialiser** un caractère spécial comme `*` en mettant des guillemets.

```bash
$ echo "* [A2] Bonjour"
```


## Redirection de la sortie standard
En général, la sortie d'une commande s'effectue sur le terminal. On distingue les affichages résultat de l'exécution de la commande, qu'on appelle affichages sur la **sortie standard**, des messages d'erreur qui s'affichent sur la **sortie standard erreur**.

Par défaut, la sortie standard est dirigée vers le terminal depuis lequel la commande est lancée.  
On peut rediriger cette sortie standard vers un fichier ordinaire.

```bash
$ cmd options args > référence
```

Exemples:
```bash
$ cat fichier1 fichier2 > fichier3
```
Si fichier3 existe déjà, écrase ce fichier et le remplace par le contenu de fichier1 puis fichier 2.

```bash
$ cat fichier1 fichier2 >> fichier3
```
Si fichier3 existe déjà, ajoute le contenu de fichier1 puis fichier 2 à la fin.