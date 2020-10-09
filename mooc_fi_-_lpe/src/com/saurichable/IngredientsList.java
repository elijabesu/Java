package com.saurichable;

import java.util.ArrayList;

public class IngredientsList {
    private ArrayList<String> ingredients;

    public IngredientsList() {
        this.ingredients = new ArrayList<>();
    }
    public boolean contains(String ingredient) {
        return this.ingredients.contains(ingredient);
    }
    public void add(String ingredient) {
        this.ingredients.add(ingredient);
    }
}
