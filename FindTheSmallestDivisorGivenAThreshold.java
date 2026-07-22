import java.util.Arrays;

public class FindTheSmallestDivisorGivenAThreshold {

     public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = 0;

            for (int num : nums) {
                double divisor = Math.ceil((double) num / mid);
                sum += divisor;
            }
            if (sum > threshold) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}