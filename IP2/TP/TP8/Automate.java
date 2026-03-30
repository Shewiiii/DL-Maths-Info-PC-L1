package IP2.TP.TP8;

public class Automate {
    Cellule debut;
    Cellule fin;

    Automate() {
        debut = null;
        fin = null;
    }

    Automate(String str) {
        this();
        if (str.length() == 0) {
            return;
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            ajouterDebut(str.charAt(i) == '#');
        }
    }

    public void ajouterDebut(boolean noire) {
        Cellule nouvelle = new Cellule(noire);

        if (debut == null) {
            debut = nouvelle;
            fin = nouvelle;
            return;
        }

        nouvelle.setSuivante(debut);
        debut.setPrecedente(nouvelle);
        debut = nouvelle;
    }

    public void ajouterFin(boolean noire) {
        Cellule nouvelle = new Cellule(noire);

        if (fin == null) {
            debut = nouvelle;
            fin = nouvelle;
            return;
        }

        fin.setSuivante(nouvelle);
        nouvelle.setPrecedente(fin);
        fin = nouvelle;
    }

    private void afficheraux() {
        if (debut == null) {
            return;
        }
        debut.afficher();
    }

    public void afficher() {
        afficheraux();
        System.out.println();
    }

    public void prochinaEtape() {
        if (debut != null) {
            debut.prochaineEtape();
        }
    }

    public void miseAJour() {
        if (debut != null) {
            debut.miseAJour();
        }
    }

    public void uneEtape() {
        prochinaEtape();
        miseAJour();
    }

    public void nEtapes(int n) {
        System.out.print("t = 0: ");
        afficher();
        for (int i = 1; i <= n; i++) {
            uneEtape();
            System.out.print("t = " + i + ": ");
            afficher();
        }
    }

    public static void main(String[] args) {
        Automate l = new Automate();
        l.ajouterDebut(false);
        l.ajouterDebut(false);
        l.ajouterDebut(false);
        l.ajouterDebut(false);
        l.ajouterDebut(true);
        l.ajouterDebut(false);
        l.ajouterDebut(false);
        l.ajouterDebut(false);
        l.ajouterDebut(true);
        l.ajouterDebut(true);
        l.ajouterDebut(true);
        l.afficher();

        System.out.println("l2");
        Automate l2 = new Automate("###---#----");
        l2.nEtapes(4);

        System.out.println("l3");
        Automate l3 = new Automate("-----#-----");
        l3.nEtapes(10);

    }

}
