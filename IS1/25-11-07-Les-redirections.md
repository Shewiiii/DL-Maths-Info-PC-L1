# Les redirections

Chaque procéssus à dans son contexte d'exécution **3 fichiers logiques**:

- l'**entrée standard** (stdin)
- la **sortie standard** (stdout)
- la **sortie d'erreur standard** (stderr)

Le processus peut lire depuis l'entrée standard (le terminal par défaut) et écrire vers les deux sorties standards (le terminal par défaut aussi).  
On parle aussi de flot (ou flux) d'entrée/sortie.

**Schéma:**

```
Entrée → commande → sortie standard
                  → sortie erreur standard
```

**Exemples:**

- `bc` lit sur l'entrée et écrit sur la sortie standard
- `cat` sans argument
- `ls` écrit sur la sortie standard mais ne lit pas sur l'entrée standard
- `mkdir` ni le lit sur l'entrée standard, ni n'écrit sur la sortie standard

En général, toutes les commandes écrivent les erreurs sur la sortie standard erreur.

Ces flots peuvent être **redirigés** vers **d'autres fichiers ordinaires**.

`$ls > listing` : redirige la sortie standard du processus exécutant `ls` vers le fichier `listing` en l'**écrasant** au préalable s'il existe et sinon en le créant

`$ls >> listing` : ajoutant à la fin

---

À chaque flot est associé un **descripteur (numéro)**:

- entrée standard : **0**
- sortie standard : **1** (facultatif le `1`)
- sortie erreur standard : **2**

**Ex:**

```bash
$ls 2 > erreurs.ls
$ls 2 >> erreurs.ls
```

```bash
$echo 3+4 > calcul
$bc < calcul  # redirection de l'entrée standard du processus exécutant bc sur le fichier calcul
7
```

**Pour éviter l'écrasement:**

```bash
$set -o noclobber     # (activation)
```

**Ex:**

```bash
$ echo 5*8 > calcul
→ impossible car calcul existe déjà
```

**Pour comme même écraser même avec le noclobber activé (|):**

```bash
$echo 5*8 >| calcul
```

**Pour la désactiver:**

```bash
$set +o noclobber     # (désactive)
```

---

## Redirection vers un tube anonyme

Un autre mécanisme de **redirection** permet de rediriger la sortie standard « d'un processus exécutant » une commande vers l'entrée d'une autre commande.

**Schéma:**

```
0 → CMD1 → 1 → 0 → CMD2 → 1 →
         → 2           → 2
```

Pour cette redirection, un fichier spécial est créé, appelée **tube anonyme (pipe)**. Le processus exécutant `cmd1` redirige sa sortie standard vers ce tube et le processus exécutant `cmd2` redirige son entrée standard vers ce tube.

**Syntaxe:**

```bash
$cmd1 | cmd2
```

**Ex:**

```bash
$echo coucou | wc -c     # (évaluer le nombre de caractère)
7
```

**On peut enchaîner ces redirections:**

```bash
$cmd1 | cmd2 | cmd3 | cmd4
```

Et on peu mélanger avec des redirections vers des fichiers ordinaires.

```bash
$cmd1 < fic | cmd2 | cmd3 > toto
```

**Schéma:**

```
(fichier) → 0 → cmd1 → 1 → 0 → cmd2 → 1 → 0 → cmd3 → 1 → (toto)
                     → 2                    → 2
```

On peut rediriger la sortie erreur standard vers la sortie standard : `2 >&1`

```bash
$ls -R 2 >&1 | wc -l     # (évaluer le nombre ligne de ls (même erreur))
```

```bash
$ls -R 2>&1 1> fic | wc -l     # (évalue le nombre de ligne d'erreur de ls)
```

---

## Quelques fichier spéciaux

- **la poubelle** : `/dev/null`

```bash
$ls -R 2>&1 1>/dev/null | wc -l  # (évalue le nombre ligne de ls + 1 est mis à la poubelle)
```
