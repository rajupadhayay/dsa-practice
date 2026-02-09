public class BinarySearch {

    public static int binarySearch(int nums[], int target){
        int start =0;
        int end = nums.length-1;
      
        while (start<=end) {
              int mid = start +(end-start)/2;
            if (nums[mid]==target) {
                return mid;
            }
            else if (nums[mid]>target) {
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;

    }
    public static void main(String[]args){
        int nums[] = {10,20,30,33,44,54,66,69};
        int target = 33;
        System.out.println(binarySearch(nums, target));

    }
}