package com.saurichable;

import java.util.ArrayList;

public class AmusementParkRide {
    private String name;
    private int lowestHeight;
    private int visitors;
    private ArrayList<Person> riding;


    public AmusementParkRide(String name, int lowestHeight){
        this.name = name;
        this.lowestHeight = lowestHeight;
        this.visitors = 0;
        this.riding = new ArrayList<>();
    }

    public boolean allowedToRide(Person person){
        if (person.getHeight() >= this.lowestHeight){
            this.visitors++;
            this.riding.add(person);
            return true;
        }
        return false;
    }
    public void removeEveryoneOnRide() {
        this.riding.clear();
    }
    public double averageHeightOfPeopleOnRide(){
        if (this.riding.isEmpty()) { return -1; }
        int sumOfHeights = 0;
        for (Person person: this.riding) {
            sumOfHeights += person.getHeight();
        }
        return (double) sumOfHeights / this.riding.size();
    }
    public Person getTallest() {
        if (this.riding.isEmpty()) { return null; }
        Person returnObject = this.riding.get(0);
        for (Person person: this.riding) {
            if (returnObject.getHeight() < person.getHeight()) { returnObject = person; }
        }
        return returnObject;
    }
    public String toString(){
        String output = this.name + ", minimum height: " + this.lowestHeight
                + ", visitors: " + this.visitors;
        if (riding.size() != 0) {
            output += ", riding:\n";
            for (Person person : this.riding) {
                output += person.getName() + "\n";
            }
        } else {
            output += ", no one is on the ride.";
        }
        return output;
    }
}
