import java.util.HashMap;

public class SumOfUniqueElements {
    // Approach 1: Using HashMap
    public static int sumOfUnique1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                sum += key;
            }
        }
        return sum;

    }

    // Approach 2: Using Frequency Array
    public static int sumOfUnique2(int[] nums) {
        int count[] = new int[101];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] argas) {
        int nums[] = { 1, 2, 3, 2 };

        System.out.println(sumOfUnique1(nums));
        System.out.println(sumOfUnique2(nums));
    }
}