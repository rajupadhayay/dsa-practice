import java.util.*;
class WordPattern{
    public static boolean wordPattern(String pattern, String s) {
    HashMap<Character,String> map1 = new HashMap<>();
    HashMap<String,Character> map2 = new HashMap<>();
    int n = pattern.length();
    
    String[]words = s.split(" ");
    int m = words.length;
    if(n!=m)return false;
    for(int i =0;i<n;i++){
        char c = pattern.charAt(i);
        String w = words[i];
        if(map1.containsKey(c)){
            if(!map1.get(c).equals(w))return false;
        }
        map1.put(c,w);
        if(map2.containsKey(w)){
            if(!map2.get(w).equals(c))return false;
        }
        map2.put(w,c);
    }
    return true;
    }
    public static void main(String[] args) {
        String s = "abba";
        String pattern = "dog cat dog cat";
        System.out.println(wordPattern(pattern, s));
    }
}