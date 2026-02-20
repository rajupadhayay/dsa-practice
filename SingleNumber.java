import java.util.*;
public class SingleNumber {
    // 1. Bruteforce Approach
    public static int singleNumber1(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int count = 0;
            // count the occurrance of an element
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == number) {
                    count++;
                }

            }
            // if it occurr only once , return it
            if (count == 1) {
                return number;
            }

        }
        return -1;
    }
// 2. Optimized Approach
    public static int singleNumber2(int nums[]){

        int XOR = 0;
        for(int i=0;i<nums.length;i++){
            XOR^=nums[i];
        }
      return XOR;

    }
//3. Optimized Approach using HashMap

 public static int singleNumber3(int nums[]){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       
      for(int key : map.keySet()){
          if (map.get(key) == 1) {
        return key;
    }
}
    return -1;
}
    

    public static void main(String[] args) {
        int nums[] = { 4,1,2,1,2};
        System.out.println(singleNumber1(nums));
        System.out.println(singleNumber2(nums));
        System.out.println(singleNumber3(nums));
       
    }
}