package IP2.TP.TP5;

/*
 * Module Josephe:
 *
 * Programme pour resoudre le problème de Josèphe Flavius 
 * dans la formulation de Donald Knuth (méthode statique)
 *
 * Dernière mise à jour: 15/02/2025
 */

public class Josephe {

  public static Knight josephe(int n) {

    RoundTable rt = new RoundTable(n); // configuration initiale

    while (rt.numberOfKnights() > 1) { // tant qu'il y a plus qu'un chevalier à table

      rt.serveNeighbour(); // un chevalier est servi et s'en va
      rt.passJug(); // la carafe est passée au prochain
    }
    return rt.knightWithJug(); // à la fin, il ne reste qu'un chevalier assis
  }

  public static void main(String args[]) {

    // int n = Integer.parseInt(args[0]); // l'argument est passé en ligne de commande
    int n = 10;

    for (int k = 1; k <= n; k = k + 1) {
      Knight.reset();
      System.out.println(josephe(k));
    }
  }

} // classe Josephus

// Je ne sais pas comment proprement tester la vitesse des deux versions sou windows, mais la seconde utilisant les listes
// chainées mutables est probablement plus rapide:
// - on ne recopie pas l'entièreté de la liste+contenue dans une autre adresse dans le tas
//   - dans la version 1, serveNeighbour et passJug par exemple possèdent une complexité en temps en O(n) sur la taille de l'entrée
//   - dans la version 2, ils sont en O(1)
// - le garbage collector a moins de travail à faire
