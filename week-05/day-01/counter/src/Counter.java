public class Counter {
    int value;

    public Counter() {
        this(0);
    }

    public Counter(int value) {
        this.value = value;
    }

    public void add(int number) {
        this.value += number;
    }

    public void add() {
        this.value++;
    }

    public int get() {
        return this.value;
    }

    public int reset() {
        this.value = 0;
        return this.value;
    }
}
