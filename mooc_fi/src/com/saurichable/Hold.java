package com.saurichable;

import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    public void addSuitcase(Suitcase suitcase) {
        if (!this.suitcases.contains(suitcase)) {
            int totalWeight = this.totalWeight();
            if (this.maxWeight >= (totalWeight + suitcase.totalWeight())) {
                this.suitcases.add(suitcase);
            }
        }
    }
    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase: this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    public String toString() {
        int totalWeight = this.totalWeight();
        if (this.suitcases.size() == 0) { return "no suitcases (0 kg)" ; }
        if (this.suitcases.size() == 1) { return "1 suitcase (" + totalWeight + " kg)"; }
        return this.suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printItems();
        }
    }
}
