package TD.TD12;

import java.util.Set;
import java.util.HashSet;

public class Exo4 {
    static int n = 5;
    static int[][] carte = {
            { 0, 1, 0, 0, 1 },
            { 1, 0, 1, 1, 1 },
            { 0, 1, 0, 1, 1 },
            { 0, 1, 1, 0, 1 },
            { 1, 1, 1, 1, 0 }
    };

    // 1. On peut représenter un résultat (partiel)
    // sous forme d'un tableau rempli
    // de 0 si région pas colorée, 1 à 4 sinon.

    public static boolean colorier() {
        return colorierAux(new int[n], 0);
    }

    public static boolean colorierAux(int[] acc, int i) {
        if (solutionComplete(acc)) {
            afficherTableau(acc);
            return true;
        }
        for (int couleur : choixPossibles(acc, i)) {
            acc[i] = couleur;
            if (colorierAux(acc, i + 1)) {
                return true;
            }
            acc[i] = 0;
        }
        return false;
    }

    public static void afficherTableau(int[] acc) {
        String s = "[";
        // Dégueu mais plus simple
        for (int i : acc) {
            s = s + i + ",";
        }
        System.out.println(s + "]");
    }

    public static boolean solutionComplete(int[] acc) {
        for (int i = 0; i < n; i++) {
            if (acc[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static Set<Integer> choixPossibles(int[] acc, int i) {
        // Retourne les couleurs possible pour la région i dans la solution partielle
        // acc
        Set<Integer> resultat = new HashSet<>();
        // Ajoute toutes les couleurs par défaut
        for (int j = 1; j <= 4; j++) {
            resultat.add(j);
        }
        // Enlève les couleurs déjà prises par les régions adjacentes
        for (int j = 0; j < n; j++) {
            // Si région j adjacente à i et est colorée
            if (carte[i][j] == 1 && acc[j] != 0) {
                resultat.remove(acc[j]);
            }
        }
        return resultat;
    }

    public static void main(String[] args) {
        colorier();
    }
}