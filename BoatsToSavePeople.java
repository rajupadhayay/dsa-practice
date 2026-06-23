import java.util.Arrays;
// TC O(N)
public class BoatsToSavePeople {
     public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
      int start = 0;
      int end = people.length-1;
      int boats =0;
      while(start<=end){
        if(people[start]+people[end]<=limit)start++;
        end--;
        boats++;
      } 
      return boats; 
    }

    public static void main(String[] args) {
       int []  people = {1,2}; 
       int limit = 3;
       System.out.println(numRescueBoats(people, limit));

    }
}
