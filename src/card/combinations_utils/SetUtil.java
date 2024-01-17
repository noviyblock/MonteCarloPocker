package card.combinations_utils;

import card.Card;
import card.Rank;

import java.util.*;

public class SetUtil implements IPokerCombDefineUtil {

    @Override
    public boolean isMatch(List<Card> hand) {
        Map<Rank, Integer> rankCount = new HashMap<>();

        for (Card card : hand) {
            Rank rank = card.getRank();
            rankCount.put(rank, rankCount.getOrDefault(rank, 0) + 1);
        }

        for (Map.Entry<Rank, Integer> entry : rankCount.entrySet()) {
            if (entry.getValue() == 3) {
                return true; // Тройка найдена
            }
        }

        return false; // Тройка не найдена
    }

    @Override
    public int getRank() {
        return 4; // Ранг для сравнения с другими комбинациями
    }
}

