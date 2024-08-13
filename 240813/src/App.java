public class App {
    public static void main(String[] args) throws Exception {
        int case1 = 16;     //6
        int case2 = 2554;   //16
        int case3 = 545;    //14
        int case4 = 95;     //6
        int case5 = 45;     //9

        int result = solution(case3);
        System.out.print(result);
    }

    public static int solution(int storey) {
        int answer = 0;
        while(storey > 0) {
            int now = storey % 10;
            if (now > 5) {
                answer += 10 - now;
                storey = storey + (10 - now);
            } else if (now < 5){
                answer += now;
            } else {
                if ((storey / 10) % 10 >= 5) {
                    answer += 10 - now;
                    storey = storey + (10 - now);
                } else {
                    answer += now;
                }
            }
            storey /= 10;
        }
        return answer;
    }
}
