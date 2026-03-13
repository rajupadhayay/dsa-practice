import java.util.Arrays;

public class PermutationInString{
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()) {
            return false;
        }
  int count[] = new int[26];
  int check [] = new int [26];
  for(int i = 0;i<s1.length();i++){
    check[s1.charAt(i)-'a']++;
  }
   for(int i = 0;i<s1.length();i++){
    count[s2.charAt(i)-'a']++;
  }
  if(Arrays.equals(check, count))return true;
  for(int i =1;i<=s2.length()-s1.length();i++){
    count[s2.charAt(i-1)-'a']--;
    count[s2.charAt(i+s1.length()-1)-'a']++;
    if(Arrays.equals(check, count))return true;
  }
  return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
System.out.println(checkInclusion(s1, s2));
    }
}