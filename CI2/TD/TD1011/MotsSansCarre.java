package TD.TD1011;

import java.util.LinkedList;

public class MotsSansCarre {
    public static void motsSansCarreABC() {
        motsSansCarreABCAux("", 0);
    }

    public static boolean solutionComplete(String acc) {
        return acc.length() == 100;
    }

    public static void afficherSol(String acc) {
        System.out.println(acc);
    }

    public static boolean motsSansCarreABCAux(String acc, int i) {
        if (solutionComplete(acc)) {
            afficherSol(acc);
            return true;
        }
        for (char c : possibles(acc, i)) {
            if (motsSansCarreABCAux(acc + c, i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static LinkedList<Character> possibles(String acc, int i) {
        // Retourne les lettres que l'on peut placer en position i
        LinkedList<Character> possibles = new LinkedList<>();
        for (char c = 'A'; c <= 'C'; c++) {
            boolean possible = true;
            // vérifier que ce n'est pas un carré
            for (int k = 1; k <= acc.length() / 2; k++) {
                if (acc.substring(i - k, i).equals(acc.substring(i - 2 * k, i - k))) {
                    possible = false;
                }
            }

            if (possible) {
                possibles.add(c);
            }
        }

        return possibles;
    }

    public static void main(String[] args) {
        motsSansCarreABC();
    }
}
