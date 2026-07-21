// # 💐 Minimum Number of Days to Make m Bouquets (LeetCode 1482)

// ## Problem

// You are given an integer array `bloomDay`, where `bloomDay[i]` is the day the `i-th` flower blooms.

// To make one bouquet, you need **k adjacent bloomed flowers**.

// Return the **minimum number of days** required to make `m` bouquets. If it is impossible, return `-1`.

// ---

// ## Approach

// This problem also uses **Binary Search on Answer**.

// - The answer lies between the minimum and maximum bloom day.
// - For every candidate day (`mid`), count how many bouquets can be formed.
// - If at least `m` bouquets can be formed, try a smaller day.
// - Otherwise, increase the day.

// Before Binary Search, check whether enough flowers exist.

// ---

// ## Algorithm

// 1. If total flowers < `m × k`, return `-1`.
// 2. Set:
//    - `low = minimum bloom day`
//    - `high = maximum bloom day`
// 3. Perform Binary Search.
// 4. Count consecutive bloomed flowers.
// 5. Every `k` consecutive flowers form one bouquet.
// 6. If bouquets < `m`, move right.
// 7. Otherwise, move left.
// 8. Return `low`.

// ---

// ## Complexity

// - **Time Complexity:** `O(n × log(maxBloomDay))`
// - **Space Complexity:** `O(1)`

// ---

// ## Java Solution

// ```java
public class MinimumNumberOfDaysToMakeMBouquets {
    
    public static int minDays(int[] bloomDay, int m, int k) {

        // Impossible to make required bouquets
        if (bloomDay.length < 1L * m * k) {
            return -1;
        }

        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int consecutiveFlowers = 0;
            long bouquets = 0;

            for (int day : bloomDay) {

                if (day <= mid) {
                    consecutiveFlowers++;
                } else {
                    bouquets += consecutiveFlowers / k;
                    consecutiveFlowers = 0;
                }
            }

            bouquets += consecutiveFlowers / k;

            if (bouquets < m) {
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
// - Greedy Counting
// - Consecutive Elements
// - Monotonic Search Space
// - Binary Search + Simulation
