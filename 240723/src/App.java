public class App {
    public static void main(String[] args) throws Exception {
        long[] result = solution(2, 5);
        for (long num : result) {
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