import java.util.HashSet;

public class DistributeCandies {
    public static int distributeCandies(int[] candyType) {
      HashSet<Integer> set  = new HashSet<>();
      for(int i =0;i<candyType.length;i++){
        set.add(candyType[i]);
      }  
      if(set.size()<(candyType.length/2))return set.size();
      return candyType.length/2;
    }

    public static void main(String[] args) {
        int [] candyType = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
}