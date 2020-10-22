package parts.ten.techniques;

public class Card implements Comparable<Card> {
    private final int value;
    private final Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) throw new IllegalArgumentException("Card value must be in range 2 - 14");

        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;

        switch (value) {
            case 11:
                cardValue = "J";
                break;
            case 12:
                cardValue = "Q";
                break;
            case 13:
                cardValue = "K";
                break;
            case 14:
                cardValue = "A";
                break;
        }

        return suit + " " + cardValue;
    }

    @Override
    public int compareTo(Card o) {
        if (value - o.value != 0) return value - o.value;
        return suit.ordinal() - o.suit.ordinal();
    }
}
