package IP2.TD.TD2;

public class Test {
    public static void main(String[] args) {
        Confiture c = new Confiture("cerise", 11, 4514);
        System.out.println(c.description());

        Confiture c1 = new Confiture("fraise", 50, 120);
        Confiture c2 = new Confiture("fraise", 50, 120);
        System.out.println(c1.egal(c2));
        System.out.println(c1 == c2); // Mauvais moyen de comparer les deux fruits
        System.out.println(c1.fruit);
        // Toutes les lignes ci-dessus compilent cependant.

        Pot p1 = new Pot(c, 67);
        new Pot(c, 567419);
        System.out.println(p1.description());
        System.out.println("Dernier numéro de pot: " + Pot.dernierNumero());
    }
}
