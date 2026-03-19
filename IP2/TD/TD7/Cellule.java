package IP2.TD.TD7;

public class Cellule {
    private Employe emp;
    private Cellule suivant;

    public Cellule(Employe emp) {
        this.emp = emp;
        this.suivant = null;
    }

    public Cellule(Employe emp, Cellule suiv) {
        this.emp = emp;
        this.suivant = suiv;
    }

    public Employe getEmp() {
        return emp;
    }

    public void affiche() {
        System.out.println(emp.getNom());
        if (suivant != null) {
            suivant.affiche();
        }
    }

    public boolean appartient(String n) {
        if (suivant == null) {
            return emp.getNom() == n;
        }
        return (emp.getNom() == n) || suivant.appartient(n);
    }

    public Cellule demission(String n) {
        if (emp.getNom() == n) {
            return suivant;
        }
        return new Cellule(emp, suivant.demission(n));
    }

    public boolean augmente(String nom, int montant) {
        if (emp.getNom() == nom) {
            emp.setSalaire(montant);
            return true;
        }
        if (suivant == null) {
            return false;
        }
        return suivant.augmente(nom, montant);
    }

    public boolean croissanteAux(int r) {
        if (emp.getSalaire() < r) {
            return false;
        }
        if (suivant == null) {
            return true;
        }
        return suivant.croissanteAux(emp.getSalaire());
    }

    public boolean croissante() {
        return croissanteAux(0);
    }

    public Cellule ajout(Employe e) {
        if (e.getSalaire() <= this.emp.getSalaire()) {
            return new Cellule(e, new Cellule(emp, suivant));
        }
        if (suivant == null) {
            return new Cellule(e);
        }
        // si salaire de e > emp et il reste des employés
        return new Cellule(emp, suivant.ajout(e));
    }

    public Cellule choixSalaire(int min, int max, Entreprise entreprise) {
        int s = emp.getSalaire();
        boolean risee = min <= s && s <= max;
        if (risee) {
            entreprise.ajout(emp);
            if (suivant == null) {
                return null;
            } else {
                return suivant.choixSalaire(min, max, entreprise);
            }
        }
        if (suivant == null) {
            return new Cellule(emp, null);
        } else {
            return new Cellule(emp, suivant.choixSalaire(min, max, entreprise));
        }

    }
}
