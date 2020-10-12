package parts.eight.recap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //cubes();
        //averageOfPositiveNumbers();
        //liquidContainers();
        //testLiquidContainers();
        //liquidContainers2();
        //testTodoList();
        testTodoListUI();
    }
    public static void cubes() {
        System.out.println("== cubes ==");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            int number = Integer.valueOf(input);
            System.out.println(number * number * number);
        }
    }
    public static void averageOfPositiveNumbers() {
        System.out.println("== average of positive numbers ==");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int total = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } else if (input > 0) {
                sum += input;
                total++;
            }
        }
        if (total == 0) {
            System.out.println("Cannot calculate the average.");
        } else {
            System.out.println((double) sum / total);
        }
    }
    public static void liquidContainers() {
        System.out.println("== liquid containers ==");
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            if (amount <= 0) {
                continue;
            }
            if (parts[0].equals("add")) {
                if (first + amount <= 100) {
                    first += amount;
                } else {
                    first = 100;
                }
            } else if (parts[0].equals("move")) {
                if (first - amount >= 0) {
                    first -= amount;
                } else {
                    amount = first;
                    first = 0;
                }
                if (second + amount <= 100) {
                    second += amount;
                } else {
                    second = 100;
                }
            } else if (parts[0].equals("remove")) {
                if (second - amount >= 0) {
                    second -= amount;
                } else {
                    second = 0;
                }
            }
        }
    }
    public static void testLiquidContainers() {
        Container container = new Container(100);
        System.out.println(container);
        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());
        container.remove(60);
        System.out.println(container);
        container.add(200);
        System.out.println(container);
    }
    public static void liquidContainers2() {
        System.out.println("== liquid containers (class) ==");
        Scanner scanner = new Scanner(System.in);
        Container first = new Container(100);
        Container second = new Container(100);
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            if (amount <= 0) {
                continue;
            }
            if (parts[0].equals("add")) {
                first.add(amount);
            } else if (parts[0].equals("move")) {
                if (amount > first.contains()) {
                    amount = first.contains();
                }
                first.remove(amount);
                second.add(amount);
            } else if (parts[0].equals("remove")) {
                second.remove(amount);
            }
        }
    }
    public static void testTodoList() {
        TodoList list = new TodoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");

        list.print();
        list.remove(2);

        System.out.println();
        list.print();
    }
    public static void testTodoListUI() {
        TodoListUI ui = new TodoListUI();
        ui.start();
    }
}
