package parts.nine.inheritance;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        this.capacity = capacity;
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchSpaceLeft() {
        return capacity - balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) return;
        if (balance + amount < capacity) {
            balance += amount;
        } else {
            balance = capacity;
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) return 0;
        if (amount < balance) balance -= amount;
        amount = balance;
        return amount;
    }

    @Override
    public String toString() {
        return "balance: " + balance + ", space left: " + howMuchSpaceLeft();
    }
}
