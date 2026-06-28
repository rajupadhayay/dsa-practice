import java.util.Arrays;

public class MaxSumOfKTotalElement {
    public static long maxSum(int[] nums, int k, int mul) {
        long sum = 0;
        Arrays.sort(nums);
        int idx = nums.length - 1;

        while (k > 0 && idx >= 0) {

            if (mul > 0) {
                long withMul = (long) nums[idx] * mul;
                long withoutMul = nums[idx];

                if (withMul > withoutMul) {
                    sum += withMul;
                    mul--;
                } else {
                    sum += withoutMul;

                }
            } else {
                sum += nums[idx];
            }
            idx--;

            k--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[] = {3,7,5,2};
        int k = 2;
        int mul = 4;
        System.out.println(maxSum(nums, k, mul));
    }
}