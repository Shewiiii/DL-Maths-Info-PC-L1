## Convertir des nombres IEEE 754 en décimal
Soit un nombre en virgule flottante en base 2, sur 32 bits (simple précision):  
$1$ bit de signe, $8$ bits pour l'exposant, $23$ bits pour la mantisse. 

### Étapes de conversion

1. **Lire les bits**: Identifier les bits de signe, d'exposant et de mantisse.

2. **Calculer la valeur de la mantisse**: La mantisse est représentée par un nombre fractionnaire (1/2 + 1/4 +...).

3. **Calculer l'exposant**: L'exposant est stocké avec un biais de $127$. On soustrait donc $127$ pour obtenir l'exposant réel.

4. **Calculer la valeur finale**: La valeur décimale est donnée par la formule:
   $$\boxed{(-1)^{\text{signe}} \times 2^{\text{exposant}} \times (1 + \text{mantisse})}$$

### Exemple

Convertisseur pratique: https://www.h-schmidt.net/FloatConverter/IEEE754.html

Considérons le nombre IEEE 754 suivant:  
`0 10000010 10110000000000000000000`

1. **Bits**:

   - Signe: $0$ (positif)
   - Exposant: $10000010_2 = 130_{10}$
   - Mantisse: $10110000000000000000000_2$

2. **Calcul de la mantisse**:

   $$\text{Mantisse} = \frac{1}{2^1} + \frac{1}{2^3} + \frac{1}{2^4} =  0.6875$$
   
   (en pratique, la mantisse devrait être calculable de tête)

3. **Calcul de l'exposant**:

   $$\text{Exposant débiaisé} = 130 - 127 = 3$$

4. **Calcul de la valeur finale**:

   $$(-1)^0 \times 2^3 \times (1 + 0.6875) = 1 \times 8 \times 1.6875 = \boxed{13.5}$$