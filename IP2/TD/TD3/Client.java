package IP2.TD.TD3;

public class Client {
    final private String prenom;
    final private String nom;

    Client(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return this.prenom + " " + this.nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

}
