import java.util.*;

public class HuitReines {
    
    // Principe :
    //   sol.get(i) == k : la reine de la ligne i se trouve sur la colonne k.
    public static ArrayList<Integer> sol = new ArrayList<>();
    public static int nbSol = 0;

    // On vérifie si la solution est compl1ète, c'est-à-dire, si les 8 reines
    // ont été ajoutées à l'échiquier.
    public static boolean solutionComplete() {
        return sol.size() == 8;
    }

    // Renvoie la liste des colonnes possibles pour la prochaine reine à ajouter.
    // Les lignes de 0 jusqu'à sol.size() - 1 contiennent déjà des reines.
    // La prochaine reine sera donc sur la ligne sol.size().
    public static LinkedList<Integer> possibles() {
        LinkedList<Integer>  possibles = new LinkedList<>();
        int ligne = sol.size();
        for (int col = 0; col < 8; col++) { // Pour chaque colonne possible
            boolean menace = false;
            for (int i = 0; i < ligne; i++) { // Pour chaque reine déjà présente
                if (sol.get(i) == col
                    || Math.abs(i - ligne) == Math.abs(col - sol.get(i)))
                {
                    // S'il y a déjà une reine sur la colonne ou en diagonale :
                    // la colonne col est interdite.
                    menace = true;
                }
            }
            if (!menace) {
                // Si aucune menace : colonne col autorisée.
                possibles.add(col);
            }
        }
        return possibles;
    }

    public static void resoudreHuitReines() {
        if (solutionComplete()) {
            nbSol++;
            System.out.println("Solution " + nbSol + " :");
            System.out.println(sol);
            return;
        }
        for (int c : possibles()) {
            sol.add(c);
            resoudreHuitReines();
            sol.removeLast();
        }
    }

    public static void main(String[] args) {
        resoudreHuitReines();
    }

}