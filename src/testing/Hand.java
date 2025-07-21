package src.testing;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public int value() {
        int total = 0;
        int aces = 0;

        for (Card card : cards) {
            total += card.value();
            if (card.rank.equals("A")) aces++;
        }

        while (total > 21 && aces > 0) {
            total -= 10;
            aces--;
        }

        return total;
    }

    public List<Card> getCards() {
        return cards;
    }

    public String toString(boolean revealAll) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cards.size(); i++) {
            if (!revealAll && i == 1) {
                sb.append("Hidden");
            } else {
                sb.append(cards.get(i));
            }
            if (i < cards.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
}
