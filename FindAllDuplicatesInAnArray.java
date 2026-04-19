import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public  static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> ls = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                ls.add(key);
            }
        }
        return ls;
    }
    public static void main(String[]args){
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));

    }
}
