import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class KeyboardRow {

    public static String[] findWords(String[] words) {
        // List to store valid words
        List<String> ls = new ArrayList<>();

        // Define keyboard rows using HashSet for O(1) lookup
        HashSet<Character> set1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        HashSet<Character> set2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        HashSet<Character> set3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));

        // Traverse each word
        for (int i = 0; i < words.length; i++) {
            // Convert word to lowercase for uniform comparison
            String w = words[i].toLowerCase();

            // Take first character to determine which row to check
            char h = w.charAt(0);

            boolean f = true; // flag to check if word is valid
            int row = 0;      // store which row the word belongs to

            // Identify the row of first character
            if (set1.contains(h)) row = 1;
            else if (set2.contains(h)) row = 2;
            else row = 3;

            // Check remaining characters of the word
            for (int j = 1; j < w.length(); j++) {
                char s = w.charAt(j);

                // If any character is not in the same row → invalid word
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

            // If all characters belong to same row → add original word
            if (f) ls.add(words[i]);
        }

        // Convert List to Array and return
        return ls.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }
}