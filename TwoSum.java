import java.util.*;

public class TwoSum {
    // 1. Bruteforce method.
    // TC => O(n^2)
    // SC => O(1)
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // 2. optimal approach
    // TC => O(n)
    // // SC => O(n)
    public static int[] twoSum2(int[] nums, int target) {

        // create HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        // traverse the array
        for (int i = 0; i < nums.length; i++) {
            // Find the number we need to complete the target
            int second_num = target - nums[i];
            // check map contains second_num
            // if yes -> return
            if (map.containsKey(second_num)) {
                return new int[] { map.get(second_num), i };
            }
            // if not - add in HashMap
            map.put(nums[i], i);
        }

        return new int[] { -1 };

    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 4 };
        int target = 6;
        int ans1[] = twoSum1(nums, target);
        int ans2[] = twoSum2(nums, target);
        System.out.println(Arrays.toString(ans1));
        System.out.println(Arrays.toString(ans2));

    }
}