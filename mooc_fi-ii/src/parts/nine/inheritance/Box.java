package parts.nine.inheritance;

import java.util.ArrayList;

public abstract class Box {
    protected ArrayList<Item> items;

    public abstract void add(Item item);

    public void add (ArrayList<Item> items) {
        for (Item item: items) {
            Box.this.add(item);
        }
    }

    public abstract boolean isInBox(Item item);
}
