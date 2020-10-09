package com.saurichable;

public class Recipe {
    private final String name;
    private final int duration;
    private IngredientsList ingredientsList;

    public Recipe(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.ingredientsList = new IngredientsList();
    }
    public void addIngredient(String ingredient) {
        if (!this.ingredientsList.contains(ingredient)) {
            this.ingredientsList.add(ingredient);
        }
    }
    public String toString() {
        return this.name + ", cooking time: " + this.duration;
    }
    public String getName() {
        return this.name;
    }
    public int getDuration() {
        return this.duration;
    }
    public IngredientsList getIngredients() {
        return this.ingredientsList;
    }
}
