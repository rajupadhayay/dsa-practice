public class ValidSubarraysWithMatchingSumDigitsI {
     public static int countValidSubarrays(int[] nums, int x) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            long sum = 0;
            for (int j = i; j < nums.length; j++) {

                sum += nums[j];
                int last =(int) Math.abs(sum % 10);
                long first = sum;
                while (first >= 10) {
                    first /= 10;
                }

                if (x == first && x == last) {
                    count++;
                }
               
            }

        }

        return count;

    }

    public static void main(String[] args) {
       int [] nums = {1,100,1};
        int x = 1;
        int ans=countValidSubarrays(nums, 1);
        System.out.println(ans);
    }
}