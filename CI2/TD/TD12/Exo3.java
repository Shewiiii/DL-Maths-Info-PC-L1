package TD.TD12;

public class Exo3 {
    public static void sousChainesAux(String s, String prefixe) {
        if (s.equals("")) {
            System.out.println(prefixe);
            return;
        }
        String c = "" + s.charAt(0);
        String reste = s.substring(1);
        // On choisit de prendre c
        sousChainesAux(reste, prefixe + c);
        // Ou pas
        sousChainesAux(reste, prefixe);
    }

    public static void sousChaines(String s) {
        sousChainesAux(s, "");
    }

    public static void main(String[] args) {
        // sousChainesAux("abc", "toto");
        sousChaines("abc");
    }
}
