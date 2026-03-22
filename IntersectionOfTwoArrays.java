import java.lang.reflect.Array;
import java.util.*;

public class IntersectionOfTwoArrays {
    public static int[] intersection1(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }

            }
        }
        int result[] = new int[set.size()];
        int k = 0;
        for (int num : set) {
            result[k++] = num;
        }
        return result;
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
     
        for(int i=0;i<n;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<m;i++){
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        int result[] = new int[set2.size()];
        int k = 0;
        for (int num : set2) {
            result[k++] = num;
        }
        return result;

    }
    public static int[] intersection3(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        ArrayList<Integer>ls = new ArrayList<>();
        while(i<n&&j<m){
             if (nums1[i] == nums2[j]) {
            if(ls.isEmpty()||ls.get(ls.size()-1)!=nums1[i]){
                ls.add(nums1[i]);
            }
            i++;
            j++;
        }
           else if(nums1[i]<nums2[j]){
              i++;
            }
            else{
                j++;
            }
        }
        int result[] = new int[ls.size()];
        int k = 0;
        for (int num : ls) {
            result[k++] = num;
        }
        return result;

    }
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 2, 1 };
        int nums2[] = { 2, 2 };
        int ans1[] = intersection1(nums1, nums2);
        System.out.println(Arrays.toString(ans1));
         int ans2[] = intersection2(nums1, nums2);
        System.out.println(Arrays.toString(ans2));
          int ans3[] = intersection3(nums1, nums2);
        System.out.println(Arrays.toString(ans3));
    }
}