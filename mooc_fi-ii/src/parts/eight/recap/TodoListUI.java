package parts.eight.recap;

import java.util.Scanner;

public class TodoListUI {
    private TodoList todoList;
    private Scanner scanner;

    public TodoListUI() {
        this.scanner = new Scanner(System.in);
        this.todoList = new TodoList();
    }
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                this.todoList.add(this.scanner.nextLine());
            } else if (command.equals("list")) {
                this.todoList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                this.todoList.remove(Integer.valueOf(this.scanner.nextLine()));
            }
        }
    }
}
