import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class MajorityElementII{
        public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        for(int key : map.keySet()){
            if(map.containsKey(key)&& map.get(key)>(nums.length/3)) ls.add(key);
        }
        return ls;
    }

    public static void main(String[] args) {
        int nums[] = {3,2,3};
System.out.println(majorityElement(nums));
    }
}