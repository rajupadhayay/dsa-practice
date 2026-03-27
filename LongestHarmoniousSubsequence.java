import java.util.Arrays;
import java.util.HashMap;
// Approach 1: Sorting + Sliding Window
public class LongestHarmoniousSubsequence {
    public static int findLHS1(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int max = 0;
        for (int j = 0; j < nums.length; j++) {
             while (nums[j] - nums[i] > 1)i++;
            if (nums[j] - nums[i] == 1)max = Math.max(max, j - i + 1);
        }
            return max;
    }
    // Approach 2: HashMap (Optimal)
    public static int findLHS2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.containsKey(key - 1)) {
                max = Math.max(max, map.get(key) + map.get(key - 1));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };
        System.out.println(findLHS1(nums));
        System.out.println(findLHS2(nums));
    }
}