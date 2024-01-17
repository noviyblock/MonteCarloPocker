package card.combinations_utils;

import card.Card;

import java.util.List;

public interface IPokerCombDefineUtil {
    boolean isMatch(List<Card> hand);
    int getRank();
}
