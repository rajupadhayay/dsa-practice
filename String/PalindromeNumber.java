public class PalindromeNumber {
     public static boolean isPalindrome(int x) {
      String str = String.valueOf(x);
      int st =0;
      int end = str.length()-1;
      while(st<end){
        if(str.charAt(st)!=str.charAt(end)){
            return false;
        }
        st++;
        end--;
    }
    return true;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}