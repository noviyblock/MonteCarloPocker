package card.poker_hand;

import card.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    protected List<Card> cards;
    protected int combinationRang;

    public Hand() {
        this.cards = new ArrayList<>();
        this.combinationRang = 1;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public String defineComb(List<Card> hand){
        return "";
    }

    //Определение типа комбинации в руке
    public boolean isOnePair(List<Card> hand){
        return true;
    }
    public boolean isTwoPairs(List<Card> hand){
        return true;
    }
    public boolean isSet(List<Card> hand){
        return true;
    }
    public boolean isStraight(List<Card> hand){
        return true;
    }
    public boolean isFlush(List<Card> hand){
        return true;
    }
    public boolean isFullHouse(List<Card> hand){
        return true;
    }

    public boolean isFourCards(List<Card> hand){
        return true;
    }

    public boolean isStraightFlush(List<Card> hand){
        return true;
    }

    public boolean isRoyalFlush(List<Card> hand){
        return true;
    }
}