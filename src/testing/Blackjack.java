package src.testing;

import java.util.*;

public class Blackjack {

    public static void main(String[] args) {
        new Blackjack().playGame();
    }

    private Deck deck;
    private List<Card> playerHand;
    private List<Card> dealerHand;
    private Scanner scanner = new Scanner(System.in);

    public void playGame() {
        deck = new Deck();
        deck.shuffle();

        playerHand = new ArrayList<>();
        dealerHand = new ArrayList<>();

        // Initial deal
        playerHand.add(deck.draw());
        playerHand.add(deck.draw());
        dealerHand.add(deck.draw());
        dealerHand.add(deck.draw());

        System.out.println("Welcome to Blackjack!");

        boolean playerTurn = true;
        while (playerTurn) {
            printHands(false);
            int playerTotal = handValue(playerHand);
            if (playerTotal > 21) {
                System.out.println("You busted! Dealer wins.");
                return;
            }

            System.out.print("Hit or Stand? (h/s): ");
            String choice = scanner.nextLine().toLowerCase();
            if (choice.equals("h")) {
                playerHand.add(deck.draw());
            } else if (choice.equals("s")) {
                playerTurn = false;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        // Dealer turn
        while (handValue(dealerHand) < 17) {
            dealerHand.add(deck.draw());
        }

        printHands(true);

        int playerTotal = handValue(playerHand);
        int dealerTotal = handValue(dealerHand);

        if (dealerTotal > 21 || playerTotal > dealerTotal) {
            System.out.println("You win!");
        } else if (playerTotal < dealerTotal) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    private void printHands(boolean showDealerHand) {
        System.out.println("\nYour hand: " + handString(playerHand) + " (Total: " + handValue(playerHand) + ")");
        if (showDealerHand) {
            System.out.println("Dealer's hand: " + handString(dealerHand) + " (Total: " + handValue(dealerHand) + ")");
        } else {
            System.out.println("Dealer's hand: [" + dealerHand.get(0) + ", Hidden]");
        }
        System.out.println();
    }

    private int handValue(List<Card> hand) {
        int total = 0;
        int aces = 0;

        for (Card card : hand) {
            total += card.value();
            if (card.rank.equals("A")) aces++;
        }

        // Adjust for Aces
        while (total > 21 && aces > 0) {
            total -= 10;
            aces--;
        }

        return total;
    }

    private String handString(List<Card> hand) {
        StringBuilder sb = new StringBuilder();
        for (Card card : hand) {
            sb.append(card).append(" ");
        }
        return sb.toString().trim();
    }
}
