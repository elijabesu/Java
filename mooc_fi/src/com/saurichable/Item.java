package com.saurichable;

public class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() { return this.name; }
    public int getWeight() { return weight; }
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
    public boolean equals(Object object) {
        if (this == object) { return true; }
        if (!(object instanceof Item)) { return false; }
        Item comparedItem = (Item) object;
        if (this.name.equals(comparedItem.name) &&
                this.weight == comparedItem.weight) {
            return true;
        }
        return false;
    }
}
