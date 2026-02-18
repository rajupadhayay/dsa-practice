import java.util.*;

// Problem: Contains Duplicate
// Platform: LeetCode (217)

// Approach 1: Brute Force
// Time: O(n^2)
// Space: O(1)

// Approach 3: HashSet with early exit (Best)
// Time: O(n)
// Space: O(n)
public class ContainsDuplicates {
    public static boolean containsDuplicates1(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // check duplicate element
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Approach 2: HashSet (Size comparison)
    // Time: O(n)
    // Space: O(n)

    public static boolean containsDuplicates2(int[] nums) {
        // create HashSet
        HashSet<Integer> set = new HashSet<>();
        // Add Element in HashSet
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size() != nums.length;
    }

    // Approach 3: HashSet with early exit (Best)
    // Time: O(n)
    // Space: O(n)
    public static boolean containsDuplicates3(int[] nums) {
        // create HashSet
        HashSet<Integer> set = new HashSet<>();
        // Add Element in HashSet
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        System.out.println(containsDuplicates1(nums));
        System.out.println(containsDuplicates2(nums));
        System.out.println(containsDuplicates3(nums));
    }
}