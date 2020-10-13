package parts.eight.recap;

public class Container {
    private int maxValue;
    private int value;

    public Container(int maxValue) {
        this.maxValue = maxValue;
    }
    public int contains() {
        return this.value;
    }
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        if (this.value + amount <= this.maxValue) {
            this.value += amount;
        } else {
            this.value = this.maxValue;
        }
    }
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        if (this.value - amount >= 0) {
            this.value -= amount;
        } else {
            this.value = 0;
        }
    }
    public String toString() {
        return this.value + "/" + this.maxValue;
    }
}
