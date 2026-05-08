package TD.TD12;

public class Exo2 {
    public static boolean f(int a, int b) {
        b++; // 200: add [SP-2], [SP-2], 1
            // 201: push [SP-3]
            // 202: sub [SP-1], [SP-1], [SP-3]
            // move R0, 0
            // 203: jump_l [SP-1], 0, 205 ???
            // 204: add R0, 1
            // 205: ret
        return a < b;
    }

    public static boolean g(int m, int n) {
        boolean u = false; // 100: push 0
        while (f(m, n)) { // 100: push [SP-4], 101: push [SP-3] 102: call 200, 103: pop 2, 104: jump_neq R0 1 ? 
            m++;   // 102: add [SP-4], [SP-4], 1
            n--;   // 103: sub [SP-3], [SP-3], 1
            u = !u; //, 104: add [SP-1], [SP-1], 1, 105: mod [SP-1], [SP-1], 2
            // 105: move R1, [SP-1]
        }
        return u;
    }

    public static void main(String[] args) {
        int x = 0; // 0: push 0
        for (int y = 0; y < 6; y++) { // 1: push 0; 2: jump_ge [SP-1], 6, 7
            System.out.println(g(x, y)); // 3: push [SP-2], 4: push [SP-1], 5: call 100, 6: pop 2, 8: jump 2, 9: halt
        }
    }
}
// Commentaires FAUX, voir code dans fichier md