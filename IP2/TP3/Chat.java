package IP2.TP3;

public class Chat {
    Salon[] salons;
    int indexLibreSalon;

    Chat() {
        this.salons = new Salon[10];
        this.indexLibreSalon = 0;
    }

    public boolean ajouterSalon() {
        Salon s = new Salon();
        salons[indexLibreSalon] = s;
        indexLibreSalon++;
        return true;
    }

    public boolean estPresent(String utilisateur) {
        for (int i = 0; i < indexLibreSalon; i++) {
            if (salons[i].estPresent(utilisateur)) {
                return true;
            }
        }
        return false;
    }

    public int nombreMessages(String utilisateur) {
        int total = 0;
        for (int i = 0; i < indexLibreSalon; i++) {
            Salon salon = this.salons[i];

            for (int j = 0; j < salon.indexLibreMessage; j++) {
                if (salon.tabMessage[j].startsWith(utilisateur)) {
                    total++;
                }
            }
        }
        return total;
    }

    public String bavard() {
        String bavard = "";
        int maxMessages = 0;
        for (int i = 0; i < indexLibreSalon; i++) {
            Salon salon = this.salons[i];

            for (int j = 0; j < salon.indexLibreMessage; j++) {
                String message = salon.tabMessage[j];
                String utilisateur = message.split(":")[0]; // pour avoir juste le nom
                int nbMessagesUtilisateur = nombreMessages(utilisateur);
                if (nbMessagesUtilisateur > maxMessages) {
                    maxMessages = nbMessagesUtilisateur;
                    bavard = utilisateur;
                }
            }
        }
        return bavard;
    }
}
