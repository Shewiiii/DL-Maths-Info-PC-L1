package IP2.TP.TP10;

public class Cellrob {
    Cellrob prec;
    Robot rob;
    Cellrob suiv;

    Cellrob(Cellrob prec, Robot rob, Cellrob suiv) {
        this.prec = prec;
        this.rob = rob;
        this.suiv = suiv;
    }
}
