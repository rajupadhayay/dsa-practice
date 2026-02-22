import java.util.Arrays;

public class SqrOfSortedArray {
    public static int[] sortedSquares1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
     public static int[] sortedSquares2(int[] nums) {
      int start =0;
      int end = nums.length-1;
      int pos = nums.length-1;
      int result [] = new int[nums.length];
      while (start <= end) {
     int left = (int) Math.pow(nums[start], 2);
        int right = (int) Math.pow(nums[end], 2);
        if (left>right) {
            result[pos--] =left;
      start++;
        }
        else{
            result[pos--] =right;
   end--;
        }
      }
      return result;
      
    }

    public static void main(String[] args) {
        int nums[] = { -4, -1, 0, 3, 10 };
        int ans1[] = sortedSquares2(nums);
       
        System.out.println(Arrays.toString(ans1));
      
    }
}