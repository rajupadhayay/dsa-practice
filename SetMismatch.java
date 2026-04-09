import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SetMismatch {
 public static int[] findErrorNums1(int[] nums) {
        int n = nums.length;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);

    }
    int duplicate = -1;
        int missingNum = -1;
    for(int i=1;i<=n;i++){
        if(map.getOrDefault(i, 0)==2){
             duplicate = i;
        }
    if(map.getOrDefault(i, 0) == 0){
             missingNum =i;
        }
       
    }
     return new int []{duplicate,missingNum};
    }
    public static int[] findErrorNums2(int[] nums) {
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();
        int actual_sum = n * (n + 1) / 2;

        int sum = 0;
        int duplicate = -1;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (set.contains(nums[i])) {
                duplicate = nums[i];
            } else {
                set.add(nums[i]);
            }
        }

        int missNum = actual_sum - (sum - duplicate);

        return new int[]{duplicate, missNum};
    }
    public static void main(String[] args) {
        int nums [] = {1,2,2,4};
System.out.println(Arrays.toString(findErrorNums1(nums)));
System.out.println(Arrays.toString(findErrorNums2(nums)));
    }
}