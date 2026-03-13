import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
       List<Integer> ls = new ArrayList<>();
       int check[] = new int[26];
       int count [] = new int[26];
       if (p.length()>s.length()) {
        return ls;
       }
       for(int i= 0;i<p.length();i++){
        check[p.charAt(i)-'a']++;
       }
        for(int i= 0;i<p.length();i++){
        count[s.charAt(i)-'a']++;
       }
    if(Arrays.equals(check, count)) ls.add(0);
    
    for(int i= 1;i<=s.length()-p.length();i++){
        count[s.charAt(i-1)-'a']--;
        count[s.charAt(i+p.length()-1)-'a']++;
        if(Arrays.equals(check, count)) ls.add(i);
       }
    return ls;
    }
    public static void main(String[] args) {
       String s = "cbaebabacd";
       String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
}