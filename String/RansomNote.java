import java.util.HashMap;
public class RansomNote {

    
    //   Approach 1: Using HashMap
     
    //  Time Complexity: O(n + m)
    //   Space Complexity: O(k)  (k = unique characters)
    
    public static boolean canConstruct1(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters from magazine
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Check ransomNote characters
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (!map.containsKey(ch)) {
                return false;
            } 
            else if (map.get(ch) == 1) {
                map.remove(ch);
            } 
            else {
                map.put(ch, map.get(ch) - 1);
            }
        }

        return true;
    }

    
    //  Approach 2: Using Array (Optimized)

     
    //   Time Complexity: O(n)
    //   Space Complexity: O(1)  
     
    public static boolean canConstruct2(String ransomNote, String magazine) {

        int count[] = new int[26];

        // Increment count for ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            count[ransomNote.charAt(i) - 'a']++;
        }

        // Decrement count using magazine
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']--;
        }

        // Check remaining counts
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        String ransomNote = "aa";
        String magazine = "aab";

        System.out.println(canConstruct1(ransomNote, magazine));
        System.out.println(canConstruct2(ransomNote, magazine));
    }
}
