package TD.TD1011;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cavalier {
    static int n = 5;

    public static void afficherParcours(LinkedList<String> parcours) {
        if (parcours.isEmpty()) {
            return;
        }
        String s = parcours.remove();
        System.out.println(s);
        afficherParcours(parcours);
    }

    public static boolean solutionComplete(boolean[][] acc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!acc[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void resoudreCavaliers(int x, int y) {
        // Echiquier n * n, case vaut false si jamais visitée, true sinon
        boolean[][] acc = new boolean[n][n];
        acc[x][y] = true;
        LinkedList<String> parcours = new LinkedList<>();
        parcours.add("Départ: (" + x + ", " + y + ")");
        resoudreCavaliersAux(acc, parcours, x, y);
        System.out.println("Fin");
    }

    public static boolean resoudreCavaliersAux(boolean[][] acc, LinkedList<String> parcours, int x, int y) {
        if (solutionComplete(acc)) {
            afficherParcours(parcours);
            return true;
        }
        for (int[] position : choixPossibles(acc, x, y)) {
            int posX = position[0];
            int posY = position[1];
            acc[posX][posY] = true;
            parcours.add("Déplacement en (" + posX + ", " + posY + ")");
            if (resoudreCavaliersAux(acc, parcours, posX, posY)) {
                return true;
            }
            parcours.removeLast();
            acc[posX][posY] = false;
        }
        return false;
    }

    // Aux
    private static boolean dansEchiquier(int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < n;
    }

    public static ArrayList<int[]> choixPossibles(boolean[][] acc, int x, int y) {
        ArrayList<int[]> resultat = new ArrayList<>();
        // Positions que le cavalier peut faire, sans check d'abord
        int[][] huitPositions = {
                { x - 1, y + 2 }, { x + 1, y + 2 }, { x - 2, y + 1 }, { x + 2, y + 1 }, { x - 2, y - 1 },
                { x + 2, y - 1 }, { x - 1, y - 2 }, { x + 1, y - 2 }
        };
        for (int[] position : huitPositions) {
            if (dansEchiquier(position[0], position[1]) && !acc[position[0]][position[1]]) {
                resultat.add(position);
            }
        }

        return resultat;
    }

    public static void main(String[] args) {
        // position initiale: x, y
        // taille: n (variable statique)
        resoudreCavaliers(0, 0);
    }

}
