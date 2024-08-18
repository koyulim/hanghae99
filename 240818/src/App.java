import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "[](){}";
        int result = solution(s);
        System.out.println(result);
    }

    public static int solution(String s) {
        int answer = 0;
                
        for (int i =0; i < s.length(); i++) {
            String turnStr = s.substring(i) + s.substring(0,i);
            Stack<Character> stack = new Stack<>();
            
            for (int j = 0; j < turnStr.length(); j++) {
                if (stack.isEmpty()) {
                    stack.push(turnStr.charAt(j));
                } else if (turnStr.charAt(j) == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (turnStr.charAt(j) == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (turnStr.charAt(j) == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (turnStr.charAt(j) == '(' || turnStr.charAt(j) == '{' || turnStr.charAt(j) == '['){
                    stack.push(turnStr.charAt(j));
                }
            }
            
            if (stack.size() == 0) {
                answer += 1;
            }
        }
        return answer;
    }
}
