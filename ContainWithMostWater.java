public class ContainWithMostWater {
  public static int maxArea1(int[] height) {
    int max_Water = 0;
    for (int i = 0; i < height.length - 1; i++) {
      for (int j = i + 1; j < height.length; j++) {
        int len = j - i;
        int width = Math.min(height[i], height[j]);
        int curr_area = len * width;
        max_Water = Math.max(curr_area, max_Water);
      }
    }
    return max_Water;
  }

  public static int maxArea2(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int max_Water = 0;
    while (left < right) {
      int length = right - left;
      int width = Math.min(height[left], height[right]);
      int area = length * width;
      max_Water = Math.max(area, max_Water);
      if (height[left] < height[right])
        left++;
      else
        right--;
    }
    return max_Water;
  }

  public static void main(String[] args) {
    int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    System.out.println(maxArea1(height));
    System.out.println(maxArea2(height));
  }
}