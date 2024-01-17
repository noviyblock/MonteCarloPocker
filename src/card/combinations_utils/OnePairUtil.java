package card.combinations_utils;

import card.Card;
import card.Rank;

import java.util.*;

public class OnePairUtil implements IPokerCombCompareUtil {

    @Override
    public boolean isMatch(List<Card> hand) {
        Map<Rank, Integer> rankCount = new HashMap<>();

        for (Card card : hand) {
            Rank rank = card.getRank();
            rankCount.put(rank, rankCount.getOrDefault(rank, 0) + 1);
        }

        for (Map.Entry<Rank, Integer> entry : rankCount.entrySet()) {
            if (entry.getValue() == 2) {
                return true; // Найдена пара
            }
        }

        return false; // Пара не найдена
    }

    @Override
    public int getRank() {
        return 2; // Ранг для сравнения с другими комбинациями
    }
}

