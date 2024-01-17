package card.poker_hand;

import card.Card;
import card.combinations_utils.*;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    protected List<Card> cards;
    protected int combinationRang;

    public Hand() {
        this.cards = new ArrayList<>();
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
    private int isOnePair(List<Card> hand){
        OnePairUtil onePairUtil = new OnePairUtil();
        if(onePairUtil.isMatch(hand)){
            return onePairUtil.getRank();
        }
        return 1;
    }
    private int isTwoPairs(List<Card> hand){
        TwoPairUtil twoPairUtil = new TwoPairUtil();
        if(twoPairUtil.isMatch(hand)){
            return twoPairUtil.getRank();
        }
        return 0;
    }
    private int isSet(List<Card> hand){
        SetUtil setUtil = new SetUtil();
        if (setUtil.isMatch(hand)){
            return setUtil.getRank();
        }
        return 1;
    }
    private int isStraight(List<Card> hand){
        StraightUtil straightUtil = new StraightUtil();
        if(straightUtil.isMatch(hand)){
            return straightUtil.getRank();
        }
        return 1;
    }
    private int isFlush(List<Card> hand){
        FlushUtil flushUtil = new FlushUtil();
        if(flushUtil.isMatch(hand)){
            return flushUtil.getRank();
        }
        return 1;
    }
    private int isFullHouse(List<Card> hand){
        FullHouseUtil fullHouseUtil = new FullHouseUtil();
        if(fullHouseUtil.isMatch(hand)){
            return fullHouseUtil.getRank();
        };
        return 1;
    }

    private int isFourCards(List<Card> hand){
        FourCardsUtil fourCardsUtil = new FourCardsUtil();
        if(fourCardsUtil.isMatch(hand)){
            return fourCardsUtil.getRank();
        }
        return 1;
    }

    private int isStraightFlush(List<Card> hand){
        StraightUtil straightUtil = new StraightUtil();
        if(straightUtil.isMatch(hand)){
            return straightUtil.getRank();
        }
        return 1;
    }

    private int isRoyalFlush(List<Card> hand){
        FlushRoyalUtil flushRoyalUtil = new FlushRoyalUtil();
        if(flushRoyalUtil.isMatch(hand)){
            return flushRoyalUtil.getRank();
        }
        return 1;
    }
}