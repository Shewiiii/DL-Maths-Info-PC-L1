public class Fibo {
    public static long fiboAux(int i, int n, long u1, long u2) {
        if (n == 0)
            return (long) 0;
        if (i == n) {
            return u1;
        }
        return fiboAux(i + 1, n, u2, u1 + u2);
    }

    public static long fibo(int n) {
        return fiboAux(0, n, 0, 1);
    }

    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
}
