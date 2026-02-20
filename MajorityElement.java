import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
// using Sorting method
// Time Complexity: O(n log n)
// Space Complexity: O(1)
public  static int majorityElement1(int[] nums) {
 Arrays.sort(nums);
        int count =1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
            else{
            count =1;
        }
        if(count>nums.length/2){
            return nums[i];
        }
        }
        return -1;
    }
// using HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)
public  static int majorityElement2(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }  
        for(int key : map.keySet()){
            if(map.get(key)>nums.length/2){
                return key;
            }
        }
        
    
    return -1;
    }
    public static void main(String[]args){
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement1(nums));
         System.out.println(majorityElement2(nums));
    }
}