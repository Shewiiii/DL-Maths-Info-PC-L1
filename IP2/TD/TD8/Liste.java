package IP2.TD.TD8;

public class Liste {
    private Cellule premier;
    private Cellule dernier;

    public int taille() {
        if (premier == null) {
            return 0;
        }
        return premier.taille();
    }

    public String contenu() {
        if (premier == null) {
            return "()";
        }
        String s = "(" + premier.getNum();
        Cellule curseur = premier.getSuivant();
        while (curseur != null) {
            s = s + ", " + curseur.getNum();
            curseur = curseur.getSuivant();
        }
        return s + ")";
    }

    public void ajoutDebut(int num) {
        Cellule nouveau = new Cellule(num, null, premier);
        if (premier != null) {
            premier = nouveau;
        }
        if (dernier == null) {
            dernier = nouveau;
        }
    }

    public void ajoutFin(int num) {
        Cellule nouveau = new Cellule(num, dernier, null);
        if (dernier != null) {
            dernier.changeSuivant(nouveau);
        }
        dernier = nouveau;
        if (premier == null) {
            premier = nouveau;
        }
    }

    public void ajouterAvant(int cible, int nouv) {
        if (premier == null) {
            ajoutDebut(nouv);
        }
        Cellule curseur = premier;
        while (curseur != null) { // while(1) ok mais moins safe
            if (curseur.getSuivant() == null || curseur.getSuivant().getNum() == cible) {
                Cellule nouveau = new Cellule(nouv, curseur, curseur.getSuivant());
                curseur.changeSuivant(nouveau);
                return;

            }
            curseur = curseur.getSuivant();
        }

    }

    public boolean supprimer(int num) {
        if (premier == null) {
            return false;
        }
        boolean trouve = false;
        Cellule curseur = premier;
        while (curseur != null) {
            if (curseur.getNum() == num) {
                Cellule cprecedent = curseur.getPrecedent();
                Cellule csuivant = curseur.getSuivant();
                if (cprecedent == null) {
                    premier = csuivant;
                } else {
                    cprecedent.changeSuivant(csuivant);
                }
                if (csuivant == null) {
                    dernier = cprecedent;
                } else {
                    csuivant.changePrecedent(cprecedent);
                }
            }
            trouve = true;
            curseur = curseur.getSuivant();
        }
        return trouve;
    }

    public int milieu() {
        if (premier == null) {
            System.out.println("Liste vide bro");
            return 0;
        }
        int t = taille(); // obligatoire pour savoir où est le milieu;
        int i_milieu = (t - 1) / 2;
        Cellule c_milieu = premier;
        for (int i = 0; i < i_milieu; i++) {
            c_milieu = c_milieu.getSuivant();
        }
        if (t % 2 == 0) {
            return (c_milieu.getNum() + c_milieu.getSuivant().getNum()) / 2;
        } else {
            return c_milieu.getNum();
        }

    }

    public static void main(String[] args) {
        Liste l = new Liste();
        l.ajoutFin(1);
        l.ajoutFin(1);
        l.ajoutFin(2);
        l.ajoutFin(4);
        l.ajoutFin(1);
        System.out.println(l.contenu());
        System.out.println(l.milieu());
        l.supprimer(1);
        System.out.println(l.contenu());
        System.out.println(l.milieu());
    }
}
