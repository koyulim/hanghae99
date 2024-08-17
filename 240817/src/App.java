import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        int result = solution(want, number, discount);
        System.out.print(result + ",");
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < discount.length - 9; i++) {
            boolean result = false;
            
            for (int z = 0; z < want.length; z++) {
                map.put(want[z], number[z]);
            }
            
            for (int j = i; j < i+10; j++){
                if (map.containsKey(discount[j])) {
                    map.put(discount[j], map.get(discount[j]) - 1);
                }
            }
            
            for (String key : map.keySet()) {
                int value = map.get(key);                
                if (value > 0) {
                    result =  true;
                    break;
                }
		    }
            
            if (result == false) {
                answer++;
            }
            
        }
        return answer;
    }
}
