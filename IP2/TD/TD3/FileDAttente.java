package IP2.TD.TD3;

// Pas fini: Question 9

public class FileDAttente {
    String[] clientsPossibles;
    int premierePlaceLibre;

    FileDAttente() {
        this.clientsPossibles = new String[10];
        this.premierePlaceLibre = 0;
    }

    public int getTaille() {
        return premierePlaceLibre;
    }

    public boolean estDansFile(Client x) {
        for (int i = 0; i < premierePlaceLibre; i++) {
            if (clientsPossibles[i].equals(x.toString())) {
                return true;
            }
        }
        return false;
    }

    public boolean ajouterClient(Client x) {
        if (estDansFile(x) || premierePlaceLibre >= clientsPossibles.length) {
            return false;
        }
        clientsPossibles[premierePlaceLibre] = x.toString();
        premierePlaceLibre++;
        return true;
    }

    public void desiste(Client x) {
        for (int i = 0; i < premierePlaceLibre; i++) {
            if (clientsPossibles[i].equals(x.toString())) {
                int j;
                for (j = i; j < premierePlaceLibre - 1; j++) {
                    clientsPossibles[j] = clientsPossibles[j + 1];
                }
                clientsPossibles[j + 1] = null;
                premierePlaceLibre--;
                break;
            }
        }
    }

    public void afficher() {
        for (int i = 0; i < premierePlaceLibre; i++) {
            System.out.println(i+1 + ". " + clientsPossibles[i]);
        }
    }
}
