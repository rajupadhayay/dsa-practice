public class LengthofLastWord {
        public static int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        String m = words[words.length-1];
        return m.length();
    }


    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println(lengthOfLastWord(s));
    }
}