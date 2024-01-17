package card.combinations_utils;

import card.Card;
import card.Rank;

import java.util.*;

public class TwoPairUtil implements IPokerCombDefineUtil {

    @Override
    public boolean isMatch(List<Card> hand) {
        Map<Rank, Integer> rankCount = new HashMap<>();

        for (Card card : hand) {
            Rank rank = card.getRank();
            rankCount.put(rank, rankCount.getOrDefault(rank, 0) + 1);
        }

        int pairCount = 0;
        for (Map.Entry<Rank, Integer> entry : rankCount.entrySet()) {
            if (entry.getValue() == 2) {
                pairCount++;
            }
        }

        return pairCount == 2; // Две пары найдены
    }

    @Override
    public int getRank() {
        return 3; // Ранг для сравнения с другими комбинациями
    }
}

