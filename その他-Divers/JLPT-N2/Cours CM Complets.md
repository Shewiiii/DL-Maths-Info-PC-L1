
> [!abstract]- Cours CM 1 : Généralités sur les fonctions et fonctions usuelles
> 
> ## Plan du Cours :
> 
> 0 : Généralités sur les fonctions.
> 
> 1 : Topologie de $\mathbb{R}$
> 
> 2 : Limites de fonctions
> 
> 3 : Continuité
> 
> 4 : Compacité
> 
> 5 : Dérivation
> 
> 6 : Intégration
> 
> 7 : Développements limités
> 
> 8 : Équations différentielles
> 
> ---
> 
> ## 0. Généralités
> 
> ### 1) Applications :
> 
> Définition : $E, F$ deux ensembles.
> 
> Une application $f$ de $E$ vers $F$ est une règle qui à tout élément $x \in E$ associe un unique élément $f(x) \in F$.
> 
> On note $f : E \longrightarrow F$
> 
> $\quad \quad \quad (x \longmapsto f(x))$
> 
> **Définition :** $f : E \longrightarrow F$ une application.
> 
> - Si $A \subseteq E$, l'**image de $A$ par $f$** est l'ensemble $f(A) := \{ f(x) \mid x \in A \} \subseteq F$.
>     
> - Pour $x \in E$, l'**image de $x$ par $f$** est $f(x) \in F$.
>     
> - Pour $B \subseteq F$, l'**image réciproque de $B$ par $f$** est $f^{-1}(B) := \{ x \in E \mid f(x) \in B \} \subseteq E$.
>     
> - Pour $y \in F$, un **antécédent de $y$ par $f$** est un élément $x \in E$ tel que $f(x) = y$.
>     
> - Le **graphe de $f$** est $Gr(f) := \{ (x, f(x)) \in E \times F \mid x \in E \} \subseteq E \times F$.
>     
> 
> **Remarque :** L'ensemble des antécédents d'un élément $y \in F$ est $f^{-1}(\{y\})$.
> 
> ---
> 
> Définition : Soit $f : E \longrightarrow F$
> 
> $f$ est dite :
> 
> - **injective :** $\forall x, x' \in E, f(x) = f(x') \implies x = x'$
>     
> - **surjective :** $\forall y \in F, \exists x \in E, f(x) = y$
>     
> - **bijective :** Si injective et surjective.
>     
> 
> Si $f$ est bijective alors tout $y \in F$ admet un unique antécédent dans $E$ et on peut définir la bijection réciproque : $f^{-1} : F \longrightarrow E$
> 
> $\quad \quad \quad \quad \quad \quad \quad \quad \quad \quad \quad \quad \quad \quad \quad \quad \quad y \longmapsto \text{l'unique } x \in E \text{ tel que } f(x) = y$
> 
> **Remarque :**
> 
> - On a $f \circ f^{-1}(y) = y \quad \forall y \in F$
>     
> - $\quad \quad f^{-1} \circ f(x) = x \quad \forall x \in E$
>     
> - Le graphe de $f^{-1}$ est $Gr(f^{-1}) = \{ (f(x), x) \mid x \in E \}$.
>     
> 
> ---
> 
> ### 2) Fonctions de la variable réelle
> 
> **Définition :** Une fonction de la variable réelle est une application $f : A \longrightarrow \mathbb{R}$ où $A \subseteq \mathbb{R}$ est appelé l'**ensemble de définition de $f$**.
> 
> **Définition :** Soit $f : A \longrightarrow \mathbb{R}$ une fonction et $B \subseteq A$. La **restriction de $f$ à $B$** est la fonction $f|_B : B \longrightarrow \mathbb{R}$ ($x \longmapsto f(x)$).
> 
> Définition : Soit $A \subseteq \mathbb{R}$ symétrique c'est-à-dire tel que $\forall x \in \mathbb{R}, x \in A \iff -x \in A$.
> 
> Une fonction $f : A \longrightarrow \mathbb{R}$ est dite :
> 
> - **paire** si $\forall x \in A, f(-x) = f(x)$
>     
> - **impaire** si $\forall x \in A, f(-x) = -f(x)$
>     
> 
> **Définition :** $f : A \longrightarrow \mathbb{R}$ est dite **périodique de période $T > 0$** si $\forall x \in A, x+T \in A \implies f(x+T) = f(x)$.
> 
> **Définition :** $f : A \longrightarrow \mathbb{R}$.
> 
> - $f$ est **croissante** si $\forall x, y \in A, x > y \implies f(x) \geqslant f(y)$
>     
> - $f$ est **strictement croissante** si $\forall x, y \in A, x > y \implies f(x) > f(y)$
>     
> - $f$ est **décroissante** si $\forall x, y \in A, x \geqslant y \implies f(x) \leqslant f(y)$
>     
> - $f$ est **strictement décroissante** si $\forall x, y \in A, x > y \implies f(x) < f(y)$
>     
> - $f$ est **monotone** si $f$ est soit croissante soit décroissante.
>     
> - $f$ est **strictement monotone** si $f$ est soit strictement croissante soit strictement décroissante.
>     
> 
> Remarque : Si $f$ est strictement monotone alors $f$ est injective.
> 
> En effet, si $x, x' \in A$ et $x \neq x'$ alors soit $x > x'$ donc ($f(x) > f(x')$ ou $f(x) < f(x')$) soit $x < x'$ donc ($f(x) < f(x')$ ou $f(x) > f(x')$). Dans tous les cas $f(x) \neq f(x')$.
> 
> ---
> 
> ### 3) Fonctions usuelles
> 
> **Polynômes :** fonctions de la forme $P : \mathbb{R} \longrightarrow \mathbb{R}$, $P(x) = a_0 + a_1x + \dots + a_n x^n$ (où $a_0, \dots, a_n \in \mathbb{R}$).
> 
> Fractions rationnelles : $P, Q$ deux polynômes $Q \neq 0$.
> 
> L'ensemble $\{ x \in \mathbb{R} \mid Q(x) = 0 \}$ des racines de $Q$ est fini.
> 
> Une fonction de la forme $f : \mathbb{R} \setminus \{ x \in \mathbb{R} \mid Q(x) = 0 \} \longrightarrow \mathbb{R}$
> 
> $\quad \quad \quad \quad \quad \quad \quad \quad \quad x \longmapsto \frac{P(x)}{Q(x)}$
> 
> est une fraction rationnelle.
> 
> Fonctions trigonométriques :
> 
> Le cercle unité $S^1 = \{ (x, y) \in \mathbb{R}^2 \mid x^2 + y^2 = 1 \} \subseteq \mathbb{R}^2$.
> 
> On pose $I = (1, 0) \in S^1$.
> 
> Définition : Pour chaque $\theta \in \mathbb{R}$ on note $M(\theta)$ le point dans $S^1$ obtenu en partant de $I$ et en parcourant dans le sens anti-horaire un arc de longueur $\theta$. On pose $M(\theta) = (\cos \theta, \sin \theta)$.
> 
> On définit deux fonctions :
> 
> - Cosinus : $\mathbb{R} \longrightarrow \mathbb{R} \quad \theta \longmapsto \cos \theta$
>     
> - Sinus : $\mathbb{R} \longrightarrow \mathbb{R} \quad \theta \longmapsto \sin \theta$
>     
> 
> On définit aussi la tangente :
> 
> $\tan : \mathbb{R} \setminus \{ \frac{\pi}{2} + k\pi \mid k \in \mathbb{Z} \} \longrightarrow \mathbb{R}$
> 
> $\quad \quad x \longmapsto \tan(x) = \frac{\sin(x)}{\cos(x)}$
> 
> Quelques valeurs :
> 
> | $\theta$ | 0 | $\pi/6$ | $\pi/4$ | $\pi/3$ | $\pi/2$ | $\pi$ |
> 
> | :--- | :--- | :--- | :--- | :--- | :--- | :--- |
> 
> | $\cos \theta$ | 1 | $\sqrt{3}/2$ | $\sqrt{2}/2$ | $1/2$ | 0 | -1 |
> 
> | $\sin \theta$ | 0 | $1/2$ | $\sqrt{2}/2$ | $\sqrt{3}/2$ | 1 | 0 |
> 
> Formules d'addition :
> 
> $\cos(a+b) = \cos(a)\cos(b) - \sin(a)\sin(b)$
> 
> $\sin(a+b) = \sin(a)\cos(b) + \cos(a)\sin(b)$
> 
> $\cos(a-b) = \cos(a)\cos(b) + \sin(a)\sin(b)$
> 
> $\sin(a-b) = \sin(a)\cos(b) - \cos(a)\sin(b)$
> 
> ---
> 
> ### 4) Fonctions exponentielles et logarithmes
> 
> On admet (et on démontrera plus tard) qu'il existe une unique fonction $f : \mathbb{R} \longrightarrow \mathbb{R}$ dérivable et telle que $f' = f$ et $f(0) = 1$.
> 
> Cette fonction est appelée exponentielle et notée $\exp = (x \longmapsto e^x)$.
> 
> On peut montrer que $\exp$ réalise une bijection de $\mathbb{R}$ sur $]0, +\infty[$.
> 
> Sa bijection réciproque est notée $\ln : ]0, +\infty[ \longrightarrow \mathbb{R}$ et appelée logarithme.
> 
> On a donc :
> 
> - $\ln(e^x) = x \quad \forall x \in \mathbb{R}$
>     
> - $e^{\ln(y)} = y \quad \forall y \in ]0, +\infty[$
>     
> 
> **Propriétés :**
> 
> - $\forall x, y \in \mathbb{R}, e^{x+y} = e^x e^y$
>     
> - $e^0 = 1$
>     
> - $e^{-x} = \frac{1}{e^x}$
>     
> - $\frac{e^x}{e^y} = e^{x-y}$
>     
> - $\forall x, y > 0, \ln(xy) = \ln(x) + \ln(y)$
>     
> - $\ln(x/y) = \ln(x) - \ln(y)$
>     
> - $\ln(1) = 0$
>     
> 
> ---
> 
> ### Fonctions puissances :
> 
> - Soit $n \in \mathbb{N}^*$.
>     
>     Si $n$ est impair alors la fonction $\mathbb{R} \longrightarrow \mathbb{R}, x \longmapsto x^n$ est strictement croissante donc injective. On démontrera au chapitre 3 qu'elle est bijective. Sa bijection réciproque est la fonction $\mathbb{R} \longrightarrow \mathbb{R}, x \longmapsto x^{1/n}$.
>     
> - Si $n$ est pair alors la fonction $[0, +\infty[ \longrightarrow \mathbb{R}, x \longmapsto x^n$ est strictement croissante donc injective. On verra au chapitre 3 qu'elle est bijective de $[0, +\infty[$ vers $[0, +\infty[$. Sa bijection réciproque est notée $[0, +\infty[ \longrightarrow [0, +\infty[, x \longmapsto x^{1/n}$.
>     
> 
> Plus généralement on peut définir la fonction puissance $(x \longmapsto x^a) : ]0, +\infty[ \longrightarrow \mathbb{R}$ pour $a \in \mathbb{R}$ en posant :
> 
> $x^a := e^{a \ln(x)}$
> 
> - strictement croissante si $a > 0$
>     
> - strictement décroissante si $a < 0$
>     
> - constante égale à 1 si $a = 0$
>     
> 
> Notation cohérente avec les cas $a=n$ et $a=1/n, n \in \mathbb{N}^*$ :
> 
> $\forall x > 0$
> 
> $e^{n \ln(x)} = (e^{\ln(x)})^n = x^n$
> 
> $(e^{1/n \ln(x)})^n = e^{\ln(x)} = x$
> 
> ---
> 
> ### Fonctions hyperboliques
> 
> Le cosinus hyperbolique :
> 
> $\cosh : \mathbb{R} \longrightarrow \mathbb{R}, \quad \cosh(x) = \text{ch}(x) := \frac{e^x + e^{-x}}{2}$
> 
> (paire, $\text{ch}(0)=1$, str. croissante sur $[0, +\infty[$)
> 
> Le sinus hyperbolique :
> 
> $\sinh : \mathbb{R} \longrightarrow \mathbb{R}, \quad \sinh(x) = \text{sh}(x) := \frac{e^x - e^{-x}}{2}$
> 
> (impaire, $\text{sh}(0)=0$, str. croissante)
> 
> La tangente hyperbolique :
> 
> $\tanh : \mathbb{R} \longrightarrow \mathbb{R}, \quad \tanh(x) = \text{th}(x) := \frac{\text{sh}(x)}{\text{ch}(x)} = \frac{e^x - e^{-x}}{e^x + e^{-x}}$

> [!abstract]- Cours CM 2 : Topologie de $\mathbb{R}$ - Intervalles, Voisinages et Ouverts
> 
> ### Chapitre I : Topologie de $\mathbb{R}$
> 
> #### 1) Intervalles et boules.
> 
> **Définition :** Un intervalle est un sous-ensemble $I$ de $\mathbb{R}$ tel que :
> 
> $\forall a, b \in I \quad a \leq b \implies [a, b] \subset I$
> 
> **Théorème :** Soit $I \subset \mathbb{R}$ un intervalle alors $I$ est l'un des ensembles suivants :
> 
> - l'ensemble vide $\emptyset$
>     
> - les singletons $\{c\}$ ($c \in \mathbb{R}$)
>     
> - les segments $[a, b]$, $]a, b[$, $[a, b[$, $]a, b]$ ($a < b$)
>     
> - les demi-droites $]a, +\infty[$, $[a, +\infty[$, $]-\infty, b[$, $]-\infty, b]$
>     
> - $\mathbb{R}$
>     
> 
> ---
> 
> **Rappel (Semestre 1) :**
> 
> Pour $A \subseteq \mathbb{R}$ on dit que
> 
> - $M \in \mathbb{R}$ est un **majorant** de $A$ si $\forall a \in A \quad a \leq M$
>     
> - $m \in \mathbb{R}$ est un **minorant** de $A$ si $\forall a \in A \quad a \geq m$
>     
> 
> **Théorème :** $A \subseteq \mathbb{R}$ non vide.
> 
> - Si $A$ est majorée ($\exists$ un majorant) alors l'ensemble des majorants a un (unique) plus petit élément appelé borne sup de $A$ et noté $\text{Sup}(A)$.
>     
> - Si $A$ est minorée alors l'ensemble des minorants admet un plus grand élément (unique) appelé borne inf, notée $\text{inf}(A)$.
>     
> 
> ---
> 
> **Preuve du théorème :**
> 
> On peut supposer $\text{card}(I) \geq 2$.
> 
> On suppose que $I$ est majoré et minoré.
> 
> Posons $\alpha = \text{inf} I$, $\beta = \text{Sup} I$.
> 
> Il suffit de montrer que $]\alpha, \beta[ \subset I \subset [\alpha, \beta]$
> 
> **Inclusion $]\alpha, \beta[ \subset I$ :** Soit $\alpha < t < \beta$
> 
> Par définition de $\alpha = \text{inf} I$
> 
> $\exists a \in I$ tel que $t > a$
> 
> De même (comme $\beta = \text{sup} I$)
> 
> $\exists b \in I$ tel que $t < b$
> 
> Donc $t \in ]a, b[ \subset [a, b]$
> 
> Comme $I$ est un intervalle, $[a, b] \subset I$
> 
> Donc $t \in I$
> 
> **Inclusion $I \subset [\alpha, \beta]$ :**
> 
> Si $t \notin [\alpha, \beta]$ alors :
> 
> - Soit $t < \alpha$ et donc $t \notin I$ (sinon $\alpha$ ne serait pas un minorant)
>     
> - Soit $t > \beta$ et donc $t \notin I$ (sinon $\beta$ ne serait pas un majorant)
>     
> 
> Les autres cas sont laissés en exercices.
> 
> Faisons uniquement le cas supplémentaire $I$ non majoré et non minoré.
> 
> Soit $x \in \mathbb{R}$.
> 
> $I$ non minoré $\implies \exists a \in I \quad a < x$
> 
> $I$ non majoré $\implies \exists b \in I \quad x < b$
> 
> Donc $x \in ]a, b[ \subset [a, b] \subset I$
> 
> Donc $I = \mathbb{R}$ $\square$
> 
> ---
> 
> **Définition :** Soit $x_0 \in \mathbb{R}$ et $r > 0$
> 
> - La **boule ouverte** de centre $x_0$ et de rayon $r$ est $]x_0 - r, x_0 + r[ = \{x \in \mathbb{R} \mid |x - x_0| < r\}$
>     
> - La **boule fermée** de centre $x_0$ et de rayon $r$ est $[x_0 - r, x_0 + r] = \{x \in \mathbb{R} \mid |x - x_0| \leq r\}$
>     
> 
> #### 2) Voisinages, ouverts et fermés.
> 
> ##### a) Voisinages :
> 
> **Définition :** Soit $x_0 \in \mathbb{R}$. Un sous-ensemble $V \subset \mathbb{R}$ est un **voisinage** de $x_0$ si $V$ contient une boule ouverte centrée en $x_0$.
> 
> c'est-à-dire : $\exists r > 0$ tel que $]x_0 - r, x_0 + r[ \subset V$.
> 
> **Exemples :**
> 
> 1. $]0, 1[$ est un voisinage de chacun de ses points. En effet soit $x_0 \in ]0, 1[$. Poser $r = \text{min}(x_0, 1 - x_0)$.
>     
>     Comme $0 < x_0 < 1$ et $0 < 1 - x_0 < 1$, on a $0 < r < 1$.
>     
>     On a bien $]x_0 - r, x_0 + r[ \subset ]0, 1[$ car, comme $r \leq x_0$ et $r \leq 1 - x_0$, $\forall x \in ]x_0 - r, x_0 + r[$ on a $0 = x_0 - x_0 \leq x_0 - r < x < x_0 + r \leq x_0 + 1 - x_0 = 1$.
>     
> 2. $]0, 1]$ est voisinage de tout point de $]0, 1[$ mais pas de 1.
>     
>     Montrons que $]0, 1]$ n'est pas un voisinage en 1.
>     
>     $\neg (]0, 1] \text{ voisinage de 1})$
>     
>     $\iff \neg (\exists r > 0 \quad ]1 - r, 1 + r[ \subset ]0, 1])$
>     
>     $\iff \forall r > 0 \quad ]1 - r, 1 + r[ \not\subset ]0, 1]$
>     
>     $\iff \forall r > 0 \quad \exists x \in ]1 - r, 1 + r[ \text{ et } x \notin ]0, 1]$
>     
>     Montrons cet énoncé : Soit $r > 0$. Poser $x = 1 + r/2 \in ]1 - r, 1 + r[$, $x \notin ]0, 1]$ car $x > 1$.
>     
> 3. Plus généralement si $a, b \in \mathbb{R}$ avec $a < b$ on montre comme en 1) que $]a, b[$ est voisinage de chacun de ses points.
>     
> 4. $\forall a \in \mathbb{R} \quad [a, +\infty[$ est voisinage de tout point de $]a, +\infty[$ mais pas de $a$.
>     
> 
> **Proposition :** Soit $x \in \mathbb{R}$ et $V \subset \mathbb{R}$, alors $V$ est un voisinage de $x$ si et seulement si $\exists a, b \in \mathbb{R}$ tels que $a < x < b$ et $]a, b[ \subset V$.
> 
> **Preuve :** Si $V$ est voisinage de $x$ alors $\exists r > 0$ tel que $]x - r, x + r[ \subset V$. Poser $a = x - r$ et $b = x + r$.
> 
> Réciproquement, s'il existe $a, b \in \mathbb{R} \quad a < x < b$ et $]a, b[ \subset V$.
> 
> Poser $r = \frac{\text{min}(x - a, b - x)}{2} > 0$.
> 
> Comme $r < x - a$ et $r < b - x$, on a $a < x - r$ et $b > x + r$.
> 
> D'où $]x - r, x + r[ \subset ]a, b[ \subset V$. $\square$
> 
> ---
> 
> **Définition :** Soit $x_0 \in \mathbb{R}$. Un **voisinage épointé** de $x_0$ est un sous-ensemble $V \subset \mathbb{R}$ de la forme $V \setminus \{x_0\}$ où $V$ est un voisinage de $x_0$.
> 
> **Définition :** Soit $V \subset \mathbb{R}$.
> 
> - $V$ est un voisinage de $+\infty$ si $\exists a \in \mathbb{R} \quad ]a, +\infty[ \subset V$
>     
> - $V$ est un voisinage de $-\infty$ si $\exists a \in \mathbb{R} \quad ]-\infty, a[ \subset V$
>     
> 
> **Remarque :** On peut utiliser des intervalles de la forme $[a, +\infty[$, $]-\infty, a]$ sans changer le sens de la définition.
> 
> **Notation :** Pour $x \in \mathbb{R} \cup \{-\infty, +\infty\}$, on note $\mathcal{V}(x)$ l'ensemble des voisinages de $x$.
> 
> **Proposition :** Soit $x \in \mathbb{R} \cup \{-\infty, +\infty\}$.
> 
> $\forall V \in \mathcal{V}(x) \quad \forall W \subset \mathbb{R} \quad V \subset W \implies W \in \mathcal{V}(x)$
> 
> **Preuve :** Application directe de la définition. $\square$
> 
> ---
> 
> ##### b) Ouverts de $\mathbb{R}$ :
> 
> **Définition :** Soit $O \subset \mathbb{R}$. $O$ est dit **ouvert** s'il est voisinage de chacun de ses points.
> 
> C'est-à-dire : $\forall x \in O \quad \exists r > 0 \quad ]x - r, x + r[ \subset O$
> 
> **Exemples :**
> 
> 1. $\forall a < b \quad ]a, b[$ est un ouvert.
>     
> 2. $\forall a \in \mathbb{R} \quad ]a, +\infty[$ est un ouvert ; $]-\infty, a[$ est un ouvert.
>     
> 3. $\emptyset$ et $\mathbb{R}$ sont des ouverts.
>     
> 
> **Théorème :**
> 
> (1) Toute réunion d'ouverts est un ouvert : si $I$ est un ensemble et $\forall i \in I \quad O_i \subset \mathbb{R}$ est un ouvert alors $\bigcup_{i \in I} O_i$ est un ouvert.
> 
> $[\bigcup_{i \in I} O_i = \{x \in \mathbb{R} \mid \exists i \in I \quad x \in O_i \}]$
> 
> (2) Toute intersection finie d'ouverts est un ouvert : si $n \geq 1, O_1, \dots, O_n$ sont des ouverts alors $\bigcap_{k=1}^{n} O_k$ est un ouvert.
> 
> $[\bigcap_{k=1}^{n} O_k = \{x \in \mathbb{R} \mid \forall 1 \leq k \leq n \quad x \in O_k \}]$
> 
> **Preuve :**
> 
> (1) Poser $O = \bigcup_{i \in I} O_i$. Soit $x \in O$ alors $\exists i \in I \quad x \in O_i$.
> 
> Comme $O_i$ est ouvert $\exists r > 0$ tel que $]x - r, x + r[ \subset O_i$.
> 
> Mais comme $O_i \subset O$, on a $]x - r, x + r[ \subset O$.
> 
> Donc $O$ est ouvert.
> 
> (2) Poser $O = O_1 \cap \dots \cap O_n$. Soit $x \in O$ alors $x \in O_i \quad \forall i = 1, \dots, n$.
> 
> Chaque $O_i$ est ouvert. Donc $\forall i = 1, \dots, n \quad \exists r_i > 0$ tel que $]x - r_i, x + r_i[ \subset O_i$.
> 
> Poser $r = \text{min}(r_1, \dots, r_n) > 0$.
> 
> On a $\forall i = 1, \dots, n \quad ]x - r, x + r[ \subset ]x - r_i, x + r_i[ \subset O_i$.
> 
> Donc $]x - r, x + r[ \subset \bigcap_{i=1}^{n} O_i = O$. $\square$
> 
> ---
> 
> **Exemples :**
> 
> 4. $]0, 1[ \cup ]100, +\infty[$ est ouvert.
>     
> 5. Pour $n \in \mathbb{N}^*$ poser $O_n = ]-1/n, 1/n[$, alors chaque $O_n$ est ouvert mais $\bigcap_{n \in \mathbb{N}^*} O_n = \{0\}$ et $\{0\}$ n'est pas ouvert (car n'est pas un voisinage de 0).
>     
>     [$\supset$ : Car $\forall n \geq 1 \quad -1/n < 0 < 1/n$ donc $0 \in O_n \quad \forall n \geq 1$]
>     
>     [$\subset$ : Soit $x \in \bigcap O_n$ alors $-1/n < x < 1/n \quad \forall n \geq 1$. Comme $\mathbb{R}$ archimédien cela implique que $x = 0$.]
>     
> 
> **Proposition :** Soit $x \in \mathbb{R}$ et $V \subset \mathbb{R}$.
> 
> $V$ est un voisinage de $x$ si et seulement si $\exists O \subset \mathbb{R}$ un ouvert tel que $x \in O$ et $O \subset V$.
> 
> **Preuve :** Si $V$ voisinage de $x$, $\exists r > 0 \quad ]x - r, x + r[ \subset V$. Poser $O = ]x - r, x + r[$.
> 
> Réciproquement si $\exists O \subset V$ ouvert $x \in O$ et $O \subset V$. Comme $O$ est ouvert $O \in \mathcal{V}(x)$ et $O \subset V \implies V \in \mathcal{V}(x)$. $\square$

> [!abstract]- Cours CM 3 : Ensembles fermés, Intérieur et Adhérence dans $\mathbb{R}$
>
> ## Fermés de $\mathbb{R}$
>
> **Définition :** Soit $F \subset \mathbb{R}$.
>
> On dit que $F$ est fermé si son complémentaire $\mathbb{R} \setminus F$ est un ouvert.
>
> C'est-à-dire :
>
> $\forall x \in \mathbb{R} \setminus F \quad \exists r > 0$ tel que
>
> $]x-r, x+r[ \subset \mathbb{R} \setminus F$
>
> **Exemples :**
>
> (1) $\forall a \le b$, l'intervalle fermé $[a, b]$ est un fermé
>
> car $\mathbb{R} \setminus [a, b] = ]-\infty, a[ \cup ]b, +\infty[$ est un ouvert.
>
> - $]-\infty, a]$ est un fermé car $\mathbb{R} \setminus ]-\infty, a] = ]a, +\infty[$ est un ouvert.
>
> - $[b, +\infty[$ est un fermé car $\mathbb{R} \setminus [b, +\infty[ = ]-\infty, b[$ est ouvert.
>
> (2) En particulier un singleton $\{a\}$ est fermé.
>
> (3) $\emptyset$ et $\mathbb{R}$ sont fermés.
>
> ---
>
> **Théorème :**
>
> (1) Toute intersection de fermés est un fermé : $I$ un ensemble,
>
> $\forall i \in I, F_i \subset \mathbb{R}$ un fermé.
>
> Alors $\bigcap_{i \in I} F_i$ est un fermé.
>
> (2) Toute union finie de fermés est fermée.
>
> C'est-à-dire $\forall n \ge 1$,
>
> $\forall F_1, \dots, F_n \subset \mathbb{R}$ fermés,
>
> $F_1 \cup F_2 \cup \dots \cup F_n$ est un fermé.
>
> **Preuve :**
>
> (1) $O_i = \mathbb{R} \setminus F_i$ est ouvert $\forall i \in I$.
>
> Donc $\bigcup O_i = \bigcup \mathbb{R} \setminus F_i$ est ouvert.
>
> et $\mathbb{R} \setminus (\bigcap_{i \in I} F_i) = \bigcup_{i \in I} O_i$.
>
> (2) $\mathbb{R} \setminus \bigcup_{i=1}^n F_i = \bigcap_{i=1}^n \mathbb{R} \setminus F_i$ est ouvert.
>
> ---
>
> **Exemple :**
>
> (1) Si une intersection d'ensembles est fermée cela n'implique pas que chacun des membres est fermé.
>
> $]-1, 1[ \cap [0, 1] = [0, 1]$ (fermé)
>
> (2) Une union (infinie) de fermés n'est pas nécessairement fermée.
>
> $\bigcap_{n \ge 1} ]-1/n, 1/n[ = \{0\}$ (fermé)
>
> $\bigcup_{x \in ]0, 1]} \{x\} = ]0, 1]$ pas fermé
>
> car $\mathbb{R} \setminus ]0, 1] = ]-\infty, 0] \cup ]1, +\infty[$
>
> pas ouvert car pas voisinage de 0.
>
> (3) Certains sous-ensembles de $\mathbb{R}$ sont ni ouverts ni fermés.
>
> Par exemple $]0, 1]$ n'est pas ouvert car pas voisinage de 1 et pas fermé (voir exemple 2).
>
> ---
>
> ## Intérieur, adhérence, frontière
>
> ### Intérieur
>
> **Définition :** Soit $A \subset \mathbb{R}$ et $a \in \mathbb{R}$. On dit que $a$ est un point intérieur à $A$
>
> si $A$ est un voisinage de $a$.
>
> C'est-à-dire $\exists r > 0$ tel que $]a-r, a+r[ \subset A$.
>
> L'ensemble des points intérieurs à $A$ est noté $\mathring{A}$ et est appelé l'intérieur de $A$.
>
> **Remarque :** $\mathring{A} \subset A$.
>
> Exemple : $A = [0, 1]$, $\mathring{A} = ]0, 1[$.
>
> car $]0, 1[$ est ouvert.
>
> **Théorème :** L'intérieur de $A$ est le plus grand ouvert (au sens de l'inclusion) inclus dans $A$.
>
> C'est-à-dire :
>
> (i) $\mathring{A} \subset A$ et $\mathring{A}$ est un ouvert.
>
> (ii) $\forall O \subset \mathbb{R}$ si $O$ est ouvert alors $O \subset A \implies O \subset \mathring{A}$.
>
> **Preuve :**
>
> (i) $\mathring{A} \subset A$ est dans la remarque. Montrons que $\mathring{A}$ est ouvert.
>
> Soit $a \in \mathring{A}$. Par définition $\exists r > 0$ tel que $]a-r, a+r[ \subset A$.
>
> [...] Donc $\mathring{A}$ est ouvert.
>
> (ii) Soit $O \subset \mathbb{R}$ un ouvert. On suppose que $O \subset A$.
>
> Montrons que $O \subset \mathring{A}$. Soit $x \in O$. Comme $O$ est ouvert $\exists r > 0$ t.q. $]x-r, x+r[ \subset O \subset A$.
>
> Donc $x \in \mathring{A}$.
>
> **Exemples :**
>
> (i) $\mathring{\overbrace{]a, b[}} = ]a, b[$, $\mathring{\overbrace{[a, b]}} = ]a, b[$.
>
> (ii) $\mathring{\{a\}} = \emptyset$
>
> (iii) $\mathring{\mathbb{Q}} = \emptyset$.
>
> Soit $x \in \mathbb{Q}$ montrons que $\mathbb{Q}$ n'est pas voisinage de $x$.
>
> Soit $r > 0$. On veut montrer que $]x-r, x+r[ \not\subset \mathbb{Q}$.
>
> Par densité de $\mathbb{R} \setminus \mathbb{Q}$ dans $\mathbb{R}$, il existe $y \in \mathbb{R} \setminus \mathbb{Q}$ tel que $y \in ]x-r, x+r[$.
>
> (iv) $\mathring{\mathbb{R} \setminus \mathbb{Q}} = \emptyset$ car $\mathbb{Q}$ est dense dans $\mathbb{R}$.
>
> **Proposition :** Soit $A \subset \mathbb{R}$.
>
> (i) $A$ est ouvert $\iff \mathring{A} = A$.
>
> (ii) Si $B \subset A$ alors $\mathring{A} \cap \mathring{B} = \mathring{\overbrace{A \cap B}}$.
>
> ---
>
> ## Adhérence d'une partie de $\mathbb{R}$
>
> **Définition :** Soit $A \subset \mathbb{R}$ et $a \in \mathbb{R}$.
>
> On dit que $a$ est adhérent à $A$ si tout voisinage $V$ de $a$ rencontre $A$.
>
> C'est-à-dire $\forall V \in \mathcal{V}(a), V \cap A \ne \emptyset$.
>
> Autrement dit : $\forall r > 0, ]a-r, a+r[ \cap A \ne \emptyset$.
>
> On note $\bar{A}$ l'ensemble des points adhérents à $A$ et on l'appelle l'adhérence de $A$.
>
> **Remarque :** On a $A \subset \bar{A}$.
>
> **Exemple :** $A = ]0, 1]$, $\bar{A} = [0, 1]$.
>
> Car $]0, 1] \subset \bar{A}$ par la remarque.
>
> Montrons que $0 \in \bar{A}$ :
>
> Soit $r > 0$. Alors $]-r, r[ \cap ]0, 1] \ne \emptyset$ car contient $\min(r/2, 1)$.
>
> Montrons que si $x \notin [0, 1]$ alors $x \notin \bar{A}$.
>
> Si $x > 1$, poser $r = \frac{x-1}{2} > 0$, alors $]x-r, x+r[ \cap A = \emptyset$.
>
> Si $x < 0$, poser $r = \frac{-x}{2} > 0$, alors $]x-r, x+r[ \cap A = \emptyset$.
>
> ---
>
> **Cours CM 3 (Suite et fin) : Propriétés de l'Adhérence et Dualité**
>
> Fin de l'exemple sur l'adhérence de A = ]0, 1]
>
> Soit r > 0. Alors ]-r, r[ \cap ]0, 1] \neq \emptyset car contient \min(\frac{r}{2}, 1).
>
> Montrons que si x \notin [0, 1] alors x \notin \bar{A} :
>
> * Si x > 1 : Poser r = \frac{x-1}{2} > 0. On a ]x-r, x+r[ \cap ]0, 1] = \emptyset, donc x \notin \bar{A}.
>
> * Si x < 0 : Poser r = \frac{-x}{2} > 0. On a ]x-r, x+r[ \cap A = \emptyset, donc x \notin \bar{A}.
>
> Proposition : Relations avec le complémentaire
>
> Soit A \subset \mathbb{R}.
>
> (i) \mathbb{R} \setminus \bar{A} = \overbrace{\mathbb{R} \setminus A}^{\circ} (L'extérieur de A est l'intérieur de son complémentaire)
>
> (ii) \overline{\mathbb{R} \setminus A} = \mathbb{R} \setminus \mathring{A}
>
> Preuve de (i) :
>
> * Sens direct (\subset) : Soit x \notin \bar{A}. Par définition, \exists V \in \mathcal{V}(x) tel que V \cap A = \emptyset. Ainsi V \subset \mathbb{R} \setminus A. Donc \mathbb{R} \setminus A est un voisinage de x. D'où x \in \overbrace{\mathbb{R} \setminus A}^{\circ}.
>
> * Sens réciproque (\supset) : Soit x \in \overbrace{\mathbb{R} \setminus A}^{\circ}. Alors \mathbb{R} \setminus A est un voisinage de x. Comme ce voisinage ne rencontre pas A, x n'est pas adhérent à A. Donc x \notin \bar{A}.
>
> Preuve de (ii) :
>
> On applique (i) à l'ensemble B = \mathbb{R} \setminus A.
>

> [!abstract]- Cours CM 4 : Limites de suites, Voisinages et Valeurs d'adhérence
> 
> ## 1. Informations administratives et Rappels
> 
> **Contrôles et échéances :**
> 
> - **Début des colles :** 09/02.
>     
> - **Contrôle en TD :** Semaine du 16/02 (Porte sur les Chapitres 0 et 1 : Questions de cours + Exercices).
>     
> 
> **Définitions de base (Limites de suites réelles) :**
> 
> Soit $(u_n)_{n \in \mathbb{N}}$ une suite de réels et $l \in \mathbb{R} \cup \{\pm\infty\}$.
> 
> - **Cas $l \in \mathbb{R}$ :** $\lim_{n \to +\infty} u_n = l \iff \forall \varepsilon > 0, \exists N \in \mathbb{N}, \forall n \ge N, |u_n - l| < \varepsilon$.
>     
> - **Cas $l = +\infty$ :** $\lim_{n \to +\infty} u_n = +\infty \iff \forall M > 0, \exists N \in \mathbb{N}, \forall n \ge N, u_n > M$.
>     
> - **Cas $l = -\infty$ :** $\lim_{n \to +\infty} u_n = -\infty \iff \forall M > 0, \exists N \in \mathbb{N}, \forall n \ge N, u_n < -M$.
>     
> 
> ---
> 
> ## 2. Théorème d'équivalence (Voisinages)
> 
> **Théorème :** Pour une suite $(u_n)$ et $l \in \mathbb{R} \cup \{\pm\infty\}$, les propositions suivantes sont équivalentes :
> 
> 1. (i) $\lim_{n \to +\infty} u_n = l$
>     
> 2. (ii) $\forall V \in \mathcal{V}(l), \exists N \in \mathbb{N}, \forall n \ge N, u_n \in V$
>     
> 3. (iii) $\forall V$ voisinage **ouvert** de $l, \exists N \in \mathbb{N}, \forall n \ge N, u_n \in V$
>     
> 
> **Preuve (i) $\Rightarrow$ (ii) :**
> 
> Soit $V \in \mathcal{V}(l)$.
> 
> - **Si $l \in \mathbb{R}$ :** Il existe $\varepsilon > 0$ tel que $]l-\varepsilon, l+\varepsilon[ \subset V$. Par (i), $\exists N \in \mathbb{N}$ tel que $\forall n \ge N, |u_n - l| < \varepsilon$, donc $u_n \in ]l-\varepsilon, l+\varepsilon[ \subset V$.
>     
> - **Si $l = +\infty$ :** Il existe $M_0 \in \mathbb{R}$ tel que $]M_0, +\infty[ \subset V$. On pose $M = \max(M_0, 1) > 0$. Par (i), $\exists N \in \mathbb{N}$ tel que $\forall n \ge N, u_n > M \ge M_0$, donc $u_n \in V$.
>     
> - **Si $l = -\infty$ :** Preuve analogue.
>     
> 
> **Preuve (iii) $\Rightarrow$ (i) :**
> 
> - **Si $l \in \mathbb{R}$ :** Pour $\varepsilon > 0$, on pose $V = ]l-\varepsilon, l+\varepsilon[$, qui est un voisinage ouvert. Par (iii), $\exists N$ tel que $u_n \in V$ pour $n \ge N$, soit $|u_n - l| < \varepsilon$.
>     
> - **Si $l = \pm\infty$ :** Pour $M > 0$, on considère $V = ]M, +\infty[$ (ou $]-\infty, -M[$), voisinage ouvert de $l$, et on applique (iii).
>     
> 
> ---
> 
> ## 3. Ensembles fermés et suites
> 
> **Proposition :** Soit $F \subset \mathbb{R}$ un fermé et $(u_n)$ une suite d'éléments de $F$. Si $\lim u_n = l \in \mathbb{R}$, alors $l \in F$.
> 
> **Preuve par l'absurde :**
> 
> Si $l \notin F$, alors $l \in \mathbb{R} \setminus F$. Comme $F$ est fermé, son complémentaire $\mathbb{R} \setminus F$ est ouvert. Il existe donc $\varepsilon > 0$ tel que $]l-\varepsilon, l+\varepsilon[ \subset \mathbb{R} \setminus F$. Or, pour $n$ assez grand, $u_n \in ]l-\varepsilon, l+\varepsilon[$, donc $u_n \notin F$, ce qui contredit l'hypothèse.
> 
> **Corollaire :** Si $u_n \in A$ pour tout $n$ et $\lim u_n = l$, alors $l \in \bar{A}$ (adhérence de $A$).
> 
> **Théorème (Caractérisation séquentielle) :** $A$ est fermé si et seulement si il est **séquentiellement fermé** (toute suite convergente d'éléments de $A$ a sa limite dans $A$).
> 
> **Exemple de non-fermé :** $A = ]0, 1]$. La suite $u_n = 1/n$ est dans $A$ mais tend vers $0 \notin A$. Donc $A$ n'est pas fermé.
> 
> ---
> 
> ## 4. Valeurs d'adhérence
> 
> **Définition :** $x \in \mathbb{R}$ est une valeur d'adhérence de $(u_n)$ si :
> 
> $\forall \varepsilon > 0, \forall N \in \mathbb{N}, \exists n \ge N, |u_n - x| < \varepsilon$.
> 
> **Équivalences :**
> 
> - (ii) $\{n \in \mathbb{N} : |u_n - x| < \varepsilon\}$ est un ensemble infini.
>     
> - (iii) $\forall V \in \mathcal{V}(x), \forall N \in \mathbb{N}, \exists n \ge N, u_n \in V$.
>     
> - (v) $x \in \bigcap_{N \in \mathbb{N}} \overline{\{u_n : n \ge N\}}$.
>     
> 
> **Théorème :** $x$ est une valeur d'adhérence de $(u_n) \iff x$ est la limite d'une sous-suite (suite extraite) $(u_{\phi(n)})$.
> 
> **Propriétés :**
> 
> - L'ensemble des valeurs d'adhérence est un fermé.
>     
> - Une suite convergente possède une **unique** valeur d'adhérence (sa limite).
>     
> - **Exemple :** $u_n = (-1)^n$ possède deux valeurs d'adhérence (1 et -1).
>     
> - **Exemple :** $u_n = n$ ou $u_n = (-1)^n \cdot n$ n'ont pas de valeur d'adhérence dans $\mathbb{R}$.
>     
> 
> ---
> 
> ## 5. Chapitre 2 : Définition générale des limites de fonctions
> 
> Soit $A \subset \mathbb{R}, f : A \longrightarrow \mathbb{R}$ et $a, l \in \mathbb{R} \cup \{\pm\infty\}$.
> 
> **Définition de $\lim_{x \to a, x \in A} f(x) = l$ :**
> 
> 1. (i) $\forall U \in \mathcal{V}(a), U \cap A \neq \emptyset$ (on peut "approcher" $a$ via $A$).
>     
> 2. (ii) $\forall V \in \mathcal{V}(l), f^{-1}(V) \in \mathcal{V}_A(a)$ (l'image réciproque d'un voisinage de $l$ est un voisinage relatif de $a$).
>     
> 
> **Remarques sur la condition (i) :**
> 
> - Si $a \in \mathbb{R} : (i) \iff a \in \bar{A}$.
>     
> - Si $a = +\infty : (i) \iff A$ n'est pas majoré.
>     
> - Si $a = -\infty : (i) \iff A$ n'est pas minoré.
>     

