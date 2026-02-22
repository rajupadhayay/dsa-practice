import java.util.Stack;

public class ReverseString {
    public static void reverseString1(char[] s){
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length;i++){
            st.push(s[i]);
        }
          for (int i = 0; i < s.length; i++) {
        s[i] = st.pop();
    }
    }
 public static void reverseString(char[] s) {
int start =0;
int end = s.length-1;
while (start<end) {
    char temp = s[start];
    s[start] = s[end];
    s[end]  = temp;
    start++;
    end--;
} 
}
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString1(s);
        for(int i=0;i<s.length;i++){
            System.out.print(s[i] +" ");
        }
    }
}