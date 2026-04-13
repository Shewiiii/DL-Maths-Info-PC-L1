package IP2.TP.TP10;

public class Robot {
    private final char nom;
    private int energie;
    private final String texte;
    static int nbRob = 0;
    private final int id;
    private int np;

    public Robot(char nom, String texte) {
        this.nom = nom;
        this.energie = 10 + (int) (Math.random() * 11);
        this.texte = texte;
        this.id = nbRob++;
        this.np = texte.length();
    }

    public int getId() {
        return id;
    }

    public char getNom() {
        return nom;
    }

    public int getNp() {
        return np;
    }

    public String description() {

        return "Robot " + nom + " dit " + texte + " quand il parle et a " + energie + " points d'énergie. ";
    }

    public boolean finiDeParler() {
        return np == 0;
    }

    public int parle(int n) {
        if (np == 0) {
            return 0;
        }
        String s = "";
        for (int i = texte.length() - np; i < Integer.min(texte.length() - np + n, texte.length()); i++) {
            s = s + texte.charAt(i);
        }
        np = Integer.max(np - n, 0);
        System.out.println(s);
        return np;
    }

    public static void main(String[] args) {
        Robot test = new Robot('a', "Maître corbeau sur un arbre perché");
        test.parle(5);
        test.parle(5);
        test.parle(5);
        test.parle(5);
        test.parle(5);
        test.parle(5);
        test.parle(5);
        test.parle(5);
        test.parle(5);
        test.parle(5);
    }

}