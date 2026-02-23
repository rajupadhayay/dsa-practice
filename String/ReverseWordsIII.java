public class ReverseWordsIII {

     public static String reverseWords(String s) {
        String arr[] = s.split(" ");
        StringBuilder result = new StringBuilder("");
        for(int i=0;i<arr.length;i++){
            StringBuilder words = new StringBuilder(arr[i]);
            result.append(words.reverse());
            if(i<arr.length-1){
                result.append(" ");
            }
            
        }
        return result.toString();
    }
    public static void main(String[]args){
String s = "Let's take LeetCode contest";
System.out.println(reverseWords(s));
    }
}