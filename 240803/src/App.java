import java.util.LinkedHashMap;
import java.util.Scanner;

public class App {

    // 입력 값
    // 5
    // 6 3 2 10 -10
    // 8
    // 10 9 -5 2 3 4 5 -10

    // 출렵 값
    // 1 0 0 1 1 0 0 1

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for(int i = 0; i < n; i++){
            map.put(sc.nextInt(), 0);
        }

        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            if (map.containsKey(sc.nextInt())) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}

