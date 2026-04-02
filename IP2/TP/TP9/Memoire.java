package IP2.TP.TP9;

public class Memoire {
    Memoire precedente;
    Memoire suivante;
    int num;

    Memoire() {
        precedente = null;
        suivante = null;
        num = 0;
    }

    Memoire(int taille) {
        this();
        Memoire courante = this;
        for (int i = 1; i < taille; i++) {
            courante.suivante = new Memoire();
            courante.suivante.precedente = courante;
            courante = courante.suivante;
        }
    }

    public int getNum() {
        return num;
    }

    public Memoire getPrecedente() {
        return precedente;
    }

    public Memoire getSuivante() {
        return suivante;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void inspecte() {
        String chaineG = "";
        String chaineD = "";

        if (precedente != null) {
            chaineG = this.precedente.gaucheToString("");
        }
        if (suivante != null) {
            chaineD = this.suivante.droiteToString("");
        }

        String chaine = chaineG + num + chaineD;
        int longueurChaineG = chaineG.length(); // Pour savoir le nombre d'espaces à mettre
        int tailleTotale = chaine.length();
        System.out.println("Taille totale:" + tailleTotale);
        String ligne = "";
        String espaces = "";
        for (int i = 0; i < tailleTotale; i++) {
            ligne = ligne + "-";
            if (i < longueurChaineG) {
                espaces = espaces + " ";
            }
        }
        System.out.println(ligne);
        System.out.println(chaineG + num + chaineD);
        System.out.println(espaces + "^");
        System.out.println(ligne);

    }

    private String gaucheToString(String acc) {
        String nouveauAcc = num + " " + acc;
        if (precedente == null) {
            return nouveauAcc;
        }
        return this.precedente.gaucheToString(nouveauAcc);
    }

    private String droiteToString(String acc) {
        String nouveauAcc = acc + " " + num;
        if (suivante == null) {
            return nouveauAcc;
        }
        return this.suivante.droiteToString(nouveauAcc);
    }

    public static void main(String[] args) {
        Memoire test = new Memoire(5);
        test.suivante.inspecte();
    }
}
