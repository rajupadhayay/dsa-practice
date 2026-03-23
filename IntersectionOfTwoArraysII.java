import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class IntersectionOfTwoArraysII {
    public static int[] intersect1(int[] nums1, int[] nums2){
        int n=nums1.length;
        int m=nums2.length;
       HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ls1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }
        for(int i=0;i<m;i++){
            if (map.containsKey(nums2[i]) && map.get(nums2[i])>0) {
                ls1.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }

        int result[]=new int[ls1.size()];
        int k =0;
        for(int val : ls1){
            result[k++]=val;
        }
       return result;
    }

 
     public static int[] intersect2(int[] nums1, int[] nums2){
        int n=nums1.length;
        int m=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ls1 = new ArrayList<>();
      int i =0;
      int j=0;
     while (i < n && j < m) {
    if (nums1[i] == nums2[j]) {
        ls1.add(nums1[i]);
        i++;
        j++;
    } 
    else if (nums1[i] < nums2[j]) {
        i++;
    } 
    else {
        j++;
    }
}

        int result[]=new int[ls1.size()];
        int k =0;
        for(int val : ls1){
            result[k++]=val;
        }
       return result;
    }
    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[] = {2,2};
        int ans1[] = intersect1(nums1, nums2);
        System.out.println(Arrays.toString(ans1));
        int ans2[] = intersect2(nums1, nums2);
        System.out.println(Arrays.toString(ans2));
    }
}