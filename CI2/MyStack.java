public class MyStack {
    private int[] elements;
    private int top;

    public MyStack() {
        elements = new int[100];
        top = 0;
    }

    /*
     * Un deuxième constructeur pour choisir soi même la taille max de la pile
     */
    public MyStack(int capacity) {
        elements = new int[capacity];
        top = 0;
    }

    public void push(int x) {
        if (top == elements.length) {
            int[] newelements = new int[elements.length * 2];
            for (int i = 0; i < top; i++) {
                newelements[i] = elements[i];
            }
            this.elements = newelements;
        }
        elements[top] = x;
        top++;
    }

    public int pop() {
        if (top == 0) {
            throw new Error("The stack is empty");
        }
        top--;
        return elements[top];
    }

    public boolean empty() {
        return top == 0;
    }

    public static void main(String[] args) {
        long debut = System.currentTimeMillis();
        MyStack p = new MyStack();
        for (int i = 0; i < 1000000; i++) {
            p.push(i);
        }
        long fin = System.currentTimeMillis();
        System.out.printf("Ça a pris %d millisecondes\n", fin - debut);
    }
}
    