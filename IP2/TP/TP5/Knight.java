package IP2.TP.TP5;

public class Knight {
    private final int id;
    private static int total;

    Knight() {
        total++;
        id = total;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "C" + id;
    }

    // Statique
    public static void reset() {
        Knight.total = 0;
    }
}