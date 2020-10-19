package parts.nine.interfaces;

import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (packable.weight() + weight() > capacity) return;
        items.add(packable);
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable packable: items) {
            weight += packable.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight: " + weight() + " kg";
    }
}
