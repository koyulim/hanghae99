import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        String result = solution(cards1, cards2, goal);
        System.out.print(result);
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();

        for (int i = 0; i < cards1.length ; i++){
            queue1.offer(cards1[i]);
        }

        for (int i = 0; i < cards2.length ; i++){
            queue2.offer(cards2[i]);
        }

       for (int i = 0; i < goal.length; i++){
             if (goal[i].equals(queue1.peek())) {
                queue1.poll();
            } else if (goal[i].equals(queue2.peek())){
                queue2.poll();     
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
