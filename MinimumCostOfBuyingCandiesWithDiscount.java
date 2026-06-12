import java.util.*;
public class MinimumCostOfBuyingCandiesWithDiscount{
    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int total = 0;
        int count = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            count++;
            if (count == 3) {
                count = 0; 
                continue;
            }
            total += cost[i];
        }
        return total;
    }
    public static void main(String[] args) {
      int []  cost = {6,5,7,9,2,2};
System.out.println(minimumCost(cost));
    }
}