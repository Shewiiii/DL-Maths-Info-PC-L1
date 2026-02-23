package IP2.TP.TP5.Old;

/*
 * Module Josephe:
 *
 * Programme pour resoudre le problème de Josèphe Flavius 
 * dans la formulation de Donald Knuth (méthode statique)
 *
 * Dernière mise à jour: 15/02/2025
 */

public class Josephe {

  public static int josephe(int n) {

    RoundTable rt = new RoundTable(n); // configuration initiale

    while (rt.numberOfKnights() > 1) { // tant qu'il y a plus qu'un chevalier à table

      RoundTable ext = rt.serveNeighbour(); // un chevalier est servi et s'en va
      rt = ext.passJug(); // la carafe est passée au prochain
    }
    return rt.knightWithJug(); // à la fin, il ne reste qu'un chevalier assis
  }

  public static void main(String args[]) {

    // int n = Integer.parseInt( args[0] ); // l'argument est passé en ligne de
    // commande
    int n = 10;

    for (int k = 1; k <= n; k = k + 1) {
      System.out.println(josephe(k));
    }
  }

} // classe Josephus
