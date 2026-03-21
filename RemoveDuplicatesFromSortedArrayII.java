public class RemoveDuplicatesFromSortedArrayII {
     public static int removeDuplicates(int[] nums) {
      int k =2;
      int n = nums.length;
      for(int j=2;j<nums.length;j++){
        if(nums[j]!=nums[k-2]){
            nums[k]=nums[j];
         k++;
      
      } 
     
    } 
    return k; 
    }
    public static void main(String[] args) {
    int[] nums = {2,6,6,8,8};
    int ans = removeDuplicates(nums);
        System.out.println(ans);
    }
}