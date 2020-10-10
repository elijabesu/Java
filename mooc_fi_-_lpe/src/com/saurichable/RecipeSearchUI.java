package com.saurichable;

import java.util.Scanner;

public class RecipeSearchUI {
    private final RecipeSearch recipeSearch;
    private String filename;

    public RecipeSearchUI() {
        this.recipeSearch = new RecipeSearch("E:\\MEGA\\coding\\Java\\mooc_fi_-_lpe\\src\\com\\saurichable\\");
    }

    public void start() {
        System.out.print("File to read: ");
        this.getFile();
        this.recipeSearch.loadRecipes(this.filename);
        while (true) {
            System.out.print(this.printInstructions());
            String command = getInstruction();
            if (command.equals("list")) {
                System.out.println("\n" + this.recipeSearch.getRecipes());
            } else if (command.equals("find name")){
                System.out.print("Searched word: ");
                System.out.println(this.findByName());
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                System.out.println(this.findByCookingTime());
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                System.out.println(this.findByIngredient());
            } else if (command.equals("stop")) {
                break;
            } else {
                System.out.println("Unknown command.");
            }
        }
    }
    public void getFile() {
        Scanner scanner = new Scanner(System.in);
        this.filename = scanner.nextLine();
    }
    public String printInstructions() {
        return "\nCommands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient\n" +
                "\n" +
                "Enter command: ";
    }
    public String getInstruction() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public String findByName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return this.recipeSearch.getRecipeByName(name);
    }
    public String findByCookingTime() {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.valueOf(scanner.nextLine());
        return this.recipeSearch.getRecipeByCookingTime(time);
    }
    public String findByIngredient() {
        Scanner scanner = new Scanner(System.in);
        String ingredient = scanner.nextLine();
        return this.recipeSearch.getRecipeByIngredient(ingredient);
    }
}