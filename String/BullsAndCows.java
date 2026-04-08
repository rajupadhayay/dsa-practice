import java.util.HashMap;

public class BullsAndCows {
    // APPROACH 1: Using frequency array (Optimal - O(n), O(1) space)
    public static String getHint1(String secret, String guess) {
      int count[] = new int[10];
      int bull =0;
      int cow = 0;
      for(int i =0;i<secret.length();i++){
        if(secret.charAt(i)==guess.charAt(i))bull++;
        else{
            count[(int)(secret.charAt(i)-'0')]++;
        }
      }
      for(int i =0;i<secret.length();i++){
      if(secret.charAt(i)==guess.charAt(i))continue;
      int p = (int)(guess.charAt(i)-'0');
      if(count[p]>0){
        count[p]--;
        cow++;
      }
      }
      
        String ans = bull + "A" + cow + "B";
        return ans;
    }
     // APPROACH 2: Using HashMap (Less optimal but intuitive)
    public static String getHint2(String secret, String guess) {
      HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int count = 0;
        for (int i = 0; i < secret.length(); i++) {
            map1.put(secret.charAt(i), map1.getOrDefault(secret.charAt(i), 0) + 1);
        }
          for (int i = 0; i < guess.length(); i++) {
            map2.put(guess.charAt(i), map2.getOrDefault(guess.charAt(i), 0) + 1);
        }
       for(char key : map1.keySet()){
        if(map2.containsKey(key))count = count+Math.min(map1.get(key),map2.get(key));
       }
        int bull = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (guess.charAt(i) == secret.charAt(i))
                bull++;
        }
        int cow = count - bull;
        String ans = bull + "A" + cow + "B";
        return ans;
    }

    public static void main(String[] args) {
       String secret = "1807";
       String guess = "7810";
    System.out.println(getHint1(secret, guess));
        System.out.println(getHint2(secret, guess));
        

    }
}