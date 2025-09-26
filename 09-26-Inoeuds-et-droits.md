
# Inoeud et droits

Un **inoeud** est un entité qui associe les métadonnées d'un fichier avec un numéro d'identification unique, appelé **numéro** d'inoeud du fichier.

Le système maintient une table des inoeuds:

```
| N° inoeud | meta-données |
|-----------|--------------|                                | (2, /)
|0          |              |                               [ ]
|1          |              |                             ---|
|2          |              | <- racine /      (7 8, bin) |
|...        |              |                            [ ]
|7 8        |              | <- bin                      |
|10         |              | <- A             (10n, A)  ( )
                              
```

Un **lien** est un couple associant un nom de base d'un fichier et son numéro d'inoeud: (N° inoeud, Nom de base).

Un répertoire contient alors une liste de liens correspondant aux numéros d'inoeud et noms de base des fichiers qu'il "contient".

<div style="margin: 30px"></div>  

---
<div style="margin: 30px"></div>  

**Il peut y avoir plusieurs liens (link) dans le SGF qui pointent vers le même fichier**.  
Si le fichier est un fichier **ordinaire** (interdit pour les répertoires), on peut créer de nouveaux liens sur ce fichier à l'aide de la commande **ln**. 

Lorsqu'un répertoire est créé, deux liens au minimum pointent vers ce répertoire, de noms:
-  \.
- Le  nom de base dans le répertoire où il est créé.  

" **.** " désigne **le répertoire lui-même**. Chaque sous-répertoire a un lien vers son parent de nom " **..** ".
<div style="margin: 30px"></div>  

---
<div style="margin: 30px"></div>  

```bash
$ pwd
/home/Cerise/A
$ mkdir B
```
Ici:
- 3 liens pointent vers A (. , le nom de base A et B)
- 2 liens pointent vers B (. et le nom de base B)

<div style="margin: 30px"></div>

---
<div style="margin: 30px"></div>  



Le "nombre de liens contenus dans les métadonnées d'un fichier" est le "nombre de lien qui pointe vers ce fichier".  
Si un répertoire a **k liens** (k $\geq$ 2) qui pointent vers lui, alors ce répertoire "contient" **k-2 sous-répertoires**.

Si on exécute la commande
```bash
$ ls A 
```

- Le système récupère le numéro d'inoeud du répertoire courant, consulte la table des inoeuds pour récuprérer l'adresse mémoire où sont stockées les données du répertoire courant
- Lis les liens du répertoire courant, et si il trouve un lien de nom de base A, il récupère son N° d'inoeud. Sinon il affiche un message d'erreur.


Il consulte la table des inoeuds et récupère le type de fichier, si c'est un répertoire il affiche [ ] et affiche les noms de base des liens contenus dans A.

<div style="margin: 70px"></div>

# Droits des fichiers

Il y a **3 types de droits**: les droits en **lecture**, **écriture**, et en **exécution**.  

Pour chaque fichier, il y a **3 groupes** d'utilisateur.ices:
- Le/La propriétaire du fichier
- Le groupe propriétaire du fichier
- Les autres utilisateurs.ices ayant accès au SGF

Pour chacun de ses groupes, les droits sur un fichier peuvent être différenciées.  
Les droits des **fichiers ordinaires**:
- en lecture **'r'** (read), permet de **lire le contenu** du fichier, par exemple avec `cat` / un éditeur, ou encore le **copier** avec `cp`.
- en écriture **'w'** (write), qui permet de **modifier le contenu** du fichier, par exemple avec un éditeur de texte.
- en exécution **'x'** (execute), permet de **lancer comme une commande** le fichier.

Le droit des **fichiers répertoires**:
-  en lecture **'r'** (read), permet de **lire le contenu du répertoire**, cest-à-dire lister les liens contenus dans ce répertoire (par exemple avec `ls`).
- en écriture **'w'** (write), qui permet de **modifier le contenu du répertoire**, donc ajouter ou supprimer un lien dans le répertoire (par exemple avec `mkdir`, `mv`, `cp` etc .) 
- en exécution **'x'** (execute), permet de **traverser le répertoire**.

A propos de `ls -l`:

```bash
$ ls -l test
-rw-rw-r-- 1 Cerise Fruits 0 Sep 26 10:51 fichier
```
Dans l'odre:
- 3 premières lettres: propriétaire **'u'** (user, Cerise)
- Groupe propriétaire **'g'** (Fruits)
- Les autres **'o'** (others)

<div style="margin: 70px"></div>

# Modifier les droits (mode)

Commande: `chmod <droits> <ref>`
Notation symbolique des droits:
- 'r', 'w', 'x' (ou rien)
- 'u', 'g', 'o'
- \+ \- \=

Exemples:
```bash
$ chmod u+x,og-r f
$ chmod ug=rw,o= f
$ chmod 755 f # équivalent à chmod u=rwx,og=rx
```

Notation binaire:
- `r`: $2^2 = 4$
- `w`: $2$
- `x`: $1$
Donc par exemple, 6 correspond à `rw`, 3 à `wx` etc.