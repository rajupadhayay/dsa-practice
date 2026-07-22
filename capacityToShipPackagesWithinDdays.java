import java.util.Arrays;

public class capacityToShipPackagesWithinDdays {
     public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
     
        while(low<=high){
            int mid = low + (high-low)/2;
                int sum =0;
                   int requiredDay = 1;
            for(int weight : weights){
                if(sum+weight<=mid){
                    sum+=weight;
                }
                else{
                    requiredDay++;
                    sum = weight;
                }
            }
        if(requiredDay<=days){
            high = mid-1;
         
        }
        else{
               low = mid+1;
        }

        }
        return low;
    }
}
