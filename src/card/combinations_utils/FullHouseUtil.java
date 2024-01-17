package card.combinations_utils;

import card.Card;
import card.Rank;

import java.util.*;

public class FullHouseUtil implements IPokerCombDefineUtil {

    @Override
    public boolean isMatch(List<Card> hand) {
        Map<Rank, Integer> rankCount = new HashMap<>();

        for (Card card : hand) {
            Rank rank = card.getRank();
            rankCount.put(rank, rankCount.getOrDefault(rank, 0) + 1);
        }

        boolean threeOfAKind = false;
        boolean onePair = false;

        for (int count : rankCount.values()) {
            if (count == 3) {
                threeOfAKind = true;
            } else if (count == 2) {
                onePair = true;
            }
        }

        return threeOfAKind && onePair; // Фуллхаус найден
    }

    @Override
    public int getRank() {
        return 7; // Ранг для сравнения с другими комбинациями
    }
}

