public class BestTimeToBuyAndSellStock {

    // Optimal Approach (O(n), O(1))
    public static int maxProfit1(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }

    // Brute Force Approach (O(n²), O(1))
    public static int maxProfit2(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Optimal Approach Profit    : " + maxProfit1(prices));
        System.out.println("Brute Force Approach Profit: " + maxProfit2(prices));
    }
}