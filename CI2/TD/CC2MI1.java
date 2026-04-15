package TD;

public class CC2MI1 {
    // Exercice 1, 2
    public static long h(int n) {
        return f(n) + g(n);
    }

    public static long f(int n) {
        if (n == 0) {
            return 1;
        }
        return g(n - 1) + 3;
    }

    public static long g(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * f(n - 1);
    }

    // Exercice 1, 3
    static long[] retG;
    static long[] retF;

    public static long h2(int n) {
        retF = new long[n + 1];
        retG = new long[n + 1];
        for (int i = 0; i < n + 1; i++) {
            retF[i] = -1;
            retG[i] = -1;
        }
        return fAux(n) + gAux(n);
    }

    public static long fAux(int n) {
        if (n == 0) {
            return 1;
        }
        if (retF[n] != -1) {
            return retF[n];
        }
        retF[n] = gAux(n - 1) + 3;
        return retF[n];
    }

    public static long gAux(int n) {
        if (n == 0) {
            return 1;
        }
        if (retG[n] != -1) {
            return retG[n];
        }
        retG[n] = 2 * fAux(n - 1);
        return retG[n];
    }

    // Exercice 2, 1
    public static long f21(int n) {
        switch (n) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return f21(n - 2) * f21(n - 1) + 3;
        }
    }

    // Exercice 2, 2
    public static long f2(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        return f2Aux(n, 2, 2, 1);
    }

    public static long f2Aux(int n, int i, long fn1, long fn2) {
        long nouveau = (fn1 * fn2) + 3;
        if (n == i) {
            return nouveau;
        }
        return f2Aux(n, i + 1, nouveau, fn1);
    }

    // Exercice 3
    public static boolean equilibre(String s) {
        return equilibreAux(s, s.length(), 0, 0, 0);
    }

    public static boolean equilibreAux(String s, int len, int i, int compteA, int compteB) {
        if (len == i) {
            return compteA == compteB;
        }
        char c = s.charAt(i);
        if (c == 'A') {
            compteA++;
        }
        if (c == 'B') {
            compteB++;
        }
        return equilibreAux(s, len, i + 1, compteA, compteB);
    }

    public static void main(String[] args) {
        System.out.println(h(4));
        System.out.println(h2(4));

        System.out.println(f21(4));
        System.out.println(f2(4));

        System.out.println(equilibre("AAABBB"));
        System.out.println(equilibre("AAABBBA"));

    }
}
