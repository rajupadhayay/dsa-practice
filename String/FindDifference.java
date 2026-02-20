import java.util.HashMap;

public class FindDifference {


    public static char findTheDifference1(String s, String t) {
        int count[] = new int[26];
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1)
                return (char) (i + 'a');
        }
        return '\0';
    }

    public static char findTheDifference2(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
           map.put(ch, map.get(ch)-1);

        }
        for (char key : map.keySet()) {
           if(map.get(key)==1)return key;
        }
        return '\0';
    }

    public static char findTheDifference3(String s, String t) {
         char[] c1 = s.toCharArray();
         char[] c2 = t.toCharArray();
         char ans =0;
        for(int i=0;i<c1.length;i++){
            ans^=c1[i];
        }
        for(int i=0;i<c2.length;i++){
            ans^=c2[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abecd";
        System.out.println(findTheDifference1(s, t));
        System.out.println(findTheDifference2(s, t));
        System.out.println(findTheDifference3(s, t));
    }
}