public class MinimumRecolorsForKBlackBlocks {
     public static int minimumRecolors(String blocks, int k) {
        int count = 0;
        int minRecolors = Integer.MAX_VALUE;
        for(int i = 0;i<k;i++){
            if (blocks.charAt(i)=='W') {
                count++;
            }
        }
            minRecolors = Math.min(minRecolors, count);
            for(int i = 1;i<blocks.length()-k+1;i++){
                if (blocks.charAt(i-1)=='W') {
                    count--;
                }
                if (blocks.charAt(i+k-1)=='W') {
                    count++;
                }
                minRecolors = Math.min(minRecolors, count);
            }
        return minRecolors;
        }
    
    public static void main(String[] args) {
      String  blocks = "WBBWWBBWBW";
      int k = 7;
      System.out.println(minimumRecolors(blocks, k));
    }
}