package parts.ten.techniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand> {
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

    public void sort() {
        Collections.sort(cards);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

    public int sum() {
        return cards.stream().map(card -> card.getValue()).reduce(0, (s, v) -> s + v);
    }

    @Override
    public int compareTo(Hand o) {
        return sum() - o.sum();
    }
}
