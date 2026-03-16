package IP2.TP.TP7;

public class Robot {
    private final char nom;
    private int energie;
    private final String texte;

    public Robot(char nom, String paroles) {
        this.nom = nom;
        energie = 10 + (int) (Math.random() * 11); // entre 10 et 20
        texte = paroles;
    }

    public String description() {
        return "Robot " + nom + " dit " + texte + " quand il parle et a " + energie + "points d'énergie";
    }

    public boolean nomCorrect() {
        return (int) 'a' <= (int) nom && (int) nom <= (int) 'z';
    }

    public int getEnergie() {
        return energie;
    }

    public char getNom() {
        return nom;
    }

    public String getTexte() {
        return texte;
    }

    public String chante() {
        if (energie >= 10) {
            energie -= 10;
        } else {
            // Le robot doit quand même être cabable de chanter sinon ? pas clair
            return "";
        }
        if ((int) nom % 2 == 1) {
            return texte + texte + texte;
        }
        return texte + texte;
    }
}
