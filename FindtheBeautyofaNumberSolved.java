public class FindtheBeautyofaNumberSolved{
    public static int divisorSubstrings(int num, int k) {
    int count = 0;
    String str = String.valueOf(num);
     for(int i = 0;i<str.length()-k+1;i++){
        String s = str.substring(i,i+k);
        int number = Integer.parseInt(s);
        if(number==0)continue;
        if(num%number==0)count++;
    }
      return count;  
    }
    public static void main(String[] args) {
       int num = 240;
       int k = 2;
       System.out.println(divisorSubstrings(num, k));
    }
}