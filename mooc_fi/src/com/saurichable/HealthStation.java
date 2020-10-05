package com.saurichable;

public class HealthStation {
    private int weighings;
    public HealthStation(){
        this.weighings = 0;
    }

    public double weigh(Person person){
        this.weighings += 1;
        return person.getWeight();
    }
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }
    public int getWeighings(){
        return this.weighings;
    }
}
