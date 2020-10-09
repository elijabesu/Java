package com.saurichable;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private int duration;
    private ArrayList<String> ingredients;

    public Recipe(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.ingredients = new ArrayList<>();
    }
    public void addIngredient(String ingredient) {
        if (!this.ingredients.contains(ingredient)) {
            this.ingredients.add(ingredient);
        }
    }
    public String toString() {
        return this.name + ", cooking time: " + this.duration;
    }
}
