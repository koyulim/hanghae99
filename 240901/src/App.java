public class App {
    public static void main(String[] args) throws Exception {
        int [] nextVisit = {0,1,2,0};
        int result = firstDayBeenInAllRooms(nextVisit);
        System.out.println(result);
    }

    public static int firstDayBeenInAllRooms(int[] nextVisit) {
        int modulo = 1000000007;
        long[] dp = new long[nextVisit.length];
        for (int i = 1; i < nextVisit.length; i++) {
            dp[i] = (dp[i - 1] + 2 + dp[i - 1] - dp[nextVisit[i - 1]] + modulo) % modulo;
        }
        return (int) dp[nextVisit.length - 1];
    }
}
