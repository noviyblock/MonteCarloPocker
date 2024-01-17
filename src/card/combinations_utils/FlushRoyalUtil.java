package card.combinations_utils;

import card.Card;
import card.Rank;
import card.Suit;

import java.util.*;

public class FlushRoyalUtil implements IPokerCombDefineUtil {

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

            if (ranks.size() >= 5 && ranks.get(ranks.size() - 1) == Rank.KING) {
                // Проверяем, что у нас есть туз, король, дама, валет и десятка
                boolean royalFlush = true;
                for (Rank expectedRank : Arrays.asList(Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING, Rank.ACE)) {
                    if (!ranks.contains(expectedRank)) {
                        royalFlush = false;
                        break;
                    }
                }

                if (royalFlush) {
                    return true; // Рояль-флеш найден
                }
            }
        }

        return false; // Рояль-флеш не найден
    }

    @Override
    public int getRank() {
        return 10; // Ранг для сравнения с другими комбинациями
    }
}

