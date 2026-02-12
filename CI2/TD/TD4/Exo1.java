package TD.TD4;

public class Exo1 {
    public static void main(String[] args) {
        int r0 = 1; // ligne 0
        int r1 = 0; // ligne 1
        while (r0 < 10) { // ligne 2 et 5
            r1 = r1 + r0; // ligne 3
            r0 = r0 + 2; // ligne 4
        }
        System.out.println("Résultat = " + r1); // ligne 6
        return; // ligne 7
    }
}
