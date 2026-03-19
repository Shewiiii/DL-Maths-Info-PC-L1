package TD.TD7;

public class Test {
    public static void modify(int[] tab) {
        tab[0] = 7;
        tab = new int[10];
        System.out.println(" Dans modify : tab = " + tab);
    }

    public static void main(String[] args) {
        int[] tab = new int[3];
        modify(tab);
        System.out.println(" Dans main : tab [0] = " + tab[0]);
        System.out.println(" Dans main : tab = " + tab);
    }
}
