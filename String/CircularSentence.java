public class CircularSentence {
    public static boolean isCircularSentence(String sentence) {
     String [] words = sentence.split(" ");
     for(int i =0;i<words.length;i++){
        String n = words[i];
        String p = words[(i+1)%words.length];

        int m = n.length();
        char c = n.charAt(m-1);
        char d = p.charAt(0);
        if(c!=d)return false;

       
     }   
      return true;
    }

    public static void main(String[] args) {
      String sentence = "leetcode exercises sound delightful" ;
      System.out.println(isCircularSentence(sentence));
    }
}