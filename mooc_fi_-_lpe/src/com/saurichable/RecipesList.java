package com.saurichable;

import java.util.ArrayList;

public class RecipesList {
    private ArrayList<Recipe> recipes;

    public RecipesList() {
        this.recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }
    public int size() {
        return this.recipes.size();
    }
    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }
}
