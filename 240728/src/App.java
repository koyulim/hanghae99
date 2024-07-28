import java.util.ArrayList;
import java.util.List;

public class App {

    static List<int[]> answer = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        List<int[]> result = solution(3);
        int[][] resultArray = convertListToArray(result);

        for (int[] move : resultArray) {
            System.out.print("[" + move[0] + ", " + move[1] + "]");
        }
    }

    public static List<int[]> solution(int n) {
        hanoi(n, 1, 2, 3);
        return answer;
    }
    
    public static void hanoi(int n, int h1, int h2, int h3){
        if (n == 0) return;
        hanoi(n-1, h1, h3, h2);
        answer.add(new int[] {h1, h3});
        hanoi(n-1, h2, h1, h3);
    }

    public static int[][] convertListToArray(List<int[]> list) {
        int[][] array = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
