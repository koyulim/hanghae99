import java.util.*;

public class App {

    // 예제 1
    // 2
    // < >

    // 예제 2
    // 9
    // > < < < > > > < <


    public static boolean[] visited;
    public static int[] arr;
    public static char[] str;
    public static List<String> list = new ArrayList<>();

    public static boolean check (char arr, int a, int b) {
        if (arr == '>') {
            return a > b;
        } else {
            return a < b;
        }

    }

    public static void backTracking(int index, int limit){
        if(index == limit){
            String result = "";
            for(int i = 0; i < index; i++){
                result += arr[i];
            }
            list.add(result);
            return;
        }

        for(int i = 0; i < 10; i++){
            if(visited[i])continue;

            arr[index] = i;
            if (index > 0 && !check(str[index - 1], arr[index - 1], arr[index])) {
                continue;
            }

            visited[i] = true;
            backTracking(index + 1, limit);
            visited[i] = false;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n + 1];
        visited = new boolean[10];
        str = new char[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next().charAt(0);
        }

        backTracking(0, n + 1);
        Collections.sort(list);
        System.out.print(list.get(list.size()-1));
        System.out.println();
        System.out.print(list.get(0));

    }
}
