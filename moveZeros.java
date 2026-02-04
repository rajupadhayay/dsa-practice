public class moveZeros {
  public static void moveZeroes(int[] nums) {
       int count = 0;
       // move all non zero to front
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[count++]=nums[i];
        }
       }
       // fill remaining with zero
        while(count<nums.length){
            nums[count++]=0;
        
       }

    }

    public static void main(String[] args) {
        int nums[] = { 0,1,0,3,12 };
        moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] +" ");
        }
    }
}