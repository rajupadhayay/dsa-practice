public class NumberOfSubArraysOfSizeKAndAvgGreaterThanOrEqualsToThreshold {



     public static int numOfSubarrays1(int[] arr, int k, int threshold) {
       int n = arr.length;
        int count = 0;
        for(int i=0;i<=n-k;i++){
            int sum =0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            if (sum >= k*threshold) {
                count++;
            }
        }
        return count; 
    }
    public static int numOfSubarrays2(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;
      
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        
        if (sum >= k*threshold)count++;
        for (int i = 1; i < n - k + 1; i++) {
            sum = sum - arr[i - 1] + arr[i + k - 1];
            if (sum >= k*threshold)
                count++;
        }
        return count;
    }

    public static void main(String[] arsg) {
        int arr[] = { 2, 2, 2, 2, 5, 5, 5, 8 };
        int k = 3;
        int threshold = 4;
        System.out.println(numOfSubarrays1(arr, k, threshold));
        System.out.println(numOfSubarrays2(arr, k, threshold));
    }
}