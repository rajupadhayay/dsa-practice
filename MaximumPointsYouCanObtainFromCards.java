public class MaximumPointsYouCanObtainFromCards {
     public static int maxScore(int[] cardPoints, int k) {
        int total_sum = 0;
        int n = cardPoints.length;
        for(int i=0;i<n;i++){
            total_sum+=cardPoints[i];
        }
        if (k==n)return total_sum;
        int window = n-k;
        int sum = 0;
        int min_window = Integer.MIN_VALUE;
        for(int i=0;i<window;i++){
            sum+=cardPoints[i];
        }
        min_window =Math.max(sum, min_window);
        for(int i=1;i<=n-window;i++){
            sum = sum - cardPoints[i-1] + cardPoints[i+window-1];
            min_window =Math.min(sum, min_window);
        }

        return total_sum-min_window;
    }
    public static void main(String[] args) {
        int []  cardPoints  = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore( cardPoints, k));

    }
}