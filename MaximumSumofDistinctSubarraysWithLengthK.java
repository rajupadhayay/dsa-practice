import java.util.HashMap;
import java.util.HashSet;

public class MaximumSumofDistinctSubarraysWithLengthK {
public static long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long sum = 0;
        long maxSum = 0;
        
        for (int i = 0; i < k; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                sum += nums[i];
        }
        
        if(map.size()==k)maxSum=sum;
       

        for (int i = 1; i <= nums.length - k; i++) {
                map.put(nums[i+k-1],map.getOrDefault(nums[i+k-1],0)+1);
                map.put(nums[i-1],map.getOrDefault(nums[i-1],0)-1);
                if (map.get(nums[i-1])==0) {
                    map.remove(nums[i-1]);
                }
                sum = sum - nums[i-1]+nums[i+k-1];
              if(map.size()==k)maxSum=sum;
               
            }
                  
    
        return maxSum;
    }
    public static void main(String[] args) {
    int[]  nums = {1,4,4,2,9,9,9};
    int k = 3;
    System.out.println(maximumSubarraySum(nums, k));
    }
}