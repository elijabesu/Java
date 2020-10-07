package com.saurichable;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }
    public void print() {
        if (this.list.size() == 0) {
            System.out.println("No items.");
        } else {
            for (String todo: this.list) {
                System.out.println((this.list.indexOf(todo) + 1) + ". " + todo);
            }
        }
    }
    public void remove(int number) {
        this.list.remove(number - 1);
    }
}
