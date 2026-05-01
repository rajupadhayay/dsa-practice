import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
     public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ls = new ArrayList<>();
        if (candies.length == 0)
            return ls;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] > max))
                max = candies[i];

        }

        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies >= max))
                ls.add(true);
            else
                ls.add(false);
        }
        return ls;
    }

    public static void main(String[] args) {
       int [] candies = {2,3,5,1,3}; 
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}