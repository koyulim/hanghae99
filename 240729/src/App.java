import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5}; 
        int[] result = solution(progresses, speeds);

        for (int move : result) {
            System.out.print("[" + move + "]");
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> deployments = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            queue.offer(((100 - progresses[i]) % speeds[i]) == 0 ? ((100 - progresses[i]) / speeds[i]) : ((100 - progresses[i]) / speeds[i]) + 1);
        }
        
        while(!queue.isEmpty()){
            int value = queue.poll();
            int count = 1;
            
            while(!queue.isEmpty() && queue.peek() <= value) {
                count++;
                queue.poll();
            }
            
            deployments.add(count);
        }
        
        
        answer = new int[deployments.size()];
        for (int i = 0; i < deployments.size(); i++) {
            answer[i] = deployments.get(i);
        }
        
        return answer;
    }
}
