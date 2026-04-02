import java.util.*;
public class ContainsDuplicatesII{
 /*
 * Approach:
 * - Use a HashMap to store each element and its last seen index.
 * - If the element is already present, calculate the index difference.
 * - If the difference is less than or equal to k, return true.
 */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                int pre =map.get(nums[i]);
                if (i - pre <=k) {
                    return true;
                } 
            }
                map.put(nums[i], i);
           
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,3};
        int k=3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}