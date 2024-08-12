public class App {
    public static void main(String[] args) throws Exception {
        int n = 4;  //5

        long result = solution(n);
        System.out.print(result);
    }

    public static long solution(int n) {
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++)arr[i] = arr[i-1] + arr[i-2] % 1234567;
        return arr[n];
    }
}
