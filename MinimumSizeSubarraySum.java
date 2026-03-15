public class MinimumSizeSubarraySum{ 
    public static int minSubArrayLen(int target, int[] nums) {
    int min_len = Integer.MAX_VALUE;
    int sum =0;
    int i =0;
    for(int j=0;j<nums.length;j++){
        sum+=nums[j];
       
        while (sum>=target) {
          int  len = j-i+1;
            min_len = Math.min(len, min_len);
            sum-=nums[i];
            i++;
        
        }
    }
    return (min_len==Integer.MIN_VALUE)?0:min_len;
    }

    public static void main(String[] args) {
      int   target = 7;
      int[] nums = {2,3,1,2,4,3};
System.out.println(minSubArrayLen(target, nums));
    }
}