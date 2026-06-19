import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentWords {

    public static List<String> topKFrequent(String[] words, int k) {
       
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
         List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a.compareTo(b);
            }
            return map.get(b) - map.get(a);
        });
return list.subList(0, k);
    }
    public static void main(String[] args) {
        String words[] ={"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.println(topKFrequent(words, k));
    }
}