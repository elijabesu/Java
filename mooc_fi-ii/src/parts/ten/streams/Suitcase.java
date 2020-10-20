package parts.ten.streams;

import java.util.ArrayList;
import java.util.Objects;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (!items.contains(item)) {
            int totalWeight = totalWeight();
            if (maxWeight >= (totalWeight + item.getWeight())) items.add(item);
        }
    }

    @Override
    public String toString() {
        int totalWeight = totalWeight();
        if (items.size() == 0) return "no items (0 kg)";
        if (items.size() == 1) return "1 item (" + totalWeight + " kg)";
        return items.size() + " items (" + totalWeight + " kg)";
    }

    public void printItems() {
        items.stream().forEach(item -> System.out.println(item));
    }

    public int totalWeight() {
        return items.stream()
                .map(item -> item.getWeight())
                .reduce(0, (prevWeight, itemWeight) -> prevWeight + itemWeight);
    }

    public Item heaviestItem() {
        if (items.isEmpty()) return null;
        Item returnObject = items.stream().reduce(items.get(0), (currentObject, item) -> {
            if (currentObject.getWeight() < item.getWeight()) currentObject = item;
            return currentObject;
        });
        return returnObject;
    }

    public ArrayList<Item> getItems() {
        return items;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suitcase suitcase = (Suitcase) o;
        return maxWeight == suitcase.maxWeight &&
                Objects.equals(items, suitcase.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, maxWeight);
    }
}
