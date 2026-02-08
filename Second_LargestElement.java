import java.util.Arrays;

public class Second_LargestElement {
    // 1. Bruteforce approach
    public static int secondLargest1(int nums[]) {
        // sort the array
        Arrays.sort(nums);
        // return n-2, n= nums.length
        return nums[nums.length - 2];
    }

    // 2. Optimized Approach
    public static int secondLargest2(int[] nums) {

        if (nums.length < 2){
            return -1;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
               
            }

            else if (nums[i] < max1 && nums[i] > max2) {
                max2 = nums[i];
                
            }
        }
        if (max2 == Integer.MIN_VALUE && max1 != Integer.MIN_VALUE)
        return -1;

        return max2;
    }



    public static void main(String[] args) {
        int nums[] = { 10, 10, 10, 10, 10 };
        System.out.println(secondLargest1(nums));
        System.out.println(secondLargest2(nums));
    }
}

