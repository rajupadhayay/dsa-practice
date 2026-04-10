import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class KeyboardRow {

    public static String[] findWords(String[] words) {
        List<String> ls = new ArrayList<>();

        HashSet<Character> set1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        HashSet<Character> set2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        HashSet<Character> set3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));

        for (int i = 0; i < words.length; i++) {
            String w = words[i].toLowerCase();
            char h = w.charAt(0);

            boolean f = true;
            int row = 0;

            if (set1.contains(h)) row = 1;
            else if (set2.contains(h)) row = 2;
            else row = 3;

            for (int j = 1; j < w.length(); j++) {
                char s = w.charAt(j);

                if (row == 1 && !set1.contains(s)) {
                    f = false;
                    break;
                }
                if (row == 2 && !set2.contains(s)) {
                    f = false;
                    break;
                }
                if (row == 3 && !set3.contains(s)) {
                    f = false;
                    break;
                }
            }

            if (f) ls.add(words[i]);
        }

        return ls.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }
}