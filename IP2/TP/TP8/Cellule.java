package IP2.TP.TP8;

public class Cellule {
    private Cellule precedente;
    private Cellule suivante;
    private boolean noire;
    private boolean prochainEtat;

    Cellule(boolean noire) {
        precedente = null;
        suivante = null;
        prochainEtat = false;
        this.noire = noire;
    }

    public Cellule getPrecedente() {
        return precedente;
    }

    public void setPrecedente(Cellule precedente) {
        this.precedente = precedente;
    }

    public Cellule getSuivante() {
        return suivante;
    }

    public void setSuivante(Cellule suivante) {
        this.suivante = suivante;
    }

    public boolean getNoire() {
        return noire;
    }

    public boolean getProchainEtat() {
        return prochainEtat;
    }

    public void setProchainEtat(boolean p) {
        prochainEtat = p;
    }

    public void prochaineEtapeAux(int acc) {
        if (this.noire) {
            if (acc > 0) { // case noire -> case noire
                acc++;
                if (acc >= 3) {
                    precedente.setProchainEtat(false);
                }
            } else { // case blanche -> case noire
                acc = 1;
            }
        } else {
            if (acc < 0) { // case blanche -> case blanche
                acc--;
                if (acc <= -3) {
                    precedente.setProchainEtat(false);
                }
            } else { // case noire -> case blanche
                acc = -1;
            }

        }

        if (precedente != null && -3 < acc && acc < 3) {
            precedente.setProchainEtat(true);
        }

        if (suivante == null) { // edge case à la fin
            this.setProchainEtat(acc > -2); // la 3eme case blanche étant à droite mais existe pas dans liste
            return;
        }
        suivante.prochaineEtapeAux(acc);
    }

    public void prochaineEtape() {
        // acc commence à -1 car une case blanche à gauche de debut
        // acc compte le nb de cases consécutives de la même couleur
        // négatif = blanc; positif = noir
        prochaineEtapeAux(-1);
    }

    public void miseAJour() {
        this.noire = prochainEtat;
        if (suivante != null) {
            suivante.miseAJour();
        }
    }

    public void afficher() {
        System.out.print(noire ? "#" : "-");
        if (suivante != null) {
            suivante.afficher();
        }
    }

}
