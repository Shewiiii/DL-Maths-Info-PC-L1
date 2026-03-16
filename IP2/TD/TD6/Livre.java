package IP2.TD.TD6;

public class Livre {
    public final String auteur;
    public final String titre;
    public final int annee;

    Livre(String auteur, String titre, int annee) {
        this.auteur = auteur;
        this.titre = titre;
        this.annee = annee;
    }

    public String toString() {
        return this.auteur + " - " + this.titre + " (" + annee + ")";
    }
}
