package TD.TD9;

public class Exos {
    public static void afficheTableau(int[] t) {
        String s = "[";
        for (int n : t) {
            s = s + ", " + n;
        }
        System.out.println(s + "]");
    }

    public static void afficheTableau(int[][] m) {
        for (int[] t : m) {
            afficheTableau(t);
        }
    }

    // Exo 1
    public static int echarpesSTRapide(int n) {
        if (n == 1)
            return 2;
        if (n == 2)
            return 4;
        if (n == 3)
            return 8;

        int[] memo = new int[n + 1];
        // 1ere case reste vide, comme ca je me mélange pas avec les indices
        // case memo[n] = echarpesST(n)
        memo[1] = 2;
        memo[2] = 4;
        memo[3] = 8;

        int resultat = aux1(n, memo);
        // debug
        afficheTableau(memo);
        return resultat;
    }

    public static int aux1(int n, int[] memo) {
        if (memo[n] != 0) {
            // Déjà calculé
            return memo[n];
        }
        int v = aux1(n - 1, memo) + aux1(n - 2, memo) + aux1(n - 3, memo);
        memo[n] = v;
        return v;
    }

    // Exo 2
    // 3. Avec mémoisation, on effectue 7 appels récursifs
    // 4. Educated guess: 51

    public static boolean gagnantRapide(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3 || n == 4)
            return true;
        int[] memo = new int[n + 1];
        // memo[n] vaudra
        // 0 si pas calculé
        // 1 si gagnant(n) est faux
        // 2 si gagnant(n) vrai
        // un peu dégueu mais plus simple imo
        memo[1] = 1;
        for (int i = 2; i < 5; i++) {
            memo[i] = 2;
        }

        boolean resultat = aux2(n, memo);
        afficheTableau(memo);
        return resultat;
    }

    public static boolean aux2(int n, int[] memo) {
        if (memo[n] != 0) {
            return memo[n] == 2;
        }
        boolean v = !aux2(n - 1, memo) || !aux2(n - 2, memo) || !aux2(n - 3, memo);
        memo[n] = (v ? 2 : 1);
        return v;
    }

    // Exo 3
    public static int cheminsRapide(int n, int m) {
        if (n == 0 || m == 0)
            return 1; // Pas indispensable
        int[][] memo = new int[n + 1][m + 1];
        // Pas de pb de décalage de 1 ici
        memo[0][0] = 1;

        int resultat = aux3(n, m, memo);
        afficheTableau(memo);
        return resultat;
    }

    public static int aux3(int n, int m, int[][] memo) {
        if (n == 0 || m == 0) {
            memo[n][m] = 1; // Pas indispensable non plus mais clair dans affichage
            return 1;
        }
        if (memo[n][m] != 0)
            return memo[n][m];

        int v = aux3(n - 1, m, memo) + aux3(n, m - 1, memo);
        memo[n][m] = v;
        return v;
    }

    // Exo 4
    public static int pgcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return pgcd(b, a % b);
    }

    // Exo 5
    public static int factorielle(int n) {
        return aux4(n, 1);
    }

    public static int aux4(int n, int acc) {
        if (n <= 0) {
            return acc;
        }
        return aux4(n - 1, acc * n);
    }

    // Exo 6
    // 1. Retourne (je pense) la chaîne "12345"

    public static String chaine(int n) {
        return aux5(n, "");
    }

    public static String aux5(int n, String acc) {
        if (n == 0) {
            return acc;
        }
        return aux5(n - 1, n + acc);
    }

    // Exo 7: déjà fait ! voir Amphi 9
    public static long fibo(int n) {
        return fiboAux(0, n, 0, 1);
    }

    public static long fiboAux(int i, int n, long u1, long u2) {
        if (n == 0)
            return (long) 0;
        if (i == n) {
            return u1;
        }
        return fiboAux(i + 1, n, u2, u1 + u2);
    }

    // Mémoisation inutile dans ce cas

    public static void main(String[] args) {
        System.out.println(echarpesSTRapide(2));
        System.out.println(echarpesSTRapide(6));
        System.out.println(gagnantRapide(60));
        System.out.println(cheminsRapide(10, 10));
        System.out.println(factorielle(0));
        System.out.println(factorielle(4));
        System.out.println(chaine(5));
        System.out.println(fibo(100));

    }
}
