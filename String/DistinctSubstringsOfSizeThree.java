public class DistinctSubstringsOfSizeThree {
     public static int countGoodSubstrings1(String s) {
        int count = 0;
        int n = s.length();
        for(int i =0;i<=n-3;i++){
           
                if (s.charAt(i) != s.charAt(i+1) && 
                    s.charAt(i) != s.charAt(i+2) && 
                    s.charAt(i+1) != s.charAt(i+2)) {
                    count++;
                }
            
        } 
        return count;  
     }

    public static int countGoodSubstrings2(String s) {
        int count = 0;
         if (s.length() < 3) return 0;
        if (s.charAt(0) != s.charAt(1) && 
            s.charAt(0) != s.charAt(2) && 
            s.charAt(1) != s.charAt(2))
            count++;

        for (int i = 3; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1) && 
                s.charAt(i) != s.charAt(i - 2)&&
                s.charAt(i - 1) != s.charAt(i - 2))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "aababcabc";
        System.out.println(s.length());
        System.out.println(countGoodSubstrings1(s));
        System.out.println(countGoodSubstrings2(s));
    }
}