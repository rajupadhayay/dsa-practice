import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElementsBySign {

    // Brute Force Approach
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int[] rearrangeArray1(int[] nums) {

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int num : nums) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        int[] ans = new int[nums.length];
        int posIndex = 0;
        int negIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ans[i] = positive.get(posIndex++);
            } else {
                ans[i] = negative.get(negIndex++);
            }
        }

        return ans;
    }

    // Optimal Approach
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int[] rearrangeArray2(int[] nums) {

        int[] ans = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {
            if (num >= 0) {
                ans[posIndex] = num;
                posIndex += 2;
            } else {
                ans[negIndex] = num;
                negIndex += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {3, 1, -2, -5, 2, -4};

        System.out.println("Brute Force : " + Arrays.toString(rearrangeArray1(nums)));
        System.out.println("Optimal     : " + Arrays.toString(rearrangeArray2(nums)));
    }
}