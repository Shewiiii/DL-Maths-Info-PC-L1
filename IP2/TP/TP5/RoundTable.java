package IP2.TP.TP5;
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

import java.util.LinkedList;

public class RoundTable {
    private LinkedList<Knight> knights;
    private Knight jug;
    // "num" correspond maintenant à la taille de la liste chainée knights+1

    // ----- Constructeur publique

    public RoundTable(int n) { // création d'une table
                               // avec n chevaliers
        jug = new Knight();
        knights = new LinkedList<>();
        for (int i = 0; i < n - 1; i++) {
            knights.add(new Knight());
        }
    }
    // ----- Méthodes du protocole: informations sur la configuration

    public int numberOfKnights() { // nombre de chevaliers assis
        return knights.size() + 1;
    }

    public Knight knightWithJug() { // etiquette du chevalier avec la carafe
        return jug;
    }

    // ----- Méthodes du protocole: génération de configurations successives

    public void serveNeighbour() { // sert le chevalier assis à gauche
        if (numberOfKnights() > 1) {
            knights.remove(0);
        }
    }

    public void passJug() { // passe la carafe au prochain chevalier
        if (numberOfKnights() == 1) {
            return;
        }
        knights.add(jug); // à la fin
        jug = knights.remove(0); // le premier encore présent obtient la carrafe
    }

    public String toString() {
        return numberOfKnights() + " (" + jug.getId() + knights.toString() + ")";
    }

} // classe RoundTable
