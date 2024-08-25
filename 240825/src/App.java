import java.util.LinkedList;
import java.util.Queue;
import java.awt.Point;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] case1 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int[][] case2 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
        
        int result = solution(case1);
        System.out.print(result);
    }

    public static int solution(int[][] maps) {
        int answer = -1;
        int n = maps.length;
        int m = maps[0].length;
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        maps[0][0] = 2;
        
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int x = p.x;
			int y = p.y;
            
            if (x == n - 1 && y == m - 1) {
                answer = maps[x][y] - 1;
                break;
            }
            
            if (y + 1 < m && maps[x][y + 1] == 1) {
                maps[x][y + 1] = maps[x][y] + 1;
                queue.offer(new Point(x, y + 1));
            }
			if (y > 0 && maps[x][y - 1] == 1) {
			    maps[x][y - 1] = maps[x][y] + 1;
			    queue.offer(new Point(x, y - 1));
			}
			if (x + 1 < n && maps[x + 1][y] == 1) {
			    maps[x + 1][y] = maps[x][y] + 1;
			    queue.offer(new Point(x + 1, y));
			}
			if (x > 0 && maps[x - 1][y] == 1) {
			    maps[x - 1][y] = maps[x][y] + 1;
			    queue.offer(new Point(x - 1, y));
			}
        }
        
        return answer;
    }
}
