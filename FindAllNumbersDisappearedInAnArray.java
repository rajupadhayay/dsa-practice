import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

     public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
      List<Integer> ls = new ArrayList<>();
      int n = nums.length;
      for(int i =0;i<n;i++){
        set.add(nums[i]);
      }
      for(int i =0;i<n;i++){
       if(!set.contains(i+1)){
        ls.add(i+1);
       }
      }
      return ls;
    }
    public static void main(String[] args) {
    int []nums = {4,3,2,7,8,2,3,1};
    System.out.println(findDisappearedNumbers(nums));  
    }
}
   
