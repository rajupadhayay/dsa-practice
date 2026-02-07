public class SingleNumber {
    // 1. Bruteforce Approach
    public static int singleNumber1(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int count = 0;
            // count the occurrance of an element
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == number) {
                    count++;
                }

            }
            // if it occurr only once , return it
            if (count == 1) {
                return number;
            }

        }
        return -1;
    }

    public static int singleNumber2(int nums[]){
        int XOR = 0;
        for(int i=0;i<nums.length;i++){
            XOR^=nums[i];
        }
      //  XOR^=nums.length;
      return XOR;

    }

    public static void main(String[] args) {
        int nums[] = { 4,1,2,1,2};
      //  System.out.println(singleNumber1(nums));
        System.out.println(singleNumber2(nums));
    }
}