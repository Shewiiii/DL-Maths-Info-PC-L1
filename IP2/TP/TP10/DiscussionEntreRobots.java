package IP2.TP.TP10;

public class DiscussionEntreRobots {
    public static void discussionEntreRob(TableRonde table) {
        Cellrob curseur = table.courant;
        while (!(curseur.suiv == curseur && curseur.prec == curseur && curseur.rob.getNp() == 0)) {
            curseur.rob.parle(5);
            if (curseur.rob.getNp() == 0) {
                table.supprimer(curseur.rob.getId());
            }
            curseur = curseur.suiv;
        }
    }

    public static void main(String[] args) {
        Robot rob = new Robot('a', "aaaaaaaaaaaaaaaa"); // 16 caractères
        TableRonde tb = new TableRonde(rob);
        tb.ajouteRob(new Robot('b', "bbbbbbbbbbbbbbbb"));
        tb.ajouteRob(new Robot('c', "cccccccccccccccc"));
        tb.ajouteRob(new Robot('d', "ddddddddddddddddd")); // 17
        discussionEntreRob(tb);
    }
}
