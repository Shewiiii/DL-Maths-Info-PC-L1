package TD.TD5;

public class Exo2 {
    public static void main(String[] args) {
        int a = 12; // 0: move RO
        int b = 25; // 1: move R1
        int c = 18; // 2: move R2

        if (a > b && a > c) { // 3: jump_le R0, R1, 7
                              // 4: jump_le R0, R2, 7
            System.out.println("Le maximum est: " + a); // 5, 6: print + jump
        } else if (b >= a && b > c) {                   // 7: jump_l, R1, R0, 11
                                                        // 8: jump_le, R1, R2, 11
            System.out.println("Le maximum est: " + b); // 9: print
                                                        // 10: jump
        } else {                                        // 11: print
            System.out.println("Le maximum est: " + c); //  halt
        }
    }
}

/*
0: move R0, 12
1: move R1, 25
2: move R2, 18
3: jump_le R0, R1, 7
4: jump_le R0, R2, 7
5: print("Le max est " + R0)
6: jump 12
7: jump_l R1,R0,11
8: jump_le R1, R2, 11
9: print("Le max est " + R1)
10: jump 12
11: print("Le max est " + R2)
12: halt
*/