package IP2.TP.TP4;

public class IntFList {
    public static final IntFList EMPTY_INTLIST = new IntFList();
    private final boolean empty;
    private final int first;
    private final IntFList rest;
    // On utilise final car notre liste (chainée) est immuable

    IntFList() {
        empty = true;
        first = 0;
        rest = null;
    }

    IntFList(int e, IntFList l1) {
        empty = false;
        first = e;
        rest = l1;
    }

    public boolean isEmpty() {
        return empty;
    }

    public int head() {
        return first;
    }

    public IntFList tail() {
        return rest;
    }

    public IntFList cons(int e) {
        return new IntFList(e, this);
    }

    public IntFList add(int e) {
        if (this.isEmpty()) {
            return this.cons(e);
        }
        return new IntFList(this.first, this.rest.add(e));
    }

    public int length() {
        if (this.isEmpty()) {
            return 0;
        }
        return 1 + this.rest.length();
    }

    public int sum() {
        if (this.isEmpty()) {
            return 0;
        }
        return this.first + this.rest.sum();
    }

    public boolean ordered() {
        if (this.isEmpty() || this.rest.isEmpty()) {
            return true;
        }
        return this.first <= this.rest.first && this.rest.ordered();
    }

    public int listRef(int k) {
        if (this.isEmpty()) {
            return -1;
        }
        if (k <= 0) {
            return this.first;
        }
        return this.rest.listRef(k - 1);
    }

    public boolean contains(int e) {
        if (this.isEmpty()) {
            return false;
        }
        return this.first == e || this.rest.contains(e);
    }

    public IntFList remove(int e) {
        if (this.isEmpty()) {
            return this;
        }
        if (this.first == e) {
            return this.rest;
        }
        return new IntFList(this.first, this.rest.remove(e));
    }

    public IntFList remove_last(int e) {
        if (this.isEmpty()) {
            return this;
        }
        if (this.first == e && !this.rest.contains(e)) {
            return this.rest;
        }
        return new IntFList(this.first, this.rest.remove_last(e));
    }

    private String toStringRec() {
        if (this.isEmpty()) {
            return "";
        }
        if (this.rest.isEmpty()) {
            return String.valueOf(this.first);
        }
        return this.first + ", " + this.rest.toStringRec();
    }

    @Override
    public String toString() {
        return "(" + toStringRec() + ")";
    }

    public IntFList append(IntFList il) {
        if (this.isEmpty()) {
            return il;
        }
        return new IntFList(this.first, this.rest.append(il));
    }

    private static IntFList reverseRec(IntFList acc, IntFList l) {
        if (l.isEmpty()) {
            return acc;
        }
        return reverseRec(acc.cons(l.first), l.rest);
    }

    public IntFList reverse() {
        return reverseRec(new IntFList(), this);
    }

    public boolean equals(IntFList il) {
        if (this.isEmpty() && il.isEmpty()) {
            return true;
        }
        return this.first == il.first && this.rest.equals(il.rest);
    }

    public static IntFList range(int inf, int sup) {
        if (inf >= sup) {
            return new IntFList();
        }
        return new IntFList(inf, range(inf + 1, sup));
    }
}
