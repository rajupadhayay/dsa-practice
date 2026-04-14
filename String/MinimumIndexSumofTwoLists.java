import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MinimumIndexSumofTwoLists{
 public static String[] findRestaurant1(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map1.containsKey(list2[i])) {
                int isum = map1.get(list2[i]) + i;
                map2.put(list2[i], isum);
            }
        }
        int min = Collections.min(map2.values());

        List<String> keys = new ArrayList<>();

        for (Map.Entry<String, Integer> e : map2.entrySet()) {
            if (e.getValue() == min) {
                keys.add(e.getKey());
            }
        }
        String[]ans = new String[keys.size()];
        for (int i = 0; i < keys.size(); i++) {
            ans[i]=keys.get(i);
        }
        return ans;
    }

    public static String[] findRestaurant2(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list2.length; i++) {
            if (map1.containsKey(list2[i])) {
                int sum = map1.get(list2[i]) + i;
                if (sum < minSum) {
                    result.clear();              
                    result.add(list2[i]);
                    minSum = sum;
                } 
                else if (sum == minSum) {
                    result.add(list2[i]);       
                }
            }
        }
        
        String[]ans = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i]=result.get(i);
        }
        return ans;
    }
    public static void main(String[]args){
        String  list1[] = {"Shogun","Tapioca Express","Burger King","KFC"};
        String list2[] = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        System.out.println(Arrays.toString(findRestaurant1(list1, list2)));
        System.out.println(Arrays.toString(findRestaurant2(list1, list2)));

    }
}
