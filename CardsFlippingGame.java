public class CardsFlippingGame {
    // TC (n)
    public static  int flipgame(int[] fronts, int[] backs) {

        int count[] = new int[2001];
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < backs.length; i++) {
            if (fronts[i] == backs[i]) {
                count[fronts[i]]++;
            }
        }
        for (int i = 0; i < backs.length; i++) {
            if (count[fronts[i]] == 0)
                answer = Math.min(answer, fronts[i]);

            if (count[backs[i]] == 0)
                answer = Math.min(answer, backs[i]);
        }
        if (answer == Integer.MAX_VALUE)
            return 0;
        return answer;
    }
    public static void main(String [] args){
      int[] fronts = {1,2,4,4,7} ;
      int [] backs = {1,3,4,1,3};
      System.out.println(flipgame(fronts, backs));
    }
}
