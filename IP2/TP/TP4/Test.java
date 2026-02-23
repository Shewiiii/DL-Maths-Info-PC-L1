package IP2.TP.TP4;

public class Test {
    public static void main(String[] args) {
        IntFList empty = IntFList.EMPTY_INTLIST;
        IntFList l1 = empty.cons(3).cons(2).cons(1);
        IntFList l2 = IntFList.range(1, 4);
        System.out.println("On pose: \nl1 = " + l1 + "\nl2 = " + l2);

        System.out.println("range(1, 3) = " + IntFList.range(1, 3) + " (reponse (1, 2))");
        System.out.println("l1.cons(10) = " + l1.cons(10) + " (reponse (10, 1, 2, 3))");

        System.out.println("l1.isEmpty() = " + l1.isEmpty() + " (reponse false)");
        System.out.println("empty.isEmpty() = " + empty.isEmpty() + " (reponse true)");
        System.out.println("l1.head() = " + l1.head() + " (reponse 1)");
        System.out.println("l1.tail() = " + l1.tail() + " (reponse (2, 3))");
        System.out.println("l1.listRef(2) = " + l1.listRef(2) + " (reponse 3)");

        System.out.println("l1.length() = " + l1.length() + " (reponse 3)");
        System.out.println("l1.sum() = " + l1.sum() + " (reponse 6)");
        System.out.println("l1.contains(2) = " + l1.contains(2) + " (reponse true)");
        System.out.println("l1.contains(5) = " + l1.contains(5) + " (reponse false)");
        System.out.println("l1.ordered() = " + l1.ordered() + " (reponse true)");
        System.out.println(
                "Liste (2, 1, 3) ordonnée ? " + new IntFList().cons(3).cons(1).cons(2).ordered() + " (reponse false)");

        System.out.println("l1.add(4) = " + l1.add(4) + " (reponse (1, 2, 3, 4))");
        System.out.println("l1.append(l1) = " + l1.append(l1) + " (reponse (1, 2, 3, 1, 2, 3))");
        System.out.println("l1.reverse() = " + l1.reverse() + " (reponse (3, 2, 1))");
        System.out.println("l1.remove(2) = " + l1.remove(2) + " (reponse (1, 3))");

        System.out.println("l1.equals(l2) ? " + l1.equals(l2) + " (reponse true)");
        System.out.println("l1.equals((1, 2)) ? " + l1.equals(l1.remove(3)) + " (reponse false)");
    }
}