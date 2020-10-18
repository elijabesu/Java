package parts.nine.inheritance;

import java.util.ArrayList;

public class OneItemBox extends Box {

    public OneItemBox() {
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (items.size() == 1) return;
        items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        if (items.contains(item)) return true;
        return false;
    }
}
