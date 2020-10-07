package com.saurichable;

import java.util.Scanner;

public class TodoUserInterface {
    private Scanner scanner;
    private TodoList list;

    public TodoUserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                this.list.add(scanner.nextLine());
            } else if (command.equals("list")) {
                this.list.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one should be removed? ");
                this.list.remove(Integer.valueOf(scanner.nextLine()));
            } else {
                continue;
            }
        }
    }
}
