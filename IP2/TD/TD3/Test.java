package IP2.TD.TD3;

public class Test {
    public static void main(String[] args) {
        Client a = new Client("Jack", "Nothes");
        Client b = new Client("Shewi", "Shewi");
        Client c = new Client("LONKULADE", "Tuff");
        Client d = new Client("Senna-Top", "Wtf");

        FileDAttente f = new FileDAttente();
        f.ajouterClient(a);
        f.ajouterClient(b);
        f.ajouterClient(c);
        f.ajouterClient(d);
        f.afficher();
        f.desiste(b);
        System.out.println("\nAprès désistement de Shewi");
        f.afficher();
    }
}
