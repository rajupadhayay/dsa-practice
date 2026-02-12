public class RemoveOuterParentheses {

    public static String removeOuterParentheses(String s) {
        
        StringBuilder sb = new StringBuilder("");

        char[] c = s.toCharArray();
        int depth =0;
     for(int i=0;i<c.length;i++){
        if(c[i]=='('){
            if(depth>0){
                sb.append(c[i]);
            }
            depth++;
        }
        else{
            depth--;
            if(depth>0){
                sb.append(c[i]);
            }
        }
     }
    return sb.toString();
    }
    public static void main(String[]args){
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}