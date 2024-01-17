package player;

import card.Card;
import card.poker_hand.PlayerHand;

import java.util.List;

public class Player {
    PlayerHand playerHand;
    String name;

    public Player(List<Card> initCards, String name){
        this.playerHand = new PlayerHand(initCards);
        this.name = name;
    }
}
