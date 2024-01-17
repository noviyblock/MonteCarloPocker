package card.combinations_utils;

import card.Card;
import card.Suit;

import java.util.*;

public class FlushUtil implements IPokerCombCompareUtil {

    @Override
    public boolean isMatch(List<Card> hand) {
        Map<Suit, Integer> suitCount = new HashMap<>();

        for (Card card : hand) {
            Suit suit = card.getSuit();
            suitCount.put(suit, suitCount.getOrDefault(suit, 0) + 1);
        }

        for (int count : suitCount.values()) {
            if (count >= 5) {
                return true; // Флэш найден
            }
        }

        return false; // Флэш не найден
    }

    @Override
    public int getRank() {
        return 6; // Ранг для сравнения с другими комбинациями
    }
}


