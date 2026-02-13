public class RotateString {
    public static boolean rotateString(String s,String goal){
        if (s.length()!=goal.length()) {
            return false;
        }
        String Concate = s+s;
        if (Concate.contains(goal)) {
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        String s ="abcde";
        String goal = "cdea";
      System.out.println(rotateString(s, goal));

    }
}