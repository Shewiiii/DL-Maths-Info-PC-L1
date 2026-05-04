package IP2.TP.TP11;

public class Noeud {
    private int etiquette;
    private Noeud gauche;
    private Noeud droit;

    public Noeud(int etiquette, Noeud g, Noeud d) {
        this.etiquette = etiquette;
        this.gauche = g;
        this.droit = d;
    }

    public Noeud(int etiquette) {
        this(etiquette, null, null);
    }

    public void afficheInfixe() {
        if (gauche != null) {
            gauche.afficheInfixe();
        }
        System.out.println(etiquette);
        if (droit != null) {
            droit.afficheInfixe();
        }
    }

    public void affichePrefixe() {
        System.out.println(etiquette);
        if (gauche != null) {
            gauche.affichePrefixe();
        }
        if (droit != null) {
            droit.affichePrefixe();
        }
    }

    public void afficheSuffixe() {
        if (gauche != null) {
            gauche.afficheSuffixe();
        }
        if (droit != null) {
            droit.afficheSuffixe();
        }
        System.out.println(etiquette);
    }

    public int nbDeNoeuds() {
        int resultat = 1;
        if (gauche != null) {
            resultat += gauche.nbDeNoeuds();
        }
        if (droit != null) {
            resultat += droit.nbDeNoeuds();
        }
        return resultat;
    }

    public int somme() {
        int resultat = etiquette;
        if (gauche != null) {
            resultat += gauche.somme();
        }
        if (droit != null) {
            resultat += droit.somme();
        }
        return resultat;
    }

    public boolean recherche(int e) {
        return (etiquette == e) || (gauche != null && gauche.recherche(e)) || (droit != null && droit.recherche(e));
    }

    public Noeud copie() {
        int e = etiquette;
        Noeud g = null;
        Noeud d = null;
        if (gauche != null) {
            g = gauche.copie();
        }
        if (droit != null) {
            d = droit.copie();
        }
        return new Noeud(e, g, d);
    }

    public static void main(String[] args) {
        Noeud n = new Noeud(0);
        System.out.println("Fin");
    }
}