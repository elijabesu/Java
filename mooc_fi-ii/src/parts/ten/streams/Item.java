package parts.ten.streams;

import java.util.Objects;

public class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() { return this.name; }

    public int getWeight() { return weight; }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return weight == item.weight &&
                name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}
