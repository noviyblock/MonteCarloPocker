package card.combinations_utils;

import card.Card;

import java.util.List;

public interface IPokerCombCompareUtil {
    boolean isMatch(List<Card> hand);
    int getRank();
}
