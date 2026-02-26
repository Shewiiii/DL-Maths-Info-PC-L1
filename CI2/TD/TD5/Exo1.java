package TD.TD5;

public class Exo1 {
    public static void main(String[] args) {
        int n = 5; // 0: move R0
        if (n % 2 == 0) { // 1: move R2 + 2: mod R2
            System.out.println("Pair"); // 3: jump eq + 4: print + 5: jump
        } else {
            System.out.println("Impair"); // 6: print + 7: jump
        }
        System.out.println("Au revoir !"); // 8: print
        // 9: halt
    }
}

/* Code assembleur
0: move R0, 5
1: move R2, R0
2: mod R2, R2, 2
3: jump_eq R2, 1, 6
4: print("Pair")
5: jump 8
6: println("Impair")
7: println("Au revoir !")
8: halt
 */