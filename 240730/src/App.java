import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        int[] case1 = {1, 2, 3, 9, 10, 12};
        int result = solution(case1, 7);
        System.out.print(result);
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++){
            queue.offer(scoville[i]);
        }
        
        while(queue.size() > 1 && queue.peek() < K){
            queue.offer(queue.poll() + (queue.poll()*2));
            answer++;
        }
        
        return queue.peek() < K ? -1 : answer;
    }
}
