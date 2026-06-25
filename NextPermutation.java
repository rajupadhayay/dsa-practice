public class NextPermutation {
    public static int pivot(int nums[]){
         int pivot = -1;
       for(int i=nums.length-2;i>=0;i--){
           
            if(nums[i]< nums[i+1]){
                
                pivot = i;
                break;
            }
        }
        return pivot;
     } 
     
     public static void reverse(int nums[],int start,int last){
        while(start<=last){
            int temp = nums[last];
            nums[last] = nums[start];
            nums[start] =temp;
            start++;
            last--;
        }
     }
      public static int rightMostElement(int nums[],int pivot){
         int RME = -1;
        
       for(int i=nums.length-1;i>pivot;i--){
           if(nums[pivot]<nums[i]){
            RME = i;
            break;
           }
            
        }
        return RME;
     } 
      public static void nextPermutation(int[] nums) {
        
        int pivot = pivot(nums);
        if(pivot == -1){
            reverse(nums,0,nums.length-1);
            return;
        }
        int RME = rightMostElement(nums,pivot);
        
        int temp = nums[pivot];
        nums[pivot] = nums[RME];
        nums[RME] = temp;

        reverse(nums,pivot+1,nums.length-1);
       
    }
     
    
    public static void main(String[] args) {
        int nums[] = {1,3,2,4,5};
       nextPermutation( nums);
       for(int i=0;i<nums.length;i++){
           System.out.print(nums[i] + " ");
       }
    
}
}