package com.saurichable;

import java.nio.file.Paths;
import java.util.Scanner;

public class RecipeSearch {
    private final String path;
    private RecipesList recipesList;
    private String filename;

    public RecipeSearch(String path) {
        this.path = path;
        this.recipesList = new RecipesList();
    }
    public void loadRecipes(String filename) {
        this.filename = filename;
        try (Scanner scanner = new Scanner(Paths.get(this.path + filename))) {
            while (scanner.hasNextLine()) {
                String title = scanner.nextLine();
                if (title.isEmpty()) {
                    continue;
                }
                int duration = Integer.valueOf(scanner.nextLine());
                Recipe recipe = new Recipe(title, duration);
                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredient(ingredient);
                }
                this.recipesList.add(recipe);
            }
        } catch (Exception e) {
            return;
        }
    }
    public String getRecipes() {
        if (this.recipesList.size() == 0) {
            return "Error reading the file: " + this.filename;
        }
        String returned = "Recipes:";
        for (Recipe recipe: this.recipesList.getRecipes()) {
            returned +=  "\n" + recipe;
        }
        return returned;
    }
    public String getRecipeByName(String name) {
        if (this.recipesList.size() == 0) {
            return "Error reading the file: " + this.filename;
        }
        String found = "";
        for (Recipe recipe: this.recipesList.getRecipes()) {
            if (recipe.getName().contains(name)) {
                found += "\n" + recipe;
            }
        }
        if (found.length() == 0) {
            return "No recipes found.";
        }
        return "\nRecipes:" + found;
    }
    public String getRecipeByCookingTime(int duration) {
        if (this.recipesList.size() == 0) {
            return "Error reading the file: " + this.filename;
        }
        String found = "";
        for (Recipe recipe: this.recipesList.getRecipes()) {
            if (recipe.getDuration() <= duration) {
                found += "\n" + recipe;
            }
        }
        if (found.length() == 0) {
            return "No recipes found.";
        }
        return "\nRecipes:" + found;
    }
    public String getRecipeByIngredient(String ingredient) {
        if (this.recipesList.size() == 0) {
            return "Error reading the file: " + this.filename;
        }
        String found = "";
        for (Recipe recipe: this.recipesList.getRecipes()) {
            if (recipe.getIngredients().contains(ingredient)) {
                found += "\n" + recipe;
            }
        }
        if (found.length() == 0) {
            return "No recipes found.";
        }
        return "\nRecipes:" + found;
    }
}
