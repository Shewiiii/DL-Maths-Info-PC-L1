package IP2.TP3;

public class Utilisateur {
    private String pseudo;
    private String motDePasse;
    private final String adresseMail;

    Utilisateur(String pseudo, String motDePasse, String adresseMail) {
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.adresseMail = adresseMail;
    }

    public String getPseudonyme() {
        return this.pseudo;
    }

    public boolean setPseudonyme(String nouveauPseudo, String mdp) {
        boolean mdpCorrect = testMotDePasse(mdp);
        if (mdpCorrect) {
            this.pseudo = nouveauPseudo;
        }
        return mdpCorrect;
    }

    public boolean testMotDePasse(String mdp) {
        return mdp.equals(this.motDePasse);
    }

    public boolean changerMotDePasse(String adresseMail, String mdp, String nouveauMdp) {
        boolean peutChanger = testMotDePasse(mdp) && adresseMail.equals(this.adresseMail);
        if (peutChanger) {
            this.motDePasse = nouveauMdp;
        }
        return peutChanger;
    }
}
