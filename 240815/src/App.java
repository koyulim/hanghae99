import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        // equations = [["a","b"],["b","c"]]
        // values = [2.0,3.0]
        // queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
        
        // 출력
        // [6.00000,0.50000,-1.00000,1.00000,-1.00000]
    }

    static class Node {
        String children;
        double value;

        Node(String children, double value) {
        this.children = children;
        this.value = value;
        }
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] answer = new double[queries.size()];
        Map<String, Node> map = new HashMap<>();
        Queue<Node> dfs = new LinkedList<>();

        for (int i = 0; i < equations.size(); i++){
            String parent = equations.get(i).get(0);
            String children = equations.get(i).get(1);
            double value = values[i];

            map.put(parent, new Node(children, value));
            map.put(children, new Node(parent, 1.0/value));
            
        }

        for (int i = 0; i < queries.size(); i++) {
            String parent = queries.get(i).get(0);
            String children = queries.get(i).get(1);

            
            while(!dfs.isEmpty()){
                Node node = dfs.poll();

                if (node.children.equals(children)) {
                    answer[i] = node.value;
                    break;
                }

                // for (Node next : map.get(node.children)) {

                // }
            }

        }

        return answer;
    }
}
