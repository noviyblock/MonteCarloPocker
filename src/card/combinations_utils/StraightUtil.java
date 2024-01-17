package card.combinations_utils;

import card.Card;
import card.Rank;

import java.util.*;

public class StraightUtil implements IPokerCombDefineUtil {

    @Override
    public boolean isMatch(List<Card> hand) {
        Set<Rank> ranks = new HashSet<>();

        for (Card card : hand) {
            ranks.add(card.getRank());
        }

        // Проверяем, есть ли пять подряд идущих рангов
        for (Rank startRank : Rank.values()) {
            boolean straightFound = true;
            for (int i = 0; i < 5; i++) {
                Rank currentRank = Rank.values()[(startRank.ordinal() + i) % Rank.values().length];
                if (!ranks.contains(currentRank)) {
                    straightFound = false;
                    break;
                }
            }
            if (straightFound) {
                return true; // Стрит найден
            }
        }

        return false; // Стрит не найден
    }

    @Override
    public int getRank() {
        return 5; // Ранг для сравнения с другими комбинациями
    }
}

