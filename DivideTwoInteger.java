public class DivideTwoInteger {
    public static int divide(int dividend, int divisor) {

        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Convert to positive long values
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int ans = 0;

        while (dvd >= dvs) {

            int count = 0;

            while (dvd >= (dvs << (count + 1))) {
                count++;
            }

            ans += (1 << count);
            dvd -= (dvs << count);
        }

        // Apply sign
        if ((dividend < 0) ^ (divisor < 0)) {
            ans = -ans;
        }

        return ans;
    }
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        System.out.println(divide(dividend, divisor));
    }
}
