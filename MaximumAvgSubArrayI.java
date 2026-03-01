public class MaximumAvgSubArrayI {
     public static double findMaxAverage(int[] nums, int k) {

      int curr =0;
      int n = nums.length;
      for(int i=0;i<k;i++){
      curr+=nums[i];
      }
    int max = curr;
    for(int i=1;i<=n-k;i++){
        curr = curr - nums[i-1] + nums[i+k-1];
        if(curr>max){
            max =curr;
        }
    }
    return max / (double) k;
    }
    public static void main(String[] args) {
      int nums [] = {1,12,-5,-6,50,3};
      int k = 4 ;
      System.out.println(findMaxAverage(nums,k)); 
    }
}