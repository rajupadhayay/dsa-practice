import java.util.*;
public class ThreeSumClosest {
    public static int  threeSumClosest(int[] nums, int target) {
     Arrays.sort(nums);
    int n=nums.length;
    int min_diff = Integer.MAX_VALUE;
    int ans =0;
    for(int i=0;i<n-2;i++){
        int left =i+1;
        int rigth = n-1;
        while (left < rigth) {
          int sum = nums[i]+ nums[left]+ nums[rigth];
          int diff = Math.abs(sum-target);

          if (diff<min_diff) {
            min_diff = diff;
            ans =sum;
          }

          if (sum < target) {
            left++;
          }
          else{
            rigth--;
          }
        }
    } 
       return ans; 

    }

    public static void main(String[] args) {
        int[] nums = { -1,2,1,-4 };
        int target = 1;
       
    System.out.println(threeSumClosest(nums, target));
    }
}