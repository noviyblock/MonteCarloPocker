package card.combinations_utils;

import card.Card;
import card.Rank;

import java.util.*;

public class FourCardsUtil implements IPokerCombCompareUtil {

    @Override
    public boolean isMatch(List<Card> hand) {
        Map<Rank, Integer> rankCount = new HashMap<>();

        for (Card card : hand) {
            Rank rank = card.getRank();
            rankCount.put(rank, rankCount.getOrDefault(rank, 0) + 1);
        }

        for (int count : rankCount.values()) {
            if (count == 4) {
                return true; // Каре найдено
            }
        }

        return false; // Каре не найдено
    }

    @Override
    public int getRank() {
        return 8; // Ранг для сравнения с другими комбинациями
    }
}

