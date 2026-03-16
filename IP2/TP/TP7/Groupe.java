package IP2.TP.TP7;

public class Groupe {
    private Cellule chefDeFile;

    Groupe() {
        chefDeFile = null;
    }

    public void prendreTete(Robot r) {
        if (!r.nomCorrect()) {
            return;
        }
        chefDeFile = new Cellule(r, chefDeFile);
    }

    public String affiche() {
        if (chefDeFile == null) {
            return "Le groupe est vide !";
        }
        return "Le groupe est constitué des robots suivants (le 1er étant le chef de file): \n"
                + chefDeFile.afficheAux();
    }

    public boolean ajouteNouveau(Robot r) {
        if (!r.nomCorrect()) {
            return false;
        }
        chefDeFile = chefDeFile.ajouteNouveauAux(r);
        return true;
    }

    public String bandName() {
        if (chefDeFile == null) {
            return "";
        }
        return chefDeFile.bandNameAux();
    }

    public String chantez() {
        if (chefDeFile == null) {
            System.out.println("Aucun robot dans ce groupe !");
            return "";
        }
        return chefDeFile.chantezAux();
    }
}
