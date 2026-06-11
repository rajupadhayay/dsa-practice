public class ReverseVowelsOfaString {
   
public static boolean isVowel(char ch){
    return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
           ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
} 

    public static String reverseVowels(String s) {
       
       char[] arr = s.toCharArray();
       int i = 0;
       int j = arr.length-1;
       while(i<j){
           if(isVowel(arr[i])&&isVowel(arr[j])){
            char temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
          else if(!isVowel(arr[i])){
            i++;
        }
        else{
            j--;
        }
        
       }
       String ans = new String(arr);
       return ans; 
    }


    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
}