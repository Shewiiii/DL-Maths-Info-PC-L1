package TD.TD5;

public class Exo4 {
    public static void main(String[] args) {
        int[] t = new int[10];
        for (int i = 0; i < 10; i++) {
            t[i] = i * i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(t[i]);
        }
    }
}

/*
0: malloc R0, 10
1: move R1, 0
2: jump_ge R1, 10, 6
3: mul [R0+R1], R1, R1
4: add R1, R1, 1
5: jump 2
6: move R1, 0
7: jump_ge R1, 10, 11
8: println([R0+R1])
9: add R1, R1, 1
10: jump 7
11: halt
*/