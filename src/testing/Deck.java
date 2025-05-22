package src.testing;

import java.util.*;

public class Deck {
    private List<Card> cards;
    private Random random = new Random();

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards, random);
    }

    public Card draw() {
        return cards.remove(cards.size() - 1);
    }
}
