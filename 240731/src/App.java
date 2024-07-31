import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String[] case1 = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        String[] case2 = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        int[] result = solution(case2);

        for (int move : result) {
            System.out.print("[" + move + "]");
        }
    }

    public static int[] solution(String[] operations) {
        int[] answer = {};
        
        Queue<Integer> min = new PriorityQueue<>();
        Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0 ; i < operations.length; i++){
            
            String[] indexVal = operations[i].split(" ");            
            if (indexVal[0].equals("I")){
                min.offer(Integer.parseInt(indexVal[1]));
                max.offer(Integer.parseInt(indexVal[1]));                
            } else if (!min.isEmpty() && indexVal[1].equals("-1")){
                min.poll();
                
                int[] temp = new int[min.size()];
                
                for(int j = 0; j < temp.length; j++){
                    temp[j] = max.poll();
                }
                max.clear();
                
                for(int j = 0; j < temp.length; j++){
                    max.offer(temp[j]);
                }
                
                
            } else if (!max.isEmpty() && indexVal[1].equals("1")){
                max.poll();
                
                int[] temp = new int[max.size()];
                
                for(int j = 0; j < temp.length; j++){
                    temp[j] = min.poll();
                }
                min.clear();
                
                for(int j = 0; j < temp.length; j++){
                    min.offer(temp[j]);
                }
            }
            
        }
        
        if (min.isEmpty() && max.isEmpty()) {
            answer = new int[]{0, 0};
        } else {
            answer = new int[]{max.poll(), min.poll()};
        }
        return answer;
    }
}
