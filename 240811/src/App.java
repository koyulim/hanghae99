public class App {
    public static void main(String[] args) throws Exception {
        int n = 3;  //5

        int result = solution(n);
        System.out.print(result);
    }

    public static int solution(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++)arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        return arr[n];
    }
}
