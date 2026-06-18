import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {

     public static int[] searchRange(int[] nums, int target) {
        int first = first(nums, target);
        int last  = last(nums, target);
        if (nums.length == 0){
            return new int[] { -1, -1 };
        }
        return new int[] { first, last };
    }

    public static int first(int nums[], int target) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
           
        }
         return ans;
    }

    public static int last(int nums[], int target) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
       System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}