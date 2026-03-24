import java.util.HashMap;
public class FirstUniqueCharacterInaString {

    
    //   Approach 1 : Brute Force
    //   Idea : For each character, check if it appears anywhere else
    //   If not, return its index
    //   Time Complexity: O(n^2)
    //   Space Complexity: O(1)
    

    public static int firstUniqChar1(String s) {
        int n=s.length();
         for(int i=0;i<n;i++){
           boolean flag = true;
           for(int j=0;j<n;j++){
            if (i!=j&&s.charAt(i)==s.charAt(j)) {
                flag=false;
                break;
            }
           }
           if (flag) {
            return i;
           }
        }
        return-1;
    }
 
    //   Approach 2:    Frequency Array
    //   Idea : Count frequency of each character using array[26]
    //   Traverse again to find first character with frequency 1
    //   Time Complexity : O(n)
    //   Space Complexity: O(1)
       
    public static int firstUniqChar2(String s) {
        int n=s.length();
        int count[] = new int[26];
        for(int i=0;i<n;i++){
           count[s.charAt(i)-'a']++;
        }
         for(int i=0;i<n;i++){
            if (count[s.charAt(i)-'a']==1) {
                return i;
            }
        }
        return -1;
    }

    //   Approach 3:HashMap
    //   Idea : Store frequency using HashMap
    //   Traverse string again to find first unique character
    //   Time Complexity: O(n)
    //   Space Complexity: O(n)
    
    public static int firstUniqChar3(String s) {
        int n=s.length();
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
         for(int i=0;i<n;i++){
            if (map.containsKey(s.charAt(i))&&map.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        String s = "leetcode";
        System.out.println(firstUniqChar1(s));
        System.out.println(firstUniqChar2(s));
        System.out.println(firstUniqChar3(s));
    }
}