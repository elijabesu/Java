package com.saurichable;

import java.util.Scanner;

public class BigYearUI {
    private BigYear bigYear;

    public BigYearUI() {
        this.bigYear = new BigYear();
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("add")) {
                this.askForBird();
            } else if (command.equals("observation")) {
                String toObserve = this.askForBirdName();
                this.bigYear.observe(toObserve);
            } else if (command.equals("all")) {
                System.out.print(this.bigYear.printAll());
            } else if (command.equals("one")) {
                String toPrint = this.askForBirdName();
                System.out.println(this.bigYear.getOne(toPrint));
            } else if (command.equals("quit")) {
                break;
            }
        }
    }
    public String askForBirdName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bird: ");
        String name = scanner.nextLine();
        return name;
    }
    public void askForBird() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latin = scanner.nextLine();
        this.bigYear.addBird(name, latin);
    }
}
