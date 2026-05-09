import java.util.HashMap;

public class TaskScheduler {

       public static int leastInterval(char[] tasks, int n) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < tasks.length; i++) {

            map.put(tasks[i],
                    map.getOrDefault(tasks[i],0) + 1);
        }
        int maxFeq = 0;
        for(int val : map.values()){
            if(val>maxFeq)maxFeq = val;
        }
        int maxCountFeq = 0;
        for(int val : map.values()){
            if(val==maxFeq)maxCountFeq++;
        }
        int ans =((maxFeq-1)*(n+1))+maxCountFeq;

        return Math.max(tasks.length, ans);
    }

    public static void main(String[] args) {

        char[] tasks = {'A','A','A','B','B','B'};

        int n = 2;

        System.out.println(leastInterval(tasks, n));
    }
}