package com.saurichable;

import java.util.ArrayList;

public class BirdList {
    private ArrayList<Bird> birds;

    public BirdList() {
        this.birds = new ArrayList<>();
    }
    public void add(Bird bird) {
        this.birds.add(bird);
    }
    public boolean contains(String name) {
        for (Bird bird: this.birds) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public Bird getBird(String name) {
        for (Bird bird: this.birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }
    public String printBirds() {
        String returned = "";
        for (Bird bird: this.birds) {
            returned += bird + "\n";
        }
        return returned;
    }
}
