package TD.TD6;

public class Test {
    public static int somme(int[] tab) {
        int sum = 0;
        int i = 0;
        while (i < 5 && sum <= 50) {
            sum += tab[i];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] tab = { 11, 22, 33, 44, 55 };
        System.out.println(" Somme = " + somme(tab));
    }
}
