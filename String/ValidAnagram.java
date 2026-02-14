// Approach: Sorting
// Time: O(n log n)
// Space: O(n)
import java.util.*;
public class ValidAnagram {
   public static boolean isAnagram(String s, String t) {
    if(s.length()!= t.length()){
        return false;
    }
        char[] ch1 = s.toCharArray();
        Arrays.sort(ch1);
        String s1 = new String(ch1);
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch2);
        String t1 = new String(ch2);
        return s1.equals(t1);
    }

    public static void main(String[]args){
    String s = "anagram";
    String t = "nagaram";
    System.out.println(isAnagram(s, t));

    }
}