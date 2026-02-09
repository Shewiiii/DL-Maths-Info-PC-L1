package IP2.TP3;

public class Message {
    /*
     * Variables publiques car peut être que d'autres classes
     * voudraient acceder à ces variables
     */
    public final int idMessage;
    public final int idChannel;
    public final int idAuteur;
    public final String auteur;
    public final String dateEnvoi;
    private String contenu;
    private boolean estEdite;

    @Override
    public String toString() {
        return "Message envoyé par " + this.auteur + " le " + dateEnvoi + ": " + this.contenu;
    }

    Message(int idMessage, int idChannel, int idAuteur, String auteur, String contenu, String dateEnvoi) {
        this.idMessage = idMessage;
        this.idChannel = idChannel;
        this.idAuteur = idAuteur;
        this.auteur = auteur;
        this.contenu = contenu;
        this.dateEnvoi = dateEnvoi;
    }

    public String getContenu() {
        return this.contenu;
    }

    public boolean editerMessage(String nouveauContenu) {
        this.contenu = nouveauContenu;
        this.estEdite = true;
        return true;
    }

    public boolean estEdite() {
        return this.estEdite;
    }
    // Pas besoin de getters pour le reste, les variables sont finales anyways

}
