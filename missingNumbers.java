public class missingNumbers {
// 1. first approach  using substitution method
    // Method to find the missing number
    public static int findMissingNumber(int[] nums) {

        int n = nums.length;

        // Expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;

        // Actual sum of array elements
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }

        // Missing number
        return expectedSum - actualSum;
    }
    // 2. second approach using XOR method
    public static int MissingNumber(int nums[]){
       int XOR =0;
       int n=nums.length;
       for(int i=0;i<n;i++){
        XOR^=i;
       }
    XOR ^= n; 
       for(int i =0;i<n;i++){
        XOR^=nums[i];
       }
       return XOR;
    }


    public static void main(String[] args) {

        int[] nums = {0,1};

        System.out.println(findMissingNumber(nums));
       System.out.println(MissingNumber(nums));
    }
}
