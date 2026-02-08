public class LargestAndSmallest_Number {

    public static int largest_Number(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if (nums[i]>max) {
                max = nums[i];
            }
        }
        return max;
    }
    public static int Smallest(int nums[]){
        int min = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            if (nums[i]<min) {
                min = nums[i];
            }
        }
        return min;
    }
    public static void main(String [] args){
        int nums[] = {10,22,5,44,11,2};
       
        System.out.println(Smallest(nums));
         System.out.println(largest_Number(nums));

    }
}