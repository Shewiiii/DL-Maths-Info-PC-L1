## Retour sur les liens
- **Un répertoire ne contient que des liens**.
- Un fichier, c'est une zone de la mémoire dans laquelle ses données sont stockées
- Il existe des liens particuliers dont le nom de base commence par `.`.  
 Ce sont des **liens sur des fichiers cachés** correspondant en général à des fichiers ordinaires de configuration, ou des répertoires contenant des fichiers de configuration.  
 On peut aficher ces fichiers avec l'option `-a` de ls.
- Il y **a au moins deux liens sur un répertoire**:
  - Un lien de son répertoire **partent**
  - Un lien `.` sur **lui-même**
  - (Et un lien `..` par sous-répertoire.)

### Exemples:
```bash
$ mv a b
```
Le lien (**12345**, a) du répertoire courant, est modifié en le lien (**12345**, b) → Renommage.  

```bash
$ mv b A/.
```
Le lien (12345, b) est crée dans le répertoire A, et le lien (12345, b) est supprimé du répertoire courant → Déplacement.

```bash
rm A/b
```
- Le lien (12345, b) est supprimé dans A: le nombre de liens sur le fichier d'inoeud 12345 est décrémenté de 1.  
- Si ce nombre passe à 0, alors l'inoeud est retiré de la table des inoeuds et la zone mémoire du fichier correspondant est libérée.

## Retour sur les droits des répertoires
- Le droit `w` seul sur un répertoire ne permet rien, car il faut traverser le répertoire pour accéder et modifier ces liens. Il doit donc être couplé au droit en **exécution** `x`.
