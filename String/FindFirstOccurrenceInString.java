public class FindFirstOccurrenceInString{
   public static int strStr1(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for(int i =0;i<=n-m;i++){
            if(haystack.substring(i, i+m).equals(needle))return i;
        }
        return -1;
    }
      public static int strStr2(String haystack, String needle) {
       int start =0;
       for(int i=0;i<haystack.length();i++){
        char ch1 = haystack.charAt(i);
        char ch2 = needle.charAt(start);
        if (ch1==ch2) {
            if(start==needle.length()-1)return i - start;
            start++;
    }
        else{
            i-=start;
            start = 0;
        }
        
       }
       return -1;
    }
    
    public static void main(String[] args) {
      String haystack = "a";
      String needle = "a";
      System.out.println(strStr1(haystack, needle));
      System.out.println(strStr2(haystack, needle));
    }
}