package IP2.TP.TP10;

public class TableRonde {
    Cellrob courant;

    TableRonde(Robot rob) {
        courant = new Cellrob(null, rob, null);
    }

    public void affiche() {
        int idFirst = courant.rob.getId();
        Cellrob curseur = this.courant;
        do {
            System.out.println(curseur.rob.description());
            curseur = curseur.suiv;
        } while (curseur != null && curseur.rob.getId() != idFirst);
    }

    public void ajouteRob(Robot r) {
        int idFirst = courant.rob.getId();
        Cellrob curseur = courant;
        while (curseur.suiv != null && curseur.suiv.rob.getId() != idFirst) {
            curseur = curseur.suiv;
        }

        curseur.suiv = new Cellrob(curseur, r, courant);
        courant.prec = curseur.suiv;
    }

    public boolean supprimer(int id) {
        int idFirst = courant.rob.getId();
        Cellrob curseur = courant;
        do {
            if (curseur.rob.getId() == id) {
                curseur.prec.suiv = curseur.suiv;
                curseur.suiv.prec = curseur.prec;
                return true;
            }
            curseur = curseur.suiv;
        } while (curseur != null && curseur.rob.getId() != idFirst);

        return false;

    }

    public boolean supprimer(char nom) {
        int idFirst = courant.rob.getId();
        Cellrob curseur = courant;
        do {
            if (curseur.rob.getNom() == nom) {
                curseur.prec.suiv = curseur.suiv;
                curseur.suiv.prec = curseur.prec;
                return true;
            }
            curseur = curseur.suiv;
        } while (curseur != null && curseur.rob.getId() != idFirst);

        return false;
    }

    public static void main(String[] args) {
        Robot rob = new Robot('a', "071");
        TableRonde tb = new TableRonde(rob);
        tb.ajouteRob(new Robot('b', "031"));
        tb.ajouteRob(new Robot('c', "081"));
        tb.ajouteRob(new Robot('d', "001"));
        tb.affiche();
        System.out.println("");
        tb.supprimer(tb.courant.suiv.suiv.rob.getId());
        tb.affiche();
    }
}
