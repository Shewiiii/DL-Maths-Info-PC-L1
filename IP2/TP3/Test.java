package IP2.TP3;

public class Test {
    public static void main(String[] args) {
        // Exercice 1
        Utilisateur u = new Utilisateur("Shewi", "exempleMdp114514", "exemple@jsp.com");
        System.out.println(u.getPseudonyme());
        System.out.println(u.setPseudonyme("Shewi2", "exempleMdp114514"));
        System.out.println(u.getPseudonyme());
        System.out.println(u.changerMotDePasse("exemple@jsp.com", "mauvaisMdp", "unNouveauMotDePasse"));
        System.out.println(u.changerMotDePasse("exemple@jsp.com", "exempleMdp114514", "unNouveauMotDePasse"));
        System.out.println("\n");

        // Exercice 2
        Message m = new Message(7103108, 1001, 200, "SennaTop", "Nice game", "15/05/25");
        System.out.println(m);
        m.editerMessage("Ark mite");
        System.out.println(m.getContenu());
        System.out.println("\n");

        // Exercice 3
        Salon s = new Salon();
        s.ajouterUtilisateur("Joe");
        s.ajouterUtilisateur("Jack");
        s.ajouterUtilisateur("Alan");
        s.ajouterMessage("Joe", "Bonjour à tous !");
        s.ajouterMessage("Jack", "Bonjour à toi.");
        s.ajouterMessage("Alan", "Comment allez vous ?");
        s.afficher();
        System.out.println(s.indexLibreMessage + " " + s.indexLibreUtilisateur);
        s.ban("Jack");
        System.out.println("\nNouveau historique de messages sans Jack:");
        s.afficher();
        System.out.println(s.indexLibreMessage + " " + s.indexLibreUtilisateur);
        System.out.println("\n");

        // Exercice 4
        Chat c = new Chat();
        for (int i = 0; i < 5; i++) {
            c.ajouterSalon();
            s = c.salons[i];
            s.ajouterUtilisateur("Joe");
            s.ajouterUtilisateur("Jack");
            s.ajouterUtilisateur("Alan");
            s.ajouterMessage("Joe", "Bonjour à tous !");
            s.ajouterMessage("Jack", "Bonjour à toi.");
            s.ajouterMessage("Alan", "Comment allez vous ?");
            s.ajouterMessage("Joe", "Très bien et toi ?"); //
        }
        System.out.println("Nombre de messages envoyé par Jack dans le chat: " + c.nombreMessages("Jack"));
        System.out.println("Nombre de messages envoyé par Joe dans le chat: " + c.nombreMessages("Joe"));
        System.out.println("Utilisateur le plus bavard: " + c.bavard());

    }
}
