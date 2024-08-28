import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        int n = 7;
        int k = 3;
        int[] enemy = {4, 2, 4, 5, 3, 3, 1};
        int result = solution(n, k, enemy);
        System.out.print(result);
    }

    public static int solution(int n, int k, int[] enemy) {
        int answer = 0;
        
        Queue<Integer> queue = new PriorityQueue<>();
        
        for (int i = 0; i < enemy.length; i++) {
            if (i < k) {
                queue.add(enemy[i]);
            } else {
                
                int num = enemy[i];
                
                if (enemy[i] > queue.peek()) {
                    num = queue.poll();
                    queue.add(enemy[i]);
                } 
                
                if (num <= n) {
                    n = n - num;
                } else {
                    break;
                }
            }
            
            answer++;
        }
        
        return answer;
    }
}
