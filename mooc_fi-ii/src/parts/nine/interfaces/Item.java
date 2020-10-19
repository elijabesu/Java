package parts.nine.interfaces;

import java.util.Objects;

public class Item {
    private final String name;
    private int quantity;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.name = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return unitPrice * quantity;
    }

    public void increaseQuantity() {
        ++quantity;
    }

    @Override
    public String toString() {
        return name + ": " + quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return unitPrice == item.unitPrice &&
                name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, unitPrice);
    }
}
