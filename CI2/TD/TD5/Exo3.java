package TD.TD5;

public class Exo3 {
    public static void main(String[] args) {
        int n = 1024;           // 0:move R0, 1024
        int res = 0; // R1
        int sum = 0; // R2
        for (int i = 1;         // 1: move R3, 1
                                // 2: add R4, R2, R3 
            sum + i <= n;       // 3: jump_g R4, R0, 8
            i += 2              // 6: après: add R3, R3, 2
        ) {
            sum += i;           // 4: add R2, R2, R3
            res++;              // 5: add R1, R1, 1
                                // 7: jump 2
        }
        System.out.println("Résultat: " + res); // 8: print
        //9: halt
    }
}

/*
0: move R0, 1024
1: move R3, 1
2: add R4, R2, R3
3: jump_g R4, R0, 8
4: add R2, R2, R3
5: add R1, R1, 1
6: add R3, R3, 2
7: jump 2
8: print("Résultat: " + R1)
9: halt
*/