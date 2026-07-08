public class FindPeakElement {

    // Binary Search Approach - O(log n), O(1)
    public static int findPeakElement1(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    // Linear Scan Approach - O(n), O(1)
    public static int findPeakElement2(int[] nums) {
        int n = nums.length;

        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;

        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }

        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        System.out.println("Binary Search Peak Index : " + findPeakElement1(nums));
        System.out.println("Linear Search Peak Index : " + findPeakElement2(nums));
    }
}