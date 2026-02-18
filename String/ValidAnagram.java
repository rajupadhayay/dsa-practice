// Problem: Valid Anagram
// Platform: LeetCode (242)
import java.util.*;

public class ValidAnagram {

// Approach 1: Bruteforce Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(n)
    public static boolean isAnagram1(String s, String t) {
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

  // Approach 2: Frequency Array
// Time Complexity: O(n)
// Space Complexity: O(1)
    public static boolean isAnagram2(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        int count[] = new int[26];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<count.length;i++){
            if (count[i]!=0) {
                return false;
            }
        }
        return true;
    }

// Approach 3: HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)
    public static boolean isAnagram3(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i=0;i<s.length();i++){
            char ch = t.charAt(i);
            if (!map.containsKey(ch)) {
                return false;
            } else if (map.get(ch)==1) {
                map.remove(ch);
            } else {
                map.put(ch, map.get(ch)-1);
            }
        }

        return map.size()==0;
    }

    public static void main(String[]args){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram1(s, t));
        System.out.println(isAnagram2(s, t));
        System.out.println(isAnagram3(s, t));
    }
}
