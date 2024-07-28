import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

        String[][] case1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}; // 5
        int result = solution(case1);
        
        System.out.print(result + " ");
    }

    public static int solution(String[][] clothes) {

        int answer = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < clothes.length; i++) {
            if (map.containsKey(clothes[i][1])) {
                map.replace(clothes[i][1], (map.get(clothes[i][1])) + 1);
            } else {
                map.put(clothes[i][1], 1);
            }
        }
        
        for (String key : map.keySet()) {
            answer = ((map.get(key)) + 1) * answer;
        }
    
        return answer - 1;
    }
}
