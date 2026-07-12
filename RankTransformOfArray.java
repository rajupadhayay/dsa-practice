import java.util.*;
public class RankTransformOfArray {

    public static int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int nums[] = arr.clone();
       Arrays.sort(nums);
       int rank =1;
       for(int i=0;i<nums.length;i++){
        if(!map.containsKey(nums[i])){
            map.put(nums[i],rank++);
        }
       }
       
       for(int i=0;i<nums.length;i++){
        arr[i] = map.get(arr[i]);
       }
       return arr;
    }
public static void main(String[] args) {
    int arr[] = {10,40,20,30};
    System.out.println(Arrays.toString(arrayRankTransform(arr)));
}
}
