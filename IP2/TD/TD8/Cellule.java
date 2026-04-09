package IP2.TD.TD8;

public class Cellule {
    private int num;
    private Cellule precedent;
    private Cellule suivant;

    public Cellule(int num, Cellule precedent, Cellule suivant) {
        this.num = num;
        this.precedent = precedent;
        this.suivant = suivant;

    }

    public int getNum() {
        return num;
    }

    public Cellule getSuivant() {
        return suivant;
    }

    public Cellule getPrecedent() {
        return precedent;
    }

    public int taille() {
        if (suivant == null) {
            return 1;
        }
        return 1 + suivant.taille();
    }

    public void changeSuivant(Cellule nouveauSuivant) {
        suivant = nouveauSuivant;
    }

    public void changePrecedent(Cellule nouveauPrecedent) {
        precedent = nouveauPrecedent;
    }

}
