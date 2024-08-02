import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] case1 = {3, 0, 6, 1, 5};
        int[] case2 = {3, 3, 3, 4};

        int result = solution(case1);
        System.out.print(result);
    }

    public static int solution(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}
