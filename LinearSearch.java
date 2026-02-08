public class LinearSearch {

    public static int  linearSearch(int nums[], int Target){
        for(int i=0;i<nums.length;i++){
            if (nums[i]== Target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int nums[] = {10,22,5,44,11,2};
        int Target = 44; 
        int ans = linearSearch(nums, Target);
        if (ans==-1) {
            System.out.println("Element not fount");
        }else{
             System.out.println("Element fount at index : " + ans);
        }
       
    }
}