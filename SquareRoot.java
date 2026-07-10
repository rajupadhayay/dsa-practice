public class SquareRoot {
   // BruteForce  Approach - O(√n)
    public static int floorSqrt1(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            int sqr = i * i;
            if (sqr <= n) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }
    // optimal Approach - log(n)
    public static int floorSqrt2(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int left = 1;
        int right = n;
        int ans = 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            long sqr = (long) mid * mid;

            if (sqr == n) {
                return mid;
            } else if (sqr < n) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 36;
        System.out.println(floorSqrt1(n));
        System.out.println(floorSqrt2(n));
    }
}