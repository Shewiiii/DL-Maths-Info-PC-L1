# Des processus du système
Un **processus** (process) est un objet dynamique qui est mis en place par le système, pour prendre en charge l'exécution d'un programme (binaire, commande unix, script Shell, etc.).

Un processus est formé du **programme à exécuter** et d'un **contexte d'exécution** pour le fonctionnement de l'exécution (mémoire allouée, données du programme, etc.).

Chaque processus contient des informations sur lui-même qui permettent au système de l'identifier et de le faire fonctionner:
- Un **identifiant unique** (PID, Process IDentifier) qui est un entier unique pour chaque processus.
- L'identifiant du **processus parent** (PPID, Parent Process IDentifier), excepté les processus initiaux crées au démarrage du système.

On parle ainsi d'arborescence des processus.
- **Taille** mémoire allouée au processus.
- **Priorité** d'un processus.
- **État** du processus:
    - En exécution (Running, **R**)
    - En attente (Sleeping/Idle, **S**/**I**)
    - Figé ou stoppé (**T**)
    - Terminé (Etat zombie, **Z**)
    - Prêt à s'exécuter (Ready, **R**)
- L'éventuel **terminal** de rattachement (En général, un processus lanvé depuis un terminal lui est rattaché).
- **Propriétaire** du processus (En général, utilisateur qui a lancé le processus).
- Etc.

### Processus rattaché à un terminal
Un processus rattaché à un terminal peut être en avant-plan, c'est-à-dire qu'il peut lire et écrire sur le terminal.

Un **seul (groupe de) processus peut être en avant-plan** sur un terminal donné. Par défaut, c'est le processus bash qui est en avant-plan. Les autres processus rattachés à ce terminal sont dits en arrière-plan et ne peuvent donc pas lire ou écrire sur ce terminal.

On peut lancer un processus en arrière plan avec le caractère `&` à la fin de la commande.


Commande pour lister les processus: `ps`  
Pour lister les processus système: `ps -e`
Pour afficher l'arborescence des processus: `ps -ejH`

<div style="margin: 70px"></div>


## Les signaux
Pour communiquer avec les processus et éventuellement changer son état, le système utilise des **signaux** (signals).

Ils permettent par exemple:
- D'arrêter définitivement un processus.
- De stopper temporairement un processus.
- De relancer un processus stoppé.

<div style="margin: 40px"></div>

**Pour envoyer un signal à un processus**, on utilise la commande `kill` suivie de l'identifiant du processus:
```bash
kill -<SIGNAL> <PID>
```

`kill -l` permet d'afficher la liste des signaux disponibles:

```bash
$ kill -l
 1) SIGHUP      2) SIGINT      3) SIGQUIT     4) SIGILL
 5) SIGTRAP     6) SIGABRT     7) SIGBUS      8) SIGFPE
 9) SIGKILL    10) SIGUSR1    11) SIGSEGV    12) SIGUSR2
 ...
```

Les commandes suivantes sont équivalentes:
```bash
$ kill -SIGINT <PID>
$ kill -INT <PID>
$ kill -2 <PID>
```


**Pour l'arrêt définitif**:
- `SIGKILL` (Ne peut pas être ignoré)
- `SIGINT` (Ctrl+C), `SIGTERM`, `SIGHUP`

**Pour stopper temporairement un processus**:
- `SIGSTOP` (Ne peut pas être ignoré)
- `SIGTSTP` (Ctrl+Z)

**Pour relancer un processus stoppé**:
- `SIGCONT`