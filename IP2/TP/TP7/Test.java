package IP2.TP.TP7;

public class Test {
    public static void main(String[] args) {
        Groupe groupe = new Groupe();
        Robot r1 = new Robot('a', "Salut");
        Robot r2 = new Robot('b', "Bonjour");
        groupe.ajouteNouveau(r1);
        groupe.ajouteNouveau(r2);
        groupe.chantez();
    }
}
