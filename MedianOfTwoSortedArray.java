public class MedianOfTwoSortedArray {

   
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int  n = (nums1.length + nums2.length);
        int arr[] = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length && k < n) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i];
                i++;
            } else {
                arr[k++] = nums2[j];
                j++;
            }
        }
        while(i < nums1.length){
            arr[k++] = nums1[i];
            i++;
        }
         while(j < nums2.length){
            arr[k++] = nums2[j];
            j++;
        }
       if (n % 2 == 1) {
            return arr[n / 2];
        }

        return (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
    }
}
