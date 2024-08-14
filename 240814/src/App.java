import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
        
        int[] result = solution(keymap, targets);
        for(int num : result){
            System.out.print(num + ",");
        }
    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j ++) {
                if (!map.containsKey(keymap[i].charAt(j))) {
                    map.put(keymap[i].charAt(j), j+1);
                } else {
                    if (map.get(keymap[i].charAt(j)) > j+1) {
                        map.put(keymap[i].charAt(j), j+1);
                    }
                }
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            int target = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                if (!map.containsKey(targets[i].charAt(j))) {
                    target = -1;
                    break;
                } else {
                    target += map.get(targets[i].charAt(j));
                }
                
            }
            answer[i] = target;
        }
        
        return answer;
    }
}
