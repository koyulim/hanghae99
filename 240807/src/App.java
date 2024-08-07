import java.util.*;

public class App {
    static class Node {
        int n;
        int count;
        Node parent;
        List<Node> children;
        Node() {
            children = new ArrayList<>();
        }
    }

    public static void main(String[] args) throws Exception {
        int answer = -1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int src = sc.nextInt();
        int dst = sc.nextInt();
        Node[] nodes = new Node[n];
        Queue<Node> dfs = new LinkedList<>();

        // Initialize nodes
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
            nodes[i].n = i + 1;
        }
        
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int parentIndex = sc.nextInt() - 1;
            int childIndex = sc.nextInt() - 1;
            nodes[parentIndex].children.add(nodes[childIndex]);
            nodes[childIndex].parent = nodes[parentIndex];
        }
        
        dfs.offer(nodes[src - 1]);

        while(!dfs.isEmpty()){
            Node node = dfs.poll();
            if(node.n == dst) {
                answer = node.count;
                break;
            }
            for (Node child : node.children) {
                if (child.count == 0) {
                    dfs.offer(child);
                    child.count = node.count + 1;
                }
            }
            if(node.parent == null)continue;
            if(node.parent.count == 0){
                dfs.offer(node.parent);
                node.parent.count = node.count + 1;
            }
        }
        System.out.print(answer);
    }
}

