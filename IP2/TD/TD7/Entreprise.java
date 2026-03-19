package IP2.TD.TD7;

public class Entreprise {
    @SuppressWarnings("unused")
    private String nom;
    private Cellule premier;

    Entreprise(String nom) {
        this.nom = nom;
        this.premier = null;
    }

    // Flemme de faire les versions itératives: pas naturelles et en O(n^2)
    public void affiche() {
        if (premier == null) {
            System.out.println("Aucun employés !");
        } else {
            premier.affiche();
        }
    }

    public boolean appartient(String n) {
        if (premier == null) {
            return false;
        }
        return premier.appartient(n);
    }

    public void ajout(Employe emp) {
        if (this.appartient(emp.getNom()) || premier == null) {
            return;
        }
        // Toujours en premier
        // this.premier = new Cellule(emp, premier);
        premier.ajout(emp);
    }

    public Employe demission(String n) {
        if (premier == null) {
            return null;
        }
        premier = premier.demission(n);
        return premier.getEmp();
    }

    public boolean augmente(String nom, int montant) {
        if (montant < 0 || premier == null) {
            return false;
        }
        Employe e = this.demission(nom);
        if (e == null) {
            return false;
        }
        e.setSalaire(montant);
        this.ajout(e);
        return true;
    }

    public boolean croissante() {
        if (this.premier == null) {
            return true;
        }
        return premier.croissante();
    }

    public Entreprise choixSalaire(int min, int max) {
        if (premier == null) {
            return null;
        }
        Entreprise entreprise = new Entreprise("Risées du village");
        premier = premier.choixSalaire(min, max, entreprise);
        return entreprise;
    }
}
