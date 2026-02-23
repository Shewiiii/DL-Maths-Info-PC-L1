package IP2.TP.TP3;

public class Salon {
    String[] tabUtilisateur;
    String[] tabMessage;
    int indexLibreMessage;
    int indexLibreUtilisateur;

    Salon() {
        this.tabUtilisateur = new String[10];
        this.tabMessage = new String[10];
        this.indexLibreMessage = 0;
        this.indexLibreUtilisateur = 0;
    }

    public boolean estPresent(String utilisateur) {
        for (int i = 0; i <= indexLibreUtilisateur; i++) {
            if (utilisateur.equals(tabUtilisateur[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean ajouterUtilisateur(String utilisateur) {
        if (estPresent(utilisateur) || indexLibreUtilisateur >= 9) {
            return false;
        }

        tabUtilisateur[indexLibreUtilisateur] = utilisateur;
        indexLibreUtilisateur++;
        return true;
    }

    public boolean ajouterMessage(String utilisateur, String contenu) {
        if (!estPresent(utilisateur) || indexLibreMessage >= 9) {
            return false;
        }

        tabMessage[indexLibreMessage] = utilisateur + ": " + contenu;
        indexLibreMessage++;
        return true;
    }

    public void afficher() {
        for (int i = 0; i < indexLibreMessage; i++) {
            System.out.println(tabMessage[i]);
        }
    }

    public boolean ban(String utilisateurABan) {
        if (!estPresent(utilisateurABan)) {
            return false;
        }

        // Nouveau tableau sans cet utilisateur
        String[] nouveauTabUtilisateurs = new String[10];
        int i = 0;
        for (int j = 0; j < indexLibreUtilisateur; j++) {
            if (!tabUtilisateur[j].equals(utilisateurABan)) {
                nouveauTabUtilisateurs[i] = tabUtilisateur[j];
                i++;
            }
        }
        this.tabUtilisateur = nouveauTabUtilisateurs;
        this.indexLibreUtilisateur = i;

        // On enleve ses messages
        String[] nouveauTabMessage = new String[10];
        i = 0;
        for (int j = 0; j < indexLibreMessage; j++) {
            if (!tabMessage[j].startsWith(utilisateurABan)) {
                nouveauTabMessage[i] = tabMessage[j];
                i++;
            }
        }
        this.tabMessage = nouveauTabMessage;
        this.indexLibreMessage = i;

        return true;
    }
}
