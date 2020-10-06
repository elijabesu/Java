package com.saurichable;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room() { this.people = new ArrayList<>(); }

    public void add(Person person) {
        if (!this.people.contains(person)) { this.people.add(person); }
    }
    public boolean isEmpty() { return this.people.isEmpty(); }
    public ArrayList<Person> getPeople() {
        if (this.isEmpty()) { return null; }
        return this.people;
    }
    public Person shortest() {
        if (this.isEmpty()) { return null; }
        Person returnObject = this.people.get(0);
        for (Person person: this.people) {
            if (returnObject.getHeight() > person.getHeight()) { returnObject = person; }
        }
        return returnObject;
    }
    public Person take() {
        if (this.isEmpty()) { return null; }
        Person shortest = this.shortest();
        this.people.remove(shortest);
        return shortest;
    }
}
