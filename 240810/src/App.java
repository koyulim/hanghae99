import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String number = "1231234";
        int k = 3; 

        String result = solution(number, k);
        System.out.print(result);

    }

    public static String solution(String number, int k) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        int size = number.length() - k;
        
        for (int i = 0; i < number.length(); i++) {            
            while (!stack.empty() && stack.peek() < number.charAt(i) && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(number.charAt(i));
        }
        
        for(int i = 0; i < size; i++){
            answer = answer + stack.get(i);
        }
        
        return answer;
    }
}
