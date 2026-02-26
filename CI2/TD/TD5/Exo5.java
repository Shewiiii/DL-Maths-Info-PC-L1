package TD.TD5;

public class Exo5 {
    public static void main(String[] args) {
        int[] a = { 4, 8, 15, 16 };
        int[] b = { 23, 42 };
        int[] c = a;
        a[2] = 0;
        a = b;
        b = c;
        c[1] = a[1] + b[1];
        System.out.println(b[1]);
    }
}

/*
0: malloc R0, 4
1: malloc R1, 2
2: move R2, R0
3: move [R0], 4
4: move [R0+1], 8
5: move [R0+2], 15
6: move [R0+3], 16
7: move [R1], 23
8: move [R1+1], 42
9: move [R0+2], 0
10: move R0, R1
11: move R1, R2
12: add [R2+1], [R0+1], [R1+1]
13: println([R1+1])
14: halt
*/