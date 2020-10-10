package com.saurichable;

public class BigYear {
    private BirdList birdList;

    public BigYear() {
        this.birdList = new BirdList();
    }
    public void addBird(String name, String latin) {
        this.birdList.add(new Bird(name, latin));
    }
    public void observe(String name) {
        if (this.birdList.contains(name)) {
            this.birdList.getBird(name).observe();
        } else {
            System.out.println("Not a bird!");
        }
    }
    public String printAll() {
        return this.birdList.printBirds();
    }
    public String getOne(String name) {
        if (this.birdList.contains(name)) {
            return this.birdList.getBird(name).toString();
        }
        return "Not a bird!";
    }
}
