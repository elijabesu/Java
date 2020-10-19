package parts.nine.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    List<Movable> herd;

    public Herd() {
        herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public String toString() {
        String returned = "";
        for (int i = 0; i < herd.size(); i++) {
            returned += herd.get(i);
            if (i + 1 != herd.size()) returned += "\n";
        }
        return returned;
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable: herd) {
            movable.move(dx, dy);
        }
    }
}
