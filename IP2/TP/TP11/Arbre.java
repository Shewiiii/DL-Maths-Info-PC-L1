package IP2.TP.TP11;

public class Arbre {
    private Noeud sommet;

    public Arbre(Noeud sommet) {
        this.sommet = sommet;
    }

    public Arbre() {
    }

    public Arbre(Arbre a) {
        if (a.sommet == null) {
            this.sommet = null;
            return;
        }
        this.sommet = sommet.copie();
    }

    public Arbre(int[] tab) {
        if (tab == null || tab.length == 0) {
            this.sommet = null;
            return;
        }

        int n = tab.length;
        int r = n / 2;
        int[] tabG = new int[r];
        int[] tabD = new int[n - r - 1];
        for (int i = 0; i < r; i++) {
            tabG[i] = tab[i];
        }
        for (int i = r + 1; i < n; i++) {
            tabD[i - r - 1] = tab[i];
        }
        Arbre g = new Arbre(tabG);
        Arbre d = new Arbre(tabD);
        Noeud s = new Noeud(tab[r], g.sommet, d.sommet);
        this.sommet = s;
    }

    public void afficheInfixe() {
        if (sommet != null) {
            sommet.afficheInfixe();
        }
    }

    public void afficheSuffixe() {
        if (sommet != null) {
            sommet.afficheSuffixe();
        }
    }

    public void affichePrefixe() {
        if (sommet != null) {
            sommet.affichePrefixe();
        }
    }

    public int nbDeNoeuds() {
        if (sommet == null) {
            return 0;
        }
        return sommet.nbDeNoeuds();
    }

    public int somme() {
        if (sommet == null) {
            return 0;
        }
        return sommet.somme();
    }

    public boolean recherche(int e) {
        if (sommet == null) {
            return false;
        }
        return sommet.recherche(e);
    }

    public static void main(String[] args) {
        Noeud a = new Noeud(6, null, new Noeud(8));
        Noeud b = new Noeud(9, new Noeud(2), a);
        Noeud c = new Noeud(5, b, null);
        Noeud d = new Noeud(1, new Noeud(4), null);
        Noeud e = new Noeud(7, new Noeud(0), d);
        Noeud f = new Noeud(3, c, e);
        Arbre g = new Arbre(f);
        System.out.println("Infixe");
        g.afficheInfixe();
        System.out.println("Préfixe");
        g.affichePrefixe();
        System.out.println("Suffixe");
        g.afficheSuffixe();
        System.out.println("Nb de noeuds de g: " + g.nbDeNoeuds());
        System.out.println("Somme des étiquettes de g: " + g.somme());
        System.out.println("Recherche de 6 dans g: " + g.recherche(6));
        System.out.println("Recherche de 10 dans g: " + g.recherche(10));

        int[] tab = { 6, 1, 2, 3, 7, 5 };
        Arbre h = new Arbre(tab);
        System.out.println("h infixe");
        h.afficheInfixe();
        System.out.println("h préfixe");
        h.affichePrefixe();
        System.out.println("Fin");
    }
}