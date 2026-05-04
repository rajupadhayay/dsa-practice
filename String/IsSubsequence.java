public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
       int slow = 0;
       int fast = 0;
       while(slow<s.length() && fast<t.length()){
        if(s.charAt(slow)!=t.charAt(fast)){
            fast++;
        }
        else{
            slow++;
             fast++;
        }
       }
    return slow==s.length();
    }
    public static void main(String[] args) {
       String s = "abc";
       String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}