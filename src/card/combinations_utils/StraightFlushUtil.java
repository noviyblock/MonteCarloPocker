package card.combinations_utils;

import card.Card;
import card.Rank;
import card.Suit;

import java.util.*;

public class StraightFlushUtil implements IPokerCombCompareUtil {

    @Override
    public boolean isMatch(List<Card> hand) {
        Map<Suit, List<Rank>> suitRanks = new HashMap<>();

        for (Card card : hand) {
            Suit suit = card.getSuit();
            Rank rank = card.getRank();

            suitRanks.computeIfAbsent(suit, k -> new ArrayList<>()).add(rank);
        }

        for (List<Rank> ranks : suitRanks.values()) {
            Collections.sort(ranks);

            for (int i = 0; i <= ranks.size() - 5; i++) {
                if (ranks.get(i).ordinal() + 4 == ranks.get(i + 4).ordinal()) {
                    return true; // Стрит-флеш найден
                }
            }
        }

        return false; // Стрит-флеш не найден
    }

    @Override
    public int getRank() {
        return 9; // Ранг для сравнения с другими комбинациями
    }
}

