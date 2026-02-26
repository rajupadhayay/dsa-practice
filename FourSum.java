import java.util.*;
class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
          List<List<Integer>> list = new ArrayList<>();
       Arrays.sort(nums);
       int n=nums.length;
       for(int i =0;i<nums.length;i++){
        for(int j=i+1;j<n;j++){
            int start = j+1;
            int end = n-1;
           if(i>0 && nums[i]==nums[i-1]) continue;
if(j>i+1 && nums[j]==nums[j-1]) continue;
            while (start<end) {
                int sum = nums[i] + nums[j] + nums[start] +nums[end];
                if (sum == target) {
                    list.add(Arrays.asList( nums[i] , nums[j] , nums[start] , nums[end]));
               start++;
               end--;

               while (start<end && nums[start] == nums[start-1]) {
                start++;
               }
                while (start<end && nums[end] == nums[end+1]) {
                end--;
               }
                }
                else if (sum<target) {
                          start++;
                }
                else{
                    end--;
                }
            }
        }
       } 
       return list;
    }
    public static void main(String[]args){
        int nums [] = {1,0,-1,0,-2,2};
        int target = 0;
       System.out.println( fourSum(nums, target));
    }
}