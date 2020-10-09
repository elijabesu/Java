package com.saurichable;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    private String path;
    private ArrayList<Recipe> recipes;

    public RecipeSearch(String path) {
        this.path = path;
        this.recipes = new ArrayList<>();
    }
    public Scanner readFile(String filename) {
        try (Scanner scanner = new Scanner(Paths.get(this.path + filename))) {
            return scanner;
        } catch (Exception e) {
            return null;
        }
    }
    public void loadRecipes(String filename) {
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
                this.recipes.add(recipe);
            }
        } catch (Exception e) {
            return;
        }
    }
    public String getRecipes(String filename) {
        if (this.recipes.size() == 0) {
            return "Error reading the file: " + filename;
        }
        String returned = "Recipes:";
        for (Recipe recipe: this.recipes) {
            returned +=  "\n" + recipe;
        }
        return returned;
    }
}
