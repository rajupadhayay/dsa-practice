public class MergeSortedArray{
     public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
     int pos =0;
     int result []= new int[m+n];
     while (i<m && j<n) {
        if (nums1[i]>nums2[j]) {
            result[pos++] = nums2[j];
            j++;
        }
        else{
            result[pos++] = nums1[i];
            i++;
        }
     } 
     
     while (i<m) {
        result[pos++] = nums1[i];
      i++;
     }
      while (j<n) {
        result[pos++] = nums2[j];
      j++;
     }
     for(int z=0;z<result.length;z++){
nums1[z] = result[z];
     }
     
    }
    public static void main(String[]args){
       int  nums1 []= {1,2,3,0,0,0};
       int  m = 3;
        int  nums2[] = {2,5,6};
        int   n = 3;
        merge(nums1, m, nums2, n);
        for(int z=0;z<nums1.length;z++){
System.out.print(nums1[z] +" ");
     }
    }
}