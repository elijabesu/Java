package parts.ten.techniques;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        Iterator<Card> iterator = cards.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void removeWorst(int value) {
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() < value) iterator.remove();
        }
    }
}
