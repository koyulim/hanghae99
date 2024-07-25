import java.util.Arrays;
import java.util.Comparator;
public class App {
    public static void main(String[] args) throws Exception {
        long[] case1 = solution(2, 5);
        long[] case2 = solution(4, 3);
        long[] case3 = solution(-4, 2);

        for (long num : case1) {
            System.out.print(num + " ");
        }
    }
    
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n ; i++){
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }
    
}