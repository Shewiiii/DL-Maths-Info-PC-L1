package TD.TD8;

public class Exos {
    // g(n) = !g(n-1) || !g(n-2) || !g(n-3)
    // lorsque p1 lui reste une allumette: pas le choix il doit l'enlever donc perd
    // lorsque p1 lui en reste 2: il en enlève une est p2 perd automatiquement
    // sinon on suppose que g est correct:
    // sa victoire avec n allumettes est la donnée de:
    // (p2 ne gagne pas avec n-1 allumettes (cad !g(n-1))
    // OU p2 ne gagne pas avec n-2
    // OU p2 ne gagne pas avec n-3)

    // on fait une disjonction en fonction de p1 prend combien d'allumettes
    public static boolean g(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 0) {
            return true;
        }
        return !g(n - 1) || !g(n - 2) || !g(n - 3);
    }

    // S(m, r) = S(m-1, r) + S(m, r-1)
    public static int echarpesSF(int m, int r) {
        if (m == 0) {
            return 1;
        }
        if (r == 0) {
            return 1;
        }
        return echarpesSF(m - 1, r) + echarpesSF(m, r - 1);
    }

    public static int chemins(int i, int j) {
        if (i == 0 || j == 0) {
            return 1;
        }
        return chemins(i - 1, j) + chemins(i, j - 1);
    }

    public static int cheminsDangereux(int i, int j, boolean[][] m) {
        if (m[i][j]) {
            return 0;
        }
        if (i == 0 || j == 0) {
            return 1;
        }
        return cheminsDangereux(i - 1, j, m) + cheminsDangereux(i, j - 1, m);
    }

    // E(1) = 2
    // E(2): (2 rouges, 2 noires, 1r1n, 1n1r) = 4
    // E(3) = 6
    // E_N(n) = E_R(n-1) + E_R(n-2)
    // E_R(n) = E_N(n-1) + E_N(n-2)
    // E(n) = E(n-1) + E(n-2)
    // Avec 3 consécutifs
    // E_N(n) = E_R(n-1) + E_R(n-2) + E_R(n-3)
    // E_R(n) = E_N(n-1) + E_N(n-2) + E_N(n-3)
    // Donc E(n) = E(n-1) + E(n-2) + E(n-3)
    public static int echarpesST(int n) {
        switch (n) {
            case 1:
                return 1;
            case 2:
                return 4;
            case 3:
                return 6; // Askip c'est 8
            default:
                return echarpesST(n - 1) + echarpesST(n - 2) + echarpesST(n - 3);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(g(i));
        }
        System.out.println(echarpesSF(3, 2));
        System.out.println(chemins(10, 10));
    }
}
