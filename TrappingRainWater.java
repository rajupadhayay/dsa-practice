public class TrappingRainWater {
    public  static int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int left = 0;
        int right = n - 1;

        int leftMax = 0;
        int rightMax = 0;

        int total = 0;

        while (left < right) {

            if (height[left] < height[right]) {

                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    total += leftMax - height[left];
                }

                left++;

            } else {

                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    total += rightMax - height[right];
                }

                right--;
            }
        }

        return total;
    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}