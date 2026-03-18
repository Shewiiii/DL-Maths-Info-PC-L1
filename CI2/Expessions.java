public class Expessions {

    /* Décompose une expression sous la forme "expr = expr1 ⋇ expr2", et renvoie
     * l'indice où se trouve l'opérateur qui sépare les deux expressions.
     * La fonction ignore les opérateurs qui se trouvent dans des parenthèses.
     * Si aucun opérateur n'est trouvé, renvoie -1.
     */
    public static int findOperator (String expr) {
        int counter = 0;
        for (int i =  0; i < expr.length(); i++) {
            switch (expr.charAt(i)) {
                case '(':
                    counter++;
                    break;
                case ')':
                    counter--;
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    if (counter == 0) return i;
                    break;
            }
        }
        return -1;
    }

    /* Évalue l'expression donnée en entrée. */
    public static int evaluate (String expr) {
        int i = findOperator(expr);
        int n = expr.length();
        if (i == -1) {
            if (expr.charAt(0) == '(' && expr.charAt(n-1) == ')') {
                // Cas où expr = '(' + expr1 + ')' :
                return evaluate(expr.substring(1, n-1));
            }
            // Cas où expr ne contient que des chiffres :
            return Integer.valueOf(expr);
        }
        // Cas où expr = expr1 ⋇ expr2, l'opérateur est à l'indice i
        int val1 = evaluate(expr.substring(0, i));
        int val2 = evaluate(expr.substring(i+1, n));
        switch (expr.charAt(i)) {
            case '+': return val1 + val2;
            case '-': return val1 - val2;
            case '*': return val1 * val2;
            case '/': return val1 / val2;
            default: throw new Error("Erreur inattendue");
        }
    }

    public static void main(String[] args) {
        String expr = "(36-12)*(10+4)";
        int resultat = evaluate(expr);
        System.out.println(resultat);
    }
    
}