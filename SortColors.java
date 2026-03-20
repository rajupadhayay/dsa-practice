public class SortColors {

    public static void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int start = 0;
        int end = n - 1;
        while (i <= end) {
            if (nums[i] == 0) {
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                i++;
                start++;
            } else if (nums[i] == 2) {
                int temp = nums[end];
                nums[end] = nums[i];
                nums[i] = temp;
                end--;
            } else {
                i++;
            }
        }
    }
    

    public static void main(String[] args) {
        int[] nums = { 2, 0, 1};
        sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}