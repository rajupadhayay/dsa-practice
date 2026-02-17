import java.util.Arrays;

public class TwoSumII {
     public static int[] twoSum(int[] numbers, int target) {
        int start =0;
        int end =numbers.length-1;

        while (start<end) {

                if (numbers[start]+numbers[end]==target) {
                    return new int[]{start+1,end+1};
                }
                if (numbers[start]+numbers[end]>target) {
                    end--;
                }
                if (numbers[start]+numbers[end]<target) {
                    start++;
                }
            
        }
        return null;
     }
    public static void main(String[]args){
        int numbers[] ={2,7,11,15,17};
        int target = 9;
        int ans[] = twoSum(numbers, target);
        System.out.println(Arrays.toString(ans));
    }
}