package card.poker_hand;

import card.Card;
import card.combinations_utils.*;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    protected List<Card> cards;

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

    private int defineCombination(List<Card> hand) {
        List<IPokerCombDefineUtil> combinationUtils = new ArrayList<>();
        combinationUtils.add(new OnePairUtil());
        combinationUtils.add(new TwoPairUtil());
        combinationUtils.add(new SetUtil());
        combinationUtils.add(new StraightUtil());
        combinationUtils.add(new FlushUtil());
        combinationUtils.add(new FullHouseUtil());
        combinationUtils.add(new FourCardsUtil());
        combinationUtils.add(new StraightFlushUtil());
        combinationUtils.add(new FlushRoyalUtil());

        int maxCombinationRank = 1;

        for (IPokerCombDefineUtil util : combinationUtils) {
            int rank = util.isMatch(hand) ? util.getRank() : 0;
            maxCombinationRank = Math.max(maxCombinationRank, rank);
        }

        return maxCombinationRank;
    }
}