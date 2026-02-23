package IP2.TP.TP5.Old;

import IP2.TP.TP5.IntFList;

/*
 * Classe RoundTable:
 *
 * Modèle à la base du problème de Josèphe Flavius
 * (revue en termes des chevaliers assis à table)
 *
 * Les objets créés sont "immuables".
 *
 * Dernière mise à jour: 15/02/2025
 *
 *
 * Protocole:
 *
 *   RoundTable ini = new RoundTable( n );
 *
 *   RoundTable cfg ...
 *
 *     cfg.numberOfKnights() :  int
 *     cfg.kinghtWithJug()   :  int  (etiquette)
 *
 *     cfg.serveNeighbour()  :  RoundTable
 *     cfg.passJug()         :  RoundTable
 */

public class RoundTable {

    // ----- Representation interne du modèle : privé!
    // objets immuables : final

    private final int num; // nombre de chevaliers à table
    private final int jug; // etiquette du chevalier avec la carafe
    private final IntFList others; // liste des autres chevaliers (numérotés)

    // ----- Constructeur publique

    public RoundTable(int n) { // création d'une table
                               // avec n chevaliers
        num = n;
        jug = 1;
        others = range(2, n);
        System.out.println(this.toString());
    }

    // ----- Constructeur privé

    private RoundTable(int n, int j, IntFList o) {
        num = n;
        jug = j;
        others = o;
    }

    // ----- Méthodes du protocole: informations sur la configuration

    public int numberOfKnights() { // nombre de chevaliers assis
        return num;
    }

    public int knightWithJug() { // etiquette du chevalier avec la carafe
        return jug;
    }

    // ----- Méthodes du protocole: génération de configurations successives

    public RoundTable serveNeighbour() { // sert le chevalier assis à gauche
        if (num > 1) {
            return new RoundTable(num - 1, jug, others.tail());
        }
        return this;
    }

    public RoundTable passJug() { // passe la carafe au prochain chevalier
        if (num == 1) {
            return this;
        }
        IntFList last = IntFList.EMPTY_INTLIST.cons(jug); // Celui qui tient la carrafe
        IntFList list = others.tail().append(last); // On met à la fin celui qui a servi
        System.out.println(this.toString());
        return new RoundTable(num, others.head(), list);
    }

    // ----- Procedure interne de support (privé!)

    private static IntFList range(int inf, int sup) {
        if (inf > sup) {
            return new IntFList();
        }
        return new IntFList(inf, range(inf + 1, sup));
    }

    public String toString() {
        return num + " (" + jug + ", " + others.toString() + ")";
    }

}
// classe RoundTable
