package IP2.TD2;

public class Pot {
    Confiture confiture;
    int quantite;
    int numero;
    static int compteurPots;

    Pot(Confiture confiture, int quantite) {
        this.confiture = confiture;
        this.quantite = quantite;
        Pot.compteurPots++;
        this.numero = compteurPots;
    }

    public String description() {
        return this.confiture.description();
    }

    public static int dernierNumero() {
        return Pot.compteurPots;
    }

}
