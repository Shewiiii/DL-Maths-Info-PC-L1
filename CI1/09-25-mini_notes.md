# Soit $(x)_b + (y)_b = (z)_b$

Les preuves dessous marchent pour l'addition et la multiplication, il faut juste additionner ou multiplier le reste des congruences selon le cas.

## Preuve par $(b-1)$ (par 9)

$\rightarrow$ Tu **sommes** les chiffres de $x$, puis de $y$, puis regarde les résultat mod $b-1$ et les compare avec le résultat $z$ $mod$ $b-1$.

**Exemple**:  
$(233)_4 + (3302)_4 = (10201)_4$  

$(x):2+3+3 = 8$ et $8 \equiv 2 [3]$  
$(y):3+3+2 = 8$ et $8 \equiv 2 [3]$  

$(x+y):8+8 = 16$ et $16 \equiv \boxed{1} [3]$  
$(z):1+2+1 = 4$ et $4 \equiv \boxed{1}  [3]$

## Preuve par $(b+1)$ (par 11)

$\rightarrow$ Tu fais une **somme alternée** de $x$, puis de $y$ (l'unité est positif, la dizaine négative etc.), puis regarde les réultats $mod$ $b+1$ et les compare avec $z$ $mod$ $b+1$

**Exemple**
$(233)_4 + (3302)_4 = (10201)_4$  

$(x):3-3+2 = 2$ et $2 \equiv 2 [5]$  
$(y):2-0+3-3 = 2$ et $2 \equiv 2 [5]$  

$(x+y):2+2 = 4$ et $4 \equiv \boxed{4} [5]$  
$(z):1-0+2-0+1 = 4$ et $4 \equiv \boxed{4}  [5]$

## Preuve par $(b^2-1)$ (par 99)

$\rightarrow$ Tu **sommes par groupe de deux** les nombres dans $x$, puis dans $y$, puis regarde les réultats $mod$ $b^2+1$ et les compare avec $z$ $mod$ $b^2-1$
<!-- 
**Exemple**:  
$(233)_4 \times (3302)_4 = (2301232)_4$ 

$(x):33+2 = 35$ et $35 \equiv 5 [15]$  
$(y):2+33 = 35$ et $35 \equiv 5 [15]$  

$(x+y):5 + 5 = 4$ et $4 \equiv \boxed{10} [15]$  
$(z):32+12+30+2 = 
 -->
