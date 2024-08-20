import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] intervals = {{3,4},{2,3},{1,2}};

        int[] result = findRightInterval(intervals);
        for(int num : result){
            System.out.print(num + ",");
        }
    }

    public static int[] findRightInterval(int[][] intervals) {
        int[] answer = new int[intervals.length];
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < intervals.length; i++) {
            map.put(intervals[i][0], i);
        }

        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort((s1, s2) -> s1.compareTo(s2));
        
        for (int i = 0; i < intervals.length; i++) {
            int index = -1;
            int left = 0;
            int right = map.size();
            int target = intervals[i][1];

            while (left < right) {
                int mid = (left + right) / 2;
                if (keyList.get(mid) < target) {
                    left = mid + 1;
                } else {
                    index = map.get(keyList.get(mid));
                    right = mid;
                }
            }

            answer[i] = index;
        }

        return answer;
    }
}
