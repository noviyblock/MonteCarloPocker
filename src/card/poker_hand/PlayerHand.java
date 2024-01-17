package card.poker_hand;

import card.Card;

import java.util.List;

public class PlayerHand extends Hand {
    public PlayerHand(List<Card> initialCards) {
        cards.addAll(initialCards);
    }
}
