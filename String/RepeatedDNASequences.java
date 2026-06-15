import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedDNASequences {
    public static List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        for(int right=0;right<s.length()-10+1;right++){
            String DNA   = s.substring(right,right+10);
            if(set2.contains(DNA)){
                set1.add(DNA);
            }
            set2.add(DNA);
        }
        return new ArrayList<>(set1);
    }

    public static void main(String[] args) {
       String  s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(s));
    }
}