package parts.nine.inheritance;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        history = new ChangeHistory();

        addToWarehouse(initialBalance);
    }

    public String history() {
        return history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        super.takeFromWarehouse(amount);
        history.add(getBalance());
        return amount;
    }

    public String getAnalysis() {
        return "Product: " + getName() +
                "\nHistory: " + history.toString() +
                "\nLargest amount of product: " + history.maxValue() +
                "\nSmallest amount of product: " + history.minValue() +
                "\nAverage: " + history.average();
    }
}
