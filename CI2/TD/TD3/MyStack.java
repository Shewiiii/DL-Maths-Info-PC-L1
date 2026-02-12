package TD.TD3;

public class MyStack {
    private int[] elements;
    private int top;

    public MyStack() {
        elements = new int[100];
        top = 0;
    }

    public void push(int i) {
        if (this.top >= this.elements.length) { // plus safe de check juste avant au lieu d'après
            int[] elements2 = new int[this.elements.length * 2];
            for (int j = 0; j < this.elements.length; j++) {
                elements2[j] = this.elements[j];
            }
            this.elements = elements2;
        }

        this.elements[top] = i;
        this.top++;
    }

    public int pop() {
        if (this.top <= 0) {
            throw new Error("Pile vide");
        }
        this.top--;
        return this.elements[this.top];
    }

    public boolean empty() {
        return this.top == 0;
    }

    private void resize(int newSize) {
        assert (newSize >= this.top);
        int[] elements2 = new int[newSize];
        for (int i = 0; i < this.top; i++) {
            elements2[i] = this.elements[i];
        }
        this.elements = elements2;
    }

    public void push2(int i) {
        if (this.top >= this.elements.length) {
            resize(this.elements.length * 2);
        }
        this.elements[top] = i;
        this.top++;
    }

    public int pop2() {
        if (this.top <= 0) {
            throw new Error("Pile vide");
        }
        this.top--;
        if (this.top <= this.elements.length / 4) {
            resize(this.elements.length / 2);
        }
        return this.elements[this.top];
    }
}
