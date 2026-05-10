import java.util.Arrays;
import java.util.HashMap;

public class NextGreaterElementI {
     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i =0;i<nums2.length;i++){
        map.put(nums2[i],i);
      } 
     int []ans = new int [nums1.length];
      for(int i =0;i<nums1.length;i++){
          ans[i] = -1;
         int j =(map.get(nums1[i])+1);
         while(j < nums2.length){
        if(nums1[i]<nums2[j]){
             ans[i] = nums2[j];
             break;
        }
        j++;
       
      }
      } 
return ans;
    }

    public static void main(String[] args) {
        int [] nums1 = {4,1,2};
      int [] nums2 = {1,3,4,2};
       System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));;
    }
}