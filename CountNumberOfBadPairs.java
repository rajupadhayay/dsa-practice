import java.util.HashMap;
import java.util.Map;

public class CountNumberOfBadPairs {
    public static long countBadPairs(int[] nums) {
      int n = nums.length;
     long tp = (long)n*(n-1)/2;
     
      long gp=0;
    
      Map<Integer,Long> map=new HashMap<>();
      for(int i=0;i<n;i++){
        int key = nums[i]-i;
        if(map.containsKey(key)){
            gp+=map.get(key);
        }
        map.put(key,map.getOrDefault(key,0L)+1);
      } 
      
      return tp-gp;
    }

    public static void main(String[] args) {
        int []nums = {4,1,3,3};
        System.out.println(countBadPairs(nums));
    }
}