import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// BruteForce 
public class SubstringwithConcatenationofAllWords {
    public static List<Integer> findSubstring(String s, String words[]) {
        List<Integer> ls = new ArrayList<Integer>();
        int tLength = words[0].length() * words.length;
        HashMap<String, Integer> target = new HashMap<>();
        for (String w : words) {
            target.put(w, target.getOrDefault(w, 0) + 1);

        }

        for (int i = 0; i < s.length() - tLength + 1; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < words.length; j++) {
                String word = s.substring(i + j * words[0].length(),
                        i + (j + 1) * words[0].length());
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            if (map.equals(target)) {
                ls.add(i);
            }
        }
        return ls;

    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = { "foo", "bar" };
        System.out.println(findSubstring(s, words));
    }
}