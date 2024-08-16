import java.util.HashMap;
import java.util.LinkedHashMap;

public class App {
    public static void main(String[] args) throws Exception {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        
        String[] result = solution(players, callings);
        for(String num : result){
            System.out.print(num + ",");
        }
    }

    public static String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> map = new LinkedHashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (int i = 0; i < callings.length; i++) {
            String now = callings[i];
            int nowIndex = map.get(now);
            int leftIndex = nowIndex - 1;
            String left = players[leftIndex];
            
            map.put(now, leftIndex);
            map.put(left, nowIndex);
            players[leftIndex] = now;
            players[nowIndex] = left;
            
        }

        return players;
    }
}
