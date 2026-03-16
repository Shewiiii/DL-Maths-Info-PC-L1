package IP2.TP.TP7;

public class Cellule {
    private Robot rob;
    private Cellule suivant;

    Cellule(Robot rob, Cellule suivant) {
        this.rob = rob;
        this.suivant = suivant;
    }

    Cellule(Robot rob) {
        this(rob, null);
    }

    public String afficheAux() {
        if (rob == null) {
            return "";
        }
        return rob.description() + "\n" + suivant.afficheAux();
    }

    public Cellule ajouteNouveauAux(Robot r) {
        if (suivant == null) {
            suivant = new Cellule(r);
            return this;
        }
        return suivant.ajouteNouveauAux(r);
    }

    public String bandNameAux() {
        if (suivant == null) {
            return "" + rob.getNom();
        }
        return rob.getNom() + suivant.bandNameAux();
    }

    public String chantezAux() {
        System.out.println(rob.chante());
        if (suivant != null) {
            return suivant.chantezAux();
        }
        return "";
    }
}
