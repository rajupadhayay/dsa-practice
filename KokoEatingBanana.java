// # 🍌 Koko Eating Bananas (LeetCode 875)

// ## Problem
// Koko loves to eat bananas. There are `n` piles of bananas, where the `i-th` pile contains `piles[i]` bananas. She can decide her eating speed `k` (bananas/hour).

// Find the **minimum eating speed** such that Koko can finish all the bananas within `h` hours.

// ---

// ## Approach

// This problem follows the **Binary Search on Answer** pattern.

// - The minimum possible eating speed is **1 banana/hour**.
// - The maximum possible eating speed is the **largest pile size**.
// - For every candidate speed (`mid`), calculate the total hours required to finish all piles.
// - If the required hours are greater than `h`, increase the speed.
// - Otherwise, try a smaller speed to find the minimum valid answer.

// To calculate the hours required for a pile, use ceiling division:

// ```java
// (pile + mid - 1) / mid
// ```

// This avoids floating-point operations and efficiently computes:

// ```
// ceil(pile / mid)
// ```

// ---

// ## Algorithm

// 1. Initialize:
//    - `low = 1`
//    - `high = max(piles)`
// 2. Perform Binary Search.
// 3. Compute the total hours required for the current eating speed.
// 4. If total hours > `h`, search the right half.
// 5. Otherwise, search the left half.
// 6. Return `low`.

// ---

// ## Complexity

// - **Time Complexity:** `O(n × log(max(piles)))`
// - **Space Complexity:** `O(1)`

// ---

// ## Java Solution

// ```java
class KokoEatingBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long time = 0;

            for (int pile : piles) {
                time += (pile + mid - 1) / mid;
            }

            if (time > h) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
// ```

// ---

// ## Key Concepts

// - Binary Search on Answer
// - Ceiling Division
// - Monotonic Search Space
// - Greedy Validation