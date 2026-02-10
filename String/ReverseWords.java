public class ReverseWords{
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");  
       // trim() => removing starting and ending spaces
       // split("\\s+") =>  split String by one or more spaces

        String [] words = s.trim().split("\\s+");

        // traverse the words array last word to first word
        for(int i=words.length-1;i>=0;i--){
           sb.append(words[i]);

           // this avoids last space after completing string
           if(i!=0){
            sb.append(" ");
           }
         }
    
      return sb.toString(); 
    }
    public static void main(String[]args){
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}