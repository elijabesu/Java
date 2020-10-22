package parts.ten.techniques;

import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        int bySuit = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if (bySuit != 0) return bySuit;
        return c1.getValue() - c2.getValue();
    }
}
