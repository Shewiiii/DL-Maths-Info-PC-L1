package IP2.TD.TD2;

public class Confiture {
    final String fruit;
    int proportion;
    int cal;

    Confiture(String fruit, int proportion, int cal) {
        this.fruit = fruit;
        this.proportion = proportion;
        this.cal = cal;
    }

    Confiture(String fruit, int cal) {
        this(fruit, 50, cal);
    }

    // Getter
    public String getFruit() {
        return this.fruit;
    }

    // Setter
    public void setCal(int newCal) {
        this.cal = newCal;
    }

    public String description() {
        return "Confiture de " + this.fruit + ", " + this.proportion + "% de fruit, " + this.cal
                + " calories aux 100 grammes.";
    }

    public boolean egal(Confiture c) {
        return this.fruit.equals(c.fruit) && this.proportion == c.proportion && this.cal == c.cal;
    }

}
