public class App {
    public static void main(String[] args) throws Exception {
        int[] result = solution(3, 2, 5);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
        int total = 0;

        for (long i = left; i <= right; i++) {
            long row = i / n;
            long col = i % n;

            if (col >= row) {
                answer[total] = (int)(col + 1);
            } else {
                answer[total] = (int)(row + 1);
            }

            total++;
        }

        return answer;
    }
}