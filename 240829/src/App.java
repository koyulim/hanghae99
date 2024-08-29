import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int[] picks = {1, 3, 2};
        String[] mineralsk = {"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"};
        int result = solution(picks, mineralsk);
        System.out.print(result);
    }

    public static int solution(int[] picks, String[] minerals) {
        int answer = 0;

        List<int[]> list = new ArrayList<>();
        int total = (picks[0] + picks[1] + picks[2]) * 5;
        int diaCnt = 0;
        int ironCnt = 0;
        int stoneCnt = 0;
        int cnt = 0;

        for (int i = 0; i < minerals.length && i < total; i++) {
            if (minerals[i].equals("diamond")) {
                diaCnt++;
            } else if (minerals[i].equals("iron")) {
                ironCnt++;
            } else {
                stoneCnt++;
            }

            cnt++;
            
            if (cnt == 5 || i == minerals.length - 1) {
                list.add(new int[]{diaCnt, ironCnt, stoneCnt});
                diaCnt = 0;
                ironCnt = 0;
                stoneCnt = 0;
                cnt = 0;
            }
        }

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                int[] a = list.get(j);
                int[] b = list.get(j + 1);

                int valueA = a[0] * 25 + a[1] * 5 + a[2];
                int valueB = b[0] * 25 + b[1] * 5 + b[2];

                if (valueA < valueB) {
                    list.set(j, b);
                    list.set(j + 1, a);
                }
            }
        }


        for (int i = 0; i < list.size(); i++) {
            int[] group = list.get(i);
            
            
            if (picks[0] > 0) {
                answer += group[0] * 1 + group[1] * 1 + group[2] * 1;
                picks[0]--;
            } else if (picks[1] > 0) {
                answer += group[0] * 5 + group[1] * 1 + group[2] * 1;
                picks[1]--;
            } else if (picks[2] > 0) {
                answer += group[0] * 25 + group[1] * 5 + group[2] * 1;
                picks[2]--;
            } else {
                break;
            }
        }

        return answer;
    }
}
