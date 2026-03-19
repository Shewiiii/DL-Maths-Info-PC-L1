package IP2.TD.TD7;

public class Employe {
    private final String nom;
    private int salaire;

    Employe(String nom, int salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}
