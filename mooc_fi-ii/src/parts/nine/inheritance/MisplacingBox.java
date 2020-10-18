package parts.nine.inheritance;

import java.util.ArrayList;

public class MisplacingBox extends Box {

    public MisplacingBox() {
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
