package HandOfStraights;

import java.util.TreeMap;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> cardCount = new TreeMap<>();
        for (int card : hand) {
            if (!cardCount.containsKey(card)) {
                cardCount.put(card, 1);
            } else {
                cardCount.replace(card, cardCount.get(card) + 1);
            }
        }

        while (!cardCount.isEmpty()) {
            int minValue = cardCount.firstKey();
            for (int card = minValue; card < minValue + groupSize; card++) {
                if (!cardCount.containsKey(card)) {
                    return false;
                }
                int count = cardCount.get(card);

                if (count == 1) {
                    cardCount.remove(card);
                } else {
                    cardCount.replace(card, count - 1);
                }
            }
        }
        return true;
    }
}