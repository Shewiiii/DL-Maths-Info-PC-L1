package IP2.TD.TD6;

import java.util.LinkedList;

public class Catalogue {
    private LinkedList<Livre> livres;

    public int compteLivres(String auteur) {
        int n = 0;
        for (int i = 0; i < livres.size(); i++) {
            Livre l = livres.get(i);
            if (l.auteur.equals(auteur)) {
                n += 1;
            }
        }
        return n;
    }

    private int aux(String auteur, int i, int acc) {
        if (i >= this.livres.size()) {
            return acc;
        }
        int tf = this.livres.get(i).equals(auteur) ? 1 : 0;
        return aux(auteur, i + 1, acc + tf);
    }

    public int compteLivresRec(String auteur) {
        return aux(auteur, 0, 0);
    }
}
