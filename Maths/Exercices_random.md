# Logique et ensembles
## Exercice 1-14
Montrer qu'une suite est bornée $\Leftrightarrow$ La suite et minorée et majorée  

$\boxed{\Rightarrow}$  
Soit $I = [m,M]$ avec $m,M \in \R$ et $m < M$  
Supposons que $\forall n \in \N,u_n \in I$, c'est à dire que la suite est bornée par $I$.  
En particulier $\forall n \in \N$ $u_n \geq m$ et $u_n \leq M$.  
Donc la suite $(u_n)_{n\in\N}$ est minorée par m et majorée par M.  
Elle est donc minorée et majorée.


$\boxed{\Leftarrow}$  
Supposons $u_n$ minorée et majorée. Alors:  
$\exist (m,M) \in \R^2$ $\forall n \in \R$ $u_n \in [m, M]$  
On pose $I = [m, M]$  
Alors $\forall n \in \R$ $u_n \in I$
$u_n$ est bornée.

## Exercice 2-16

Soit $f: E \rightarrow F$  et soit $B \subseteq F$.  
Montrer que $B = f(f^{-1}(B)) \Leftrightarrow B \subseteq Im(f)$

$\boxed{\Rightarrow}$  
Supposons que $B = f(f^{-1}(B))$  
Def de $f^{-1}(B) = \{x \in E \mid f(x) \in B\}$  

Donc $B = \{y \in F \mid \exist x \in f^{-1}(B)$ $f(x)=y\}$  
Or $Im(f) = f(E) = \{y \in F \mid \exist x \in E$ $f(x)=y\}$  
Comme $f^{-1}(B) \subseteq E$, on a bien $B \subseteq f(E)$


$\boxed{\Leftarrow}$  
Soit $B \subseteq f(E)$.  
Donc $\forall y \in B$ $\exists x \in E$ $f(x)=y$  
Donc $B = \{y \in F \mid \exist x \in f^{-1}(B)$ $f(x)=y\}$  
On a bien $B = f(f^{-1}(B))$

Correction: proéder par double implication !! pour $\boxed{\Leftarrow}$ mais flemme.

