
# Inoeud et droits

Un __inoeud__ est un entité qui associe les métadonnées d'un fichier avec un numéro d'identification unique, appelé __numéro__ d'inoeud du fichier.

Le système maintient une table des inoeuds

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

Un __lien__ est un coulpe associant un nom de base d'un fichier et son numéro d'inoeud: (N° inoeud, Nom de base)

Un répertoire contient alors une liste de liens correspondant aux numéros d'inoeud et noms de base des fichiers qu'il "contient".

---------

__Il peut y avoir plusieurs liens (link) dans le SGF qui pointent vers le même fichier__.  
Si le fichier est un fichier ordinaire, on peut créer de nouveaux lieus sur ce fichier à l'aide de la commande __ln__.

