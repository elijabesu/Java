package parts.nine.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    Map<String, Item> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (items.containsKey(product)) items.get(product).increaseQuantity();
        else items.put(product, new Item(product, 1, price));
    }

    public int price() {
        int price = 0;
        for (Item item: items.values()) {
            price += item.price();
        }
        return price;
    }

    public void print() {
        for (Item item: items.values()) {
            System.out.println(item);
        }
    }
}
