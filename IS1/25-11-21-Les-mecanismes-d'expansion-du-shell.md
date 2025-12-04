# Les mécanismes d'expansion du shell
- Jokers: Déjà vu
- **Les variables**

Pour définir une variable:
```bash
<Nom de la variable>=<Valeur> # SANS ESPACE !
$A=4
$echo $A
4
$B="Bonjour"
$echo B
Bonjour
```

Pour créer une variable d'environnement (disponible pour les processus fils):
```bash
$export A
echo $A
4
$export C = "Coucou"
```

Par défaut, une variable définir dans le shell est locale au shell courant.  
Une variable d'environnement est une variable transmise aux processus descendants.  
La commande `env` permet de lister les variables d'environnement.

Pour transformer une variable locale en variable d'environnement, on utilise la commande `export`.

Par que tout shell définisse ces variables d'environnement, il faut les définir dans le fichier ~/.bashrc.  
La variables d'environnement PATH contient les références des répertoires dans lequels le systeme va chercher les exécutables des commandes. Ces références sont séparées par des `:`.

Pour ajouter un nouveau répertoire au PATH:
```bash
PATH=$PATH:/nouveau/repertoire
```

## Des mécanismes d'expansion

Exemple:
```bash
$echo mes j{olis, up}pes
mes jolis jupes

$touch fichier{1..3}.txt
ls fichier*
fichier1.txt  fichier2.txt  fichier3.txt

$D=$(date)
echo $D
ven. 25 nov. 2022 14:30:00 CET

$A=4
echo $((5+9*$A))
41

$B="Bonjour"
$C=" le monde"
echo $B$C
Bonjour le monde

echo \$A
$A
```

La commande `sed` permet de faire des remplacements dans un texte...