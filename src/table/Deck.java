package table;

import card.Card;
import card.Rank;
import card.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        initializeDeck();
        shuffleDeck();
    }

    private void initializeDeck() {
        cards = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    private void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public List<Card> dealCards(int numCards) {
        if (numCards > cards.size()) {
            throw new IllegalArgumentException("Not enough cards in the deck");
        }

        List<Card> dealtCards = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            dealtCards.add(cards.remove(0));
        }

        return dealtCards;
    }

    public int cardsRemaining() {
        return cards.size();
    }

    public void resetDeck() {
        initializeDeck();
        shuffleDeck();
    }
}

