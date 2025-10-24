# Soit $(x)_b + (y)_b = (z)_b$

Les preuves dessous marchent pour l'addition et la multiplication, il faut juste additionner ou multiplier le reste des congruences selon le cas.

Les calculs sont **à faire en base b**. Tous les exemples sont en base 4.

## Preuve par $(b-1)$ (par 9)

$\rightarrow$ Tu **sommes** les chiffres de $x$, puis de $y$, puis regarde les résultat mod $b-1$ et les compare avec le résultat $z$ $mod$ $b-1$.

**Exemple**:  
$(233)_4 + (3302)_4 = (10201)_4$  

$(x):2+3+3 = 20$ et $8 \equiv 2 [3]$  
$(y):3+3+2 = 20$ et $8 \equiv 2 [3]$  

$(x+y):2+2=10$ et $16 \equiv \boxed{1} [3]$  
$(z):1+2+1 = 10$ et $4 \equiv \boxed{1} [3]$

## Preuve par $(b+1)$ (par 11)

$\rightarrow$ Tu fais une **somme alternée** de $x$, puis de $y$ (l'unité est positif, la dizaine négative etc.), puis regarde les réultats $mod$ $b+1$ et les compare avec $z$ $mod$ $b+1$

**Exemple**:  
$(233)_4 + (3302)_4 = (10201)_4$  

$(x):3-3+2 = 2$ et $2 \equiv 2 [5]$  
$(y):2-0+3-3 = 2$ et $2 \equiv 2 [5]$  

$(x+y):2+2 = 10$ et $10 \equiv \boxed{4} [5]$  
$(z):1-0+2-0+1 = 10$ et $10 \equiv \boxed{4}  [5]$

## Preuve par $(b^2-1)$ (par 99)

$\rightarrow$ Tu **sommes par groupe de deux** les nombres dans $x$, puis dans $y$, puis regarde les réultats $mod$ $b^2+1$ et les compare avec $z$ $mod$ $b^2-1$

**Exemple**:  
$(233)_4 \times (3302)_4 = (2301232)_4$ 

$(x):33+2 \equiv 2 [33]$  
$(y):2+33 \equiv 2 [33]$  

$(x+y):2+2 \equiv \boxed{10} [15]$  
$(z):32+12+30+2 = 33 + 33 + 10 \equiv \boxed{10} [15] $

