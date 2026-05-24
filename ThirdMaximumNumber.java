public class ThirdMaximumNumber{
    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int i = 0;i<nums.length;i++){
            if ((long)nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }
            else if ((long)nums[i] > second && (long)nums[i] != first){
                third = second;
                second = nums[i];
            }
            else if ((long)nums[i] > third && (long)nums[i] != second && (long)nums[i] != first){
                third = nums[i];
            }
            
        }
        return (int)(third == Long.MIN_VALUE ? first : third);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(thirdMax(nums));
    }
}