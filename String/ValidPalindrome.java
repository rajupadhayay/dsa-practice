public class ValidPalindrome {
    // Approach 1: Two-way comparison using for-loop
    // Time: O(n)
    // Space: O(n)

    public static boolean isPalindrome1(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder sb = new StringBuilder(clean);
        for (int i = 0; i < sb.length() / 2; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - i - 1))
                return false;
        }
        return true;
    }

    // Approach 2: Two Pointer Technique
    // Time: O(n)
    // Space: O(n)
    public static boolean isPalindrome2(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder sb = new StringBuilder(clean);
        int start = 0;
        int end = sb.length() - 1;
        while (start < end) {
            if (sb.charAt(start) != sb.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome1(s));
        System.out.println(isPalindrome2(s));

    }
}