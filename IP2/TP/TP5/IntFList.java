package IP2.TP.TP5;

public class IntFList { // "Functional" Lists of int

  // ----- Costante liste vide (partagée)

  public static final IntFList EMPTY_INTLIST = new IntFList();

  // ----- Représentation interne d'une liste : privé !

  private final boolean empty; // objets immutables:
  private final int first; // variables d'instance "final"
  private final IntFList rest;

  // ----- Opérations de base sur les listes

  public IntFList() { // creation d'une liste vide
    empty = true;
    first = 0; // valeur inutile en ce cas
    rest = null;
  }

  public IntFList(int e, IntFList il) { // création d'une liste non-vide:
    empty = false;
    first = e;
    rest = il;
  }

  public boolean isEmpty() { // vérifie si une liste est vide
    return empty;
  }

  public int head() { // premier element de la liste
    return first; // on assume: la liste est non vide
  }

  public IntFList tail() { // le reste de la liste
    return rest; // on assume: la liste est non vide
  }

  // ----- Définition dynamique du "cons"

  public IntFList cons(int e) { // construction de nouvelles listes
    return new IntFList(e, this);
  }

  // ----- Opérations

  public int length() { // longueur de la liste

    if (isEmpty()) {
      return 0;
    } else {
      return (1 + tail().length());
    }
  }

  public int listRef(int k) { // element en position k
    if (k == 0) {
      return head();
    } else {
      return (tail().listRef(k - 1));

    }
  }

  public boolean equals(IntFList il) { // comparaisons de listes
    if (isEmpty() || il.isEmpty()) {
      return (isEmpty() && il.isEmpty());
    } else if (head() == il.head()) {
      return tail().equals(il.tail());
    } else {
      return false;
    }
  }

  public IntFList append(IntFList il) { // fusione di liste
                                        // Scheme: append
    if (isEmpty()) {
      return il;
    } else {
      // return new IntFList( head(), tail().append(il) );
      return (tail().append(il)).cons(head());
    }
  }

  public IntFList reverse() { // reverse d'une liste
                              // Scheme: reverse
    return reverseRec(new IntFList());
  }

  private IntFList reverseRec(IntFList re) {

    if (isEmpty()) { // méthode de support : privée!
      return re;
    } else {
      // return tail().reverseRec( new IntFList(head(),re) );
      return tail().reverseRec(re.cons(head()));
    }
  }

  // ----- Rappresentazione testuale (String) di una lista

  public String toString() { // redefinition de la méthode generale
                             // pour la visualisation textuelle
    if (isEmpty()) {
      return "()";
    } else {
      String rep = "(" + head();
      IntFList r = tail();
      while (!r.isEmpty()) {
        rep = rep + ", " + r.head();
        r = r.tail();
      }
      return (rep + ")");
    }
  }

} // class IntFList
