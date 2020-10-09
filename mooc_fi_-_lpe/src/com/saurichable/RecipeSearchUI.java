package com.saurichable;

import java.util.Scanner;

public class RecipeSearchUI {
    private RecipeSearch recipeSearch;
    private String filename;

    public RecipeSearchUI() {
        this.recipeSearch = new RecipeSearch("C:\\Users\\eliska.faltynkova\\Downloads\\Java\\mooc_fi_-_lpe\\src\\com\\saurichable\\");
    }

    public void start() {
        System.out.print("File to read: ");
        this.getFile();
        this.recipeSearch.loadRecipes(this.filename);
        while (true) {
            System.out.print(this.printInstructions());
            String command = getInstruction();
            if (command.equals("list")) {
                System.out.println("\n" + this.recipeSearch.getRecipes(this.filename));
            } else {
                break;
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
                "\n" +
                "Enter command: ";
    }
    public String getInstruction() {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        return command;
    }
}
/*
File to read: recipes.txt

Commands:
list - lists the recipes
stop - stops the program

Enter command: list

Recipes:
Pancake dough, cooking time: 60
Meatballs, cooking time: 20
Tofu rolls, cooking time: 30

Enter command:  stop
 */
