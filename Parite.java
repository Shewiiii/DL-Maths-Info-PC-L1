public class Parite {
    public static void pair(int n) { // on suppose que n >= 0
        if (n == 0) {
            System.out.println(" Oui ");
        } else {
            impair(n - 1);
        }
    }

    public static void impair(int n) { // on suppose que n >= 0
        if (n == 0) {
            System.out.println(" Non ");
        } else {
            pair(n - 1);
        }
    }

    public static void main(String[] args) {
        pair(5); 
        impair(5);
    }
}