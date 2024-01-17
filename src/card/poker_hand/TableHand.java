package card.poker_hand;

import card.Card;

public class TableHand extends Hand {
    public TableHand(Card card1, Card card2) {
        cards.add(card1);
        cards.add(card2);
    }

    public void addCardToTable(Card card) {
        cards.add(card);
    }
}
