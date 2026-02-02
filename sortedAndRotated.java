class sortedAndRotated {
    public static boolean check(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int next = nums[(i+1)%nums.length];
            if (nums[i]>=next) {
                count++;
            }

        }
        return count<=1;
    }

    public static void main(String[]args){
        int nums[]={1,1,1};
       System.out.println(check(nums));
    }
}
