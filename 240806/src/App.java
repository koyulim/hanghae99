public class App {
    public static void main(String[] args) throws Exception {
        String case1 = "AAAAE"; // 6
        String case2 = "AAAE";  // 10
        String case3 = "I";     // 1563
        String case4 = "EIO";   // 1189

        int result = solution(case4);
        System.out.print(result);
    }

    public static int solution(String word) {
        int answer = 0;
        int max = 0;
        for(int i = 1; i <= 5; i++) {
            max += Math.pow(5, i);
        }
        for (int i = 1; i <= word.length(); i++) {
            if (word.charAt(i-1) == 'A') {
                answer += 1;
            } else if (word.charAt(i-1) == 'E') {
                answer += ((max / Math.pow(5, i)) * 1) + 1;
            } else if (word.charAt(i-1) == 'I') {
                answer += ((max / Math.pow(5, i)) * 2) + 1;
            } else if (word.charAt(i-1) == 'O') {
                answer += ((max / Math.pow(5, i)) * 3) + 1;
            } else {
                answer += ((max / Math.pow(5, i)) * 4) + 1;
            }
        }
        return answer;
    }
}
