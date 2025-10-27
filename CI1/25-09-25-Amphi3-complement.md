# Soit $(x)_b + (y)_b = (z)_b$

Les preuves dessous marchent pour l'addition et la multiplication, il faut juste additionner ou multiplier le reste des congruences selon le cas.

Les calculs de modulo peuvent être fait en base 10, comme c'est le cas ci-dessous.

## Preuve par $(b-1)$ (par 9)

$\rightarrow$ Tu **sommes** les chiffres de $x$, puis de $y$, puis regarde les résultat mod $b-1$ et les compare avec le résultat $z$ $mod$ $b-1$.

**Exemple**:  
$(233)_4 + (3302)_4 = (10201)_4$  

$(x):2+3+3 = 8$ et $8 \equiv 2 [3]$  
$(y):3+3+2 = 8$ et $8 \equiv 2 [3]$  

$(x+y):2+2=4$ et $4 \equiv \boxed{1} [3]$  
$(z):1+2+1 = 4$ et $4 \equiv \boxed{1} [3]$

## Preuve par $(b+1)$ (par 11)

$\rightarrow$ Tu fais une **somme alternée** de $x$, puis de $y$ (l'unité est positif, la dizaine négative etc.), puis regarde les réultats $mod$ $b+1$ et les compare avec $z$ $mod$ $b+1$

**Exemple**:  
$(233)_4 + (3302)_4 = (10201)_4$  

$(x):3-3+2 = 2$ et $2 \equiv 2 [5]$  
$(y):2-0+3-3 = 2$ et $2 \equiv 2 [5]$  

$(x+y):2+2 = 4$ et $4 \equiv \boxed{4} [5]$  
$(z):1-0+2-0+1 = 4$ et $4 \equiv \boxed{4}  [5]$

## Preuve par $(b^2-1)$ (par 99)

$\rightarrow$ Tu **sommes par groupe de deux** les nombres dans $x$, puis dans $y$, puis regarde les réultats $mod$ $b^2-1$ et les compare avec $z$ $mod$ $b^2-1$

**Exemple**:  
$(233)_4 \times (3302)_4 = (2301232)_4$ 

$(x):33+2 \equiv 2 [33]$  
$(y):2+33 \equiv 2 [33]$  

$(x+y):2+2 \equiv \boxed{10} [15]$  
$(z):32+12+30+2 = 33 + 33 + 10 \equiv \boxed{10} [15] $


$\rightarrow$ Penser à la preuve par $b^2+1$ peut aussi servir à trouver par exemple le reste d'un nombre en base $b$ modulo $b^2+1$ (ex: nombre en base 2 mod 5).

## Calculer des nombres p-adiques

But: Eliminer la partie infinie (avec une barre au dessus).  
**Un exemple** en base 4:  

$$\overline{03}10 = \alpha$$
$$\Leftrightarrow  \alpha = \overline{03}0310$$

En multipliant par $10^{\text{nombre de chiffres sous la barre}}$ (ici $10^2$ = $100$), on a:

$$100 \alpha = \overline{03}1000$$

On soustrait les deux équations:  

$$(100-1)\alpha = \overline{03}1000 - \overline{03}0310$$
$$33 \alpha = 1000 - 310$$
$$33 \alpha = 30$$

On repasse en base 10:  

$$15 \alpha = 12$$

$$\alpha = \frac{12}{15}$$
$$\boxed{\alpha = \frac{4}{5}}$$
