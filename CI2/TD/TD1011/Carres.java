package TD.TD1011;

import java.util.LinkedList;

public class Carres {
    public static int[][] sol;
    public static int nbSol = 0;

    public static void afficherSol() {
        for (int k = 0; k < sol.length; k++) {
            for (int l = 0; l < sol.length; l++) {
                System.out.print(sol[k][l] + " ");
            }
            System.out.println();
        }
    }

    public static void init_sol(int n, boolean normaliser) {
        nbSol = 0;
        sol = new int[n][n];
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                sol[k][l] = -1;
            }
        }

        if (normaliser) {
            for (int i = 0; i < n; i++) {
                sol[0][i] = i + 1;
                sol[i][0] = i + 1;
            }
        }

        afficherSol();
    }

    public static boolean solutionComplete(int n) {
        return sol[n - 1][n - 1] != -1;
    }

    public static LinkedList<Integer> possibles(int n, int i, int j) {
        // Retourne la liste des nombres que l'on peut placer en i j
        LinkedList<Integer> possibles = new LinkedList<>();
        for (int c = 1; c <= n; c++) {
            boolean possible = true;
            // si c sur la même colone, hell nah
            for (int ligne = 0; ligne < n; ligne++) {
                // en vrai aller jusqu'à n est pas nécessaire:
                // jusqu'à i en théorie suffit
                if (sol[ligne][j] == c) {
                    possible = false;
                }
            }

            // si c sur la même ligne, ts pmo icl
            for (int col = 0; col < n; col++) {
                if (sol[i][col] == c) {
                    possible = false;
                }
            }

            if (possible) {
                possibles.add(c);
            }
        }
        return possibles;
    }

    public static void resoudreCarresAux(int n, int i, int j, boolean normaliser) {
        if (solutionComplete(n)) {
            nbSol++;
            System.out.println("Solution " + nbSol + " :");
            afficherSol();
            return;
        }
        for (int c : possibles(n, i, j)) {
            sol[i][j] = c;
            int i2;
            int j2 = j;
            if (i + 1 >= n) {
                j2 = j + 1;
                i2 = normaliser ? 1 : 0;
            } else {
                i2 = i + 1;
            }
            resoudreCarresAux(n, i2, j2, normaliser);
            sol[i][j] = -1;
        }
    }

    public static void resoudreCarres(int n, boolean normaliser) {
        init_sol(n, true);
        if (normaliser) {
            resoudreCarresAux(n, 1, 1, normaliser);
        } else {
            resoudreCarresAux(n, 0, 0, normaliser);
        }
    }

    public static void main(String[] args) {
        resoudreCarres(4, true);
    }
}
