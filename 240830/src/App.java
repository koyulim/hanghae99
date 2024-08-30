public class App {
    public static void main(String[] args) throws Exception {
        int m = 23;
        int n = 12;
        int result = uniquePaths(m, n);
        System.out.println(result);
    }

    public static int uniquePaths(int m, int n) {

        m--; 
        n--;
        
        int totalSteps = m + n;
        int r = Math.min(m, n);
        
        long result = 1;
        
        for (int i = 1; i <= r; i++) {
            result = result * (totalSteps - i + 1) / i;
        }
        
        return (int) result;
    }
}
