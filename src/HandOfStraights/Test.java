package HandOfStraights;

import static org.junit.jupiter.api.Assertions.*;

class Test {
    @org.junit.jupiter.api.Test
    void testIsNStraightHand() {
        Solution solution = new Solution();

        // Example test cases
        assertTrue(solution.isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3));
        assertFalse(solution.isNStraightHand(new int[]{1,2,3,4,5}, 4));

        // Additional test cases
        assertTrue(solution.isNStraightHand(new int[]{1,2,3,4,5,6}, 2));
        assertTrue(solution.isNStraightHand(new int[]{1,2,3,4,5,6,7,8,9}, 3));
        assertFalse(solution.isNStraightHand(new int[]{1,2,3,4,5,6,7,8}, 3));

        // Edge cases
        assertTrue(solution.isNStraightHand(new int[]{}, 1)); // Empty hand
        assertFalse(solution.isNStraightHand(new int[]{1,2,3,4,5}, 6)); // Group size larger than hand size
        assertTrue(solution.isNStraightHand(new int[]{1,2,3,4,5}, 1)); // Group size of 1
        assertFalse(solution.isNStraightHand(new int[]{1,2,2,3,4}, 2)); // Impossible to form groups

        // Large input
        int[] largeHand = new int[100000];
        for (int i = 0; i < largeHand.length; i++) {
            largeHand[i] = i / 4;
        }
        assertTrue(solution.isNStraightHand(largeHand, 4));
    }
}