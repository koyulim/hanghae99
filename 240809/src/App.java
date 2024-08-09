import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] people = {70, 50, 80, 50};
        int limit = 100; 

        int result = solution(people, limit);
        System.out.print(result);
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1 ;
        
        while (start < end) {
            if ((people[start] + people[end]) <= limit) {
                answer++;
                start++;
                end--;
            } else {
                answer++;
                end--;
            }
        }        
        
        if (start == end)answer++;
        
        return answer;
    }
}
