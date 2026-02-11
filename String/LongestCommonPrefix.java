import java.util.Arrays;

public class LongestCommonPrefix {
    public  static String findlongestCommonPrefix(String[] strs) {
//  sort the Array
     Arrays.sort(strs);
//  compare first and last String
String str1 =strs[0];
String str2 =strs[strs.length-1];
int idx =0;

while(idx<str1.length()){
    // check common part of the String
    if(str1.charAt(idx)==str2.charAt(idx)){
        idx++;
    }
    else{
        break;
    }
}
// return the common part of the String
    return idx==0?"":str1.substring(0, idx);

    }


    public static void main(String[]args){
        String [] strs = {"flower","flow","flight"};

       System.out.println( findlongestCommonPrefix(strs));
    }
}