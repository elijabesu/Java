package parts.nine.inheritance;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int weightCapacity;
    private int weight;

    public BoxWithMaxWeight(int capacity) {
        weightCapacity = capacity;
        items = new ArrayList<>();
        weight = 0;
    }

    @Override
    public void add(Item item) {
        if (weight + item.getWeight() > weightCapacity) return;
        items.add(item);
        weight += item.getWeight();
    }

    @Override
    public boolean isInBox(Item item) {
        if (items.contains(item)) return true;
        return false;
    }
}
