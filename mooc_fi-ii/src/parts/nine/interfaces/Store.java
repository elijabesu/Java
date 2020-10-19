package parts.nine.interfaces;

import java.util.Scanner;

public class Store {
    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store, " + customer + "!");
        System.out.println("Our selection: ");
        for (String product: warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("Add to cart (type nothing to pay): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) break;
            if (warehouse.products().contains(product) && warehouse.stock(product) > 0) {
                cart.add(product, warehouse.price(product));
                warehouse.take(product);
            }
        }
        System.out.println("Your shopping cart: ");
        cart.print();
        System.out.println("Total: " + cart.price());
    }
}
