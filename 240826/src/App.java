import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int n = 9;
        int[][] case1 = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        int result = solution(n, case1);
        System.out.print(result);
    }

    public static int dfs (int n, List<List<Integer>> arr) {
        boolean[] visit = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        visit[0] = true;
        int count = 1;
        
        while (!stack.isEmpty()) {
            int i = stack.pop();
            for (int j = 0; j < arr.get(i).size(); j++) {
                int neighbor = arr.get(i).get(j);
                if (visit[neighbor]) continue;
                visit[neighbor] = true;
                count++;
                stack.push(neighbor);
            }
        }
        return count;
    }
    
    
    public static int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        for (int i = 0; i < wires.length; i++) {
            List<List<Integer>> arr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr.add(new ArrayList<>());
            }
            for (int j = 0; j < wires.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    arr.get(wires[j][0] - 1).add(wires[j][1] - 1);
                    arr.get(wires[j][1] - 1).add(wires[j][0] - 1);
                }
            }
            int result = dfs(n, arr);
            answer = Math.min(Math.abs((n - result) - result), answer);
        }
        
        return answer;
    }
}