> [!abstract]- Cours CM 5 : Limites d'une fonction, voisinages et caractérisations
> 
> ### 1) Limite en un point
> 
> **Proposition :** Soit $A \subset \mathbb{R}$, $a \in \overline{A}$, $l \in \mathbb{R} \cup \{\pm\infty\}$, et $f : A \rightarrow \mathbb{R}$ une fonction.
> 
> Il y a équivalence :
> 
> (i) $\lim_{x \to a, x \in A} f(x) = l$
> 
> (ii) $\forall V \in \mathcal{V}(l), \exists \delta > 0, \forall x \in A, |x - a| < \delta \Longrightarrow f(x) \in V$
> 
> ---
> 
> - **Si $l \in \mathbb{R}$**, (i) et (ii) sont équivalents à :
>     
>     (iii) $\forall \epsilon > 0, \exists \delta > 0, \forall x \in A, |x - a| < \delta \Longrightarrow |f(x) - l| < \epsilon$
>     
> - **Si $l = +\infty$**, (i) et (ii) sont équivalents à :
>     
>     (iv) $\forall N > 0, \exists \delta > 0, \forall x \in A, |x - a| < \delta \Longrightarrow f(x) > N$
>     
> - **Si $l = -\infty$**, (i) et (ii) sont équivalents à :
>     
>     (v) $\forall N > 0, \exists \delta > 0, \forall x \in A, |x - a| < \delta \Longrightarrow f(x) < -N$
>     
> 
> ---
> 
> **Preuve :**
> 
> **(i) $\Longrightarrow$ (ii)** : Soit $V \in \mathcal{V}(l)$. Par (i), $f^{-1}(V) \in \mathcal{V}_A(a)$.
> 
> $\exists W \in \mathcal{V}(a)$ tel que $f^{-1}(V) = W \cap A$.
> 
> $\exists \delta > 0, ]a - \delta, a + \delta[ \subset W$.
> 
> Soit $x \in A$. On suppose que $|x - a| < \delta$. Alors $x \in ]a - \delta, a + \delta[ \subset W$.
> 
> Donc $x \in W \cap A = f^{-1}(V)$. Ainsi, $f(x) \in V$.
> 
> **(ii) $\Longrightarrow$ (i)** : Soit $V \in \mathcal{V}(l)$. Par (ii), $\exists \delta > 0, \forall x \in A, |x - a| < \delta \Longrightarrow f(x) \in V$.
> 
> Donc si $x \in A \cap ]a - \delta, a + \delta[$, alors $f(x) \in V$.
> 
> On en déduit que $A \cap ]a - \delta, a + \delta[ \subset f^{-1}(V)$.
> 
> Or $A \cap ]a - \delta, a + \delta[ \in \mathcal{V}_A(a)$. Donc $f^{-1}(V) \in \mathcal{V}_A(a)$.
> 
> ---
> 
> **Cas $l \in \mathbb{R}$ :**
> 
> **(ii) $\Longrightarrow$ (iii)** : Soit $\epsilon > 0$. On applique (ii) à $V = ]l - \epsilon, l + \epsilon[$.
> 
> $\exists \delta > 0, \forall x \in A, |x - a| < \delta \Longrightarrow f(x) \in V$.
> 
> Or $f(x) \in V \iff |f(x) - l| < \epsilon$.
> 
> **(iii) $\Longrightarrow$ (ii)** : Soit $V \in \mathcal{V}(l)$. $\exists \epsilon > 0, ]l - \epsilon, l + \epsilon[ \subset V$.
> 
> Par (iii), $\exists \delta > 0, \forall x \in A, |x - a| < \delta \Longrightarrow |f(x) - l| < \epsilon$.
> 
> Mais si $|f(x) - l| < \epsilon$, alors $f(x) \in ]l - \epsilon, l + \epsilon[ \subset V$. Donc $f(x) \in V$.
> 
> ---
> 
> ### 2) Limite en $\pm\infty$
> 
> **Proposition :** $A \subset \mathbb{R}$ non majorée, $f : A \rightarrow \mathbb{R}$, $l \in \mathbb{R} \cup \{\pm\infty\}$.
> 
> Équivalence :
> 
> (i) $\lim_{x \to +\infty, x \in A} f(x) = l$
> 
> (ii) $\forall V \in \mathcal{V}(l), \exists M > 0, \forall x \in A, x > M \Longrightarrow f(x) \in V$
> 
> - **Si $l \in \mathbb{R}$** : (iii) $\forall \epsilon > 0, \exists M > 0, \forall x \in A, x > M \Longrightarrow |f(x) - l| < \epsilon$
>     
> - **Si $l = +\infty$** : (iv) $\forall N > 0, \exists M > 0, \forall x \in A, x > M \Longrightarrow f(x) > N$
>     
> - **Si $l = -\infty$** : (v) $\forall N > 0, \exists M > 0, \forall x \in A, x > M \Longrightarrow f(x) < -N$
>     
> 
> **Preuve (i) $\Longrightarrow$ (ii)** : Soit $V \in \mathcal{V}(l)$. Par (i), $f^{-1}(V) = W \cap A$ où $W \in \mathcal{V}(+\infty)$.
> 
> $\exists M_0 \in \mathbb{R}$ tel que $]M_0, +\infty[ \subset W$.
> 
> Poser $M = \max(M_0, 1) > 0$. On a $]M, +\infty[ \subset ]M_0, +\infty[ \subset W$.
> 
> Soit $x \in A$. On suppose $x > M$. Alors $x \in ]M, +\infty[ \subset W$.
> 
> Donc $x \in W \cap A = f^{-1}(V)$. Donc $f(x) \in V$.
> 
> ---
> 
> ### 3) Limites à gauche / à droite
> 
> **Définition :** Soit $A \subset \mathbb{R}, f : A \rightarrow \mathbb{R}, a \in A, l \in \mathbb{R} \cup \{\pm\infty\}$.
> 
> On dit que $f(x)$ tend vers $l$ lorsque $x$ tend vers $a$ à gauche (resp. à droite) si :
> 
> $\lim_{x \to a, x \in A \cap ]-\infty, a[} f(x) = l \quad \left( \text{resp. } \lim_{x \to a, x \in A \cap ]a, +\infty[} f(x) = l \right)$
> 
> - Une limite à gauche se note : $\lim_{x \to a^-, x \in A} f(x)$
>     
> - Une limite à droite se note : $\lim_{x \to a^+, x \in A} f(x)$
>     
> 
> **Proposition :** Soit $A \subset \mathbb{R}, l \in \mathbb{R} \cup \{\pm\infty\}, f : A \rightarrow \mathbb{R}$. On suppose $a \in \overline{A \cap ]-\infty, a[}$ (resp. $a \in \overline{A \cap ]a, +\infty[}$).
> 
> Équivalence :
> 
> (i) $\lim_{x \to a^-, x \in A} f(x) = l$ (resp. $\lim_{x \to a^+, x \in A} f(x) = l$)
> 
> (ii) $\forall V \in \mathcal{V}(l), \exists \delta > 0, \forall x \in A, a - \delta < x < a \Longrightarrow f(x) \in V$
> 
> (resp. à droite : $\forall V \in \mathcal{V}(l), \exists \delta > 0, \forall x \in A, a < x < a+\delta \Longrightarrow f(x) \in V$)
> 
> **Caractérisations selon $l$ :**
> 
> - **Si $l \in \mathbb{R}$**, le cas à gauche est équivalent à : $\forall \varepsilon > 0, \exists \delta > 0, \forall x \in A, a-\delta < x < a \Longrightarrow |f(x) - l| < \varepsilon$.
>     
>     Le cas à droite : $\forall \varepsilon > 0, \exists \delta > 0, \forall x \in A, a < x < a+\delta \Longrightarrow |f(x) - l| < \varepsilon$.
>     
> - **Si $l = +\infty$** : Cas à gauche : $\forall N > 0, \exists \delta > 0, \forall x \in A, a-\delta < x < a \Longrightarrow f(x) > N$.
>     
>     Cas à droite : $\forall N > 0, \exists \delta > 0, \forall x \in A, a < x < a+\delta \Longrightarrow f(x) > N$.
>     
> - **Si $l = -\infty$** : Cas à gauche : $\forall N > 0, \exists \delta > 0, \forall x \in A, a-\delta < x < a \Longrightarrow f(x) < -N$.
>     
>     Cas à droite : $\forall N > 0, \exists \delta > 0, \forall x \in A, a < x < a+\delta \Longrightarrow f(x) < -N$.
>     
> 
> ---
> 
> **Preuve de l'équivalence (Cas à gauche) :**
> 
> **(i) $\Longrightarrow$ (ii)** : Soit $V \in \mathcal{V}(l)$. Par (i) : $f^{-1}(V) \in \mathcal{V}_{A \cap ]-\infty, a[}(a)$.
> 
> Donc $\exists W \in \mathcal{V}(a)$ tel que $f^{-1}(V) = W \cap A \cap ]-\infty, a[$.
> 
> $\exists \delta > 0, ]a-\delta, a+\delta[ \subset W$.
> 
> Soit $x \in A$. On suppose que $a-\delta < x < a$. Alors $x \in ]a-\delta, a+\delta[ \subset W$ et $x \in ]-\infty, a[$.
> 
> Donc $x \in W \cap A \cap ]-\infty, a[ = f^{-1}(V)$. Donc $f(x) \in V$.
> 
> **(ii) $\Longrightarrow$ (i)** : Soit $V \in \mathcal{V}(l)$. Il faut montrer que $f^{-1}(V) \in \mathcal{V}_{A \cap ]-\infty, a[}(a)$.
> 
> Par (ii), $\exists \delta > 0, \forall x \in A, a-\delta < x < a \Longrightarrow f(x) \in V$.
> 
> Donc $A \cap ]a-\delta, a[ \subset f^{-1}(V)$.
> 
> Cela s'écrit $W \cap A \cap ]-\infty, a[$ où $W = ]a-\delta, a+\delta[ \in \mathcal{V}(a)$.
> 
> ---
> 
> ### 4) Lien entre limite globale et limites latérales
> 
> **Proposition :** Soit $f : A \to \mathbb{R}$ et $a \in \overline{(A \cap ]-\infty, a[)} \cap \overline{(A \cap ]a, +\infty[)}$.
> 
> Soit $l \in \mathbb{R} \cup \{\pm \infty\}$. Équivalence :
> 
> (i) $\lim_{x \to a, x \in A} f(x) = l$
> 
> (ii) $\lim_{x \to a^-, x \in A} f(x) = l = \lim_{x \to a^+, x \in A} f(x)$
> 
> **Remarque :** Si $A$ est un voisinage de $a$ ($a \in \mathring{A}$), alors $a \in \overline{A \cap ]-\infty, a[} \cap \overline{A \cap ]a, +\infty[}$.
> 
> En effet, $\exists r > 0$ tel que $]a-r, a+r[ \subset A$.
> 
> Donc $\emptyset \neq ]a-r, a[ \subset A \cap ]-\infty, a[ \cap ]a-r, a+r[$ et $\emptyset \neq ]a, a+r[ \subset A \cap ]a, +\infty[ \cap ]a-r, a+r[$.
> 
> **Exemple :** $A = ]-1, 0[ \cup ]0, 1[$. On a bien $0 \in \overline{A \cap ]-\infty, 0[} \cap \overline{A \cap ]0, +\infty[}$.
> 
> **Preuve de l'équivalence (i) $\iff$ (ii) de cette proposition :**
> 
> **(i) $\Longrightarrow$ (ii)** : Soit $V \in \mathcal{V}(l)$. $\exists \delta_1, \delta_2 > 0$ tels que :
> 
> (1) $\forall x \in A, a-\delta_1 < x < a \Longrightarrow f(x) \in V$
> 
> (2) $\forall x \in A, a < x < a+\delta_2 \Longrightarrow f(x) \in V$
> 
> Pour $\delta = \min(\delta_1, \delta_2) > 0$, soit $x \in A \setminus \{a\}$. Supposons $|x-a| < \delta$, alors $a-\delta < x < a+\delta$.
> 
> - Si $x < a$, alors $a-\delta_1 \leq a-\delta < x < a \Longrightarrow f(x) \in V$.
>     
> - Si $x > a$, alors $a < x < a+\delta \leq a+\delta_2 \Longrightarrow f(x) \in V$.
>     
>     Donc $\lim_{x \to a, x \in A \setminus \{a\}} f(x) = l$.
>     

