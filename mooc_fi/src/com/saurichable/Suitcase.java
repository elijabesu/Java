package com.saurichable;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (!this.items.contains(item)) {
            int totalWeight = this.totalWeight();
            if (this.maxWeight >= (totalWeight + item.getWeight())) {
                this.items.add(item);
            }
        }
    }
    public String toString() {
        int totalWeight = this.totalWeight();
        if (this.items.size() == 0) { return "no items (0 kg)" ; }
        if (this.items.size() == 1) { return "1 item (" + totalWeight + " kg)"; }
        return this.items.size() + " items (" + totalWeight + " kg)";
    }
    public void printItems() {
        for (Item item: this.items) {
            System.out.println(item);
        }
    }
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item: this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    public Item heaviestItem() {
        if (this.items.isEmpty()) { return null; }
        Item returnObject = this.items.get(0);
        for (Item item: this.items) {
            if (returnObject.getWeight() < item.getWeight()) { returnObject = item; }
        }
        return returnObject;
    }
}
