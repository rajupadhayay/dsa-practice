public class MaxVowelsInSubstring {
    // Brute force approach
   public static int maxVowels1(String s, int k) {
    int max_Count = 0;

    for (int i = 0; i <= s.length() - k; i++) {
        int count = 0;

        for (int j = i; j < i + k; j++) {
            char c = s.charAt(j);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                count++;
            }
        }

        max_Count = Math.max(max_Count, count);
    }

    return max_Count;
}
    // Using Sliding Window
    public static int maxVowels2(String s, int k) {
        int count = 0;
        int max_Count = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u')
                count++;
        }
        
       max_Count = count;
   
        for (int i = k; i <s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u')
                count++;
                if (s.charAt(i-k) == 'a' || s.charAt(i-k) == 'e' || s.charAt(i-k) == 'i' ||s.charAt(i-k) == 'o'
                    || s.charAt(i-k) == 'u')
                count--;
            
            max_Count = Math.max(max_Count, count);
            
           
           
        }
      
        return max_Count;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
       System.out.println(maxVowels1(s, k));
        System.out.println(maxVowels2(s, k));

    }
}