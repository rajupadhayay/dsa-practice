import java.util.HashMap;
import java.util.HashSet;

public class JewelsAndStones {

    public static int numJewelsInStone1(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            map.put(jewels.charAt(i), 1);
        }
        for (int i = 0; i < stones.length(); i++) {
            if (map.containsKey(stones.charAt(i)))
                count++;
        }
        return count;
    }

   
     public static int numJewelsInStones2(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i)))
                count++;
        }
        return count;
    }
     public static int numJewelsInStones3(String jewels, String stones) {
        int Frequency[] =  new int [128];
        int count =0;
        for(int i =0;i<stones.length();i++){
            Frequency[stones.charAt(i)]++;
        }
    for(int i =0;i<jewels.length();i++){
            count+=Frequency[jewels.charAt(i)];
        }
        return count;
    }



    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbb";
        System.out.println(numJewelsInStone1(jewels, stones));
        System.out.println(numJewelsInStones2(jewels, stones));
          System.out.println(numJewelsInStones3(jewels, stones));
    }
}