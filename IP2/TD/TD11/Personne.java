package IP2.TD.TD11;

public class Personne {
    private final String prenom, nomDeFamille;
    private Personne mere, pere;

    public Personne(String prenom, String nomDeFamille) {
        this.prenom = prenom;
        this.nomDeFamille = nomDeFamille;
    }

    public Personne(String prenom, String nomDeFamille, Personne pere, Personne mere) {
        this.prenom = prenom;
        this.nomDeFamille = nomDeFamille;
        this.pere = pere;
        this.mere = mere;
    }

    public boolean estFrereOuSoeur(Personne p) {
        if (p == null) { //
            return false;
        }
        return (this != p //
                && ((mere != null && mere == p.mere) || (pere != null && pere == p.pere)));
    }

    public boolean estCousinGermain(Personne p) {
        if (p == null) {
            return false;
        }
        return (mere != null && (mere.estFrereOuSoeur(p.pere) ||
                mere.estFrereOuSoeur(p.mere))
                || pere != null && (pere.estFrereOuSoeur(p.pere) ||
                        pere.estFrereOuSoeur(p.mere)));
    }

    public int nbAscendants() {
        int compte = 0;
        if (pere != null) {
            compte += 1 + pere.nbAscendants();
        }
        if (mere != null) {
            compte += 1 + mere.nbAscendants(); //
        }
        return compte;
    }

    public boolean possedeCommeAscendant(Personne p) {
        if (p == null) {
            return false;
        }
        if (this == p) {
            return true;
        }
        // boolean c = false;
        // if (mere != null) {
        // c = mere.possedeCommeAscendant(p);
        // }
        // if (!c && pere != null) {
        // c = pere.possedeCommeAscendant(p);
        // }
        return (mere != null && mere.possedeCommeAscendant(p))
                || (pere != null && pere.possedeCommeAscendant(p));
    }

    public int distanceDAscendance(Personne p) {
        if (p == null) {
            return -1;
        }
        int reponse = distanceDAscendanceAux(p, 0);
        if (reponse == -1) {
            reponse = p.distanceDAscendanceAux(this, 0); // Car this peut être au dessus dans l'arbre
        }
        return reponse;
    }

    private int distanceDAscendanceAux(Personne p, int compteur) {
        if (this == p) {
            return compteur;
        }
        int reponse = -1;
        if (mere != null) {
            reponse = mere.distanceDAscendanceAux(p, compteur + 1);
        }
        if (reponse == -1 && pere != null) {
            reponse = pere.distanceDAscendanceAux(p, compteur + 1);
        }
        return reponse;
    }

    public void afficheAscendantUn(Personne p) {
        if (p == null) {
            return;
        }
        afficheAscendantUnAux(p, this.prenom + " " + this.nomDeFamille);

    }

    public boolean afficheAscendantUnAux(Personne p, String acc) {
        if (this == p) {
            System.out.println(acc);
            return true;
        }
        boolean reponse = false;
        if (mere != null) {
            reponse = mere.afficheAscendantUnAux(p,
                    acc + ", enfant de " + mere.prenom + " " + mere.nomDeFamille);
        }
        if (!reponse && pere != null) {
            reponse = pere.afficheAscendantUnAux(p,
                    acc + ", enfant de " + pere.prenom + " " + pere.nomDeFamille);
        }
        return reponse;
    }

    public int nbDeGenerations() {
        if (mere == null && pere == null) {
            return 0;
        }

        if (mere == null) {
            return 1 + pere.nbDeGenerations();
        }

        if (pere == null) {
            return 1 + mere.nbDeGenerations();
        }

        return 1 + Integer.max(mere.nbDeGenerations(), pere.nbDeGenerations());
    }

    public boolean verification() {
        boolean pereNull = pere == null;
        boolean mereNull = mere == null;
        if (mereNull && pereNull) {
            return true;
        }
        if (!pereNull && !pere.nomDeFamille.equals(this.nomDeFamille)) {
            return false;
        }
        if (!pereNull && (pere.estCousinGermain(mere) || pere.estFrereOuSoeur(mere))) {
            return false;
        }
        boolean reponse = true;
        if (!mereNull) {
            reponse = this.mere.verification();
        }
        if (reponse && !pereNull) {
            reponse = this.pere.verification();
        }
        return reponse;
    }

    public static void main(String[] args) {
        Personne p = new Personne(
                "1", "1",
                new Personne(
                        "11", "11",
                        new Personne("21", "21"),
                        new Personne("22", "22")),
                new Personne(
                        "12", "12",
                        new Personne("22", "22"),
                        new Personne("23", "24")));
        Personne p22 = p.pere.mere;
        System.out.println(p.nbDeGenerations());
        p.afficheAscendantUn(p22);
    }
}
