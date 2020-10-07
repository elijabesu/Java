package com.saurichable;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private WordSet wordSet;

    public UserInterface(WordSet wordSet, Scanner scanner) {
        this.scanner = scanner;
        this.wordSet = wordSet;
    }
    public void start() {
        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();
            if (this.wordSet.contains(word)) {
                break;
            }
            this.wordSet.add(word);
        }
        System.out.println("You said the same word twice.");
        System.out.println(wordSet.palindromes() + " of the words were palindromes.");
    }
}
