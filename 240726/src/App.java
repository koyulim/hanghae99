import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        String[] case1 = {"119", "97674223", "1195524421"}; // false
        String[] case2 = {"123", "13", "134"}; // false
        String[] case3 = {"0", "119"}; // true
        boolean result = solution(case1);
        
        System.out.print(result);
    }

    // solution 1 - java startsWith 메서드 사용
    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length ; i++) {
            if ((i+1) < phone_book.length) {
                if (phone_book[i+1].startsWith(phone_book[i])) {
                   return false;
                }
            }
        }
        return true;
    }

    // solution 2 - HashMap containsKey 메서드 사용
    // public boolean solution(String[] phoneBook) {
    //     boolean answer = true;

    //     Map<String, Integer> map = new HashMap<>();

    //     for(int i = 0; i < phoneBook.length; i++) {
    //         map.put(phoneBook[i], i);
    //     }

    //     for(int i = 0; i < phoneBook.length; i++) {
    //         for(int j = 0; j < phoneBook[i].length(); j++) {
    //             if(map.containsKey(phoneBook[i].substring(0,j))) {
    //                 answer = false;
    //                 return answer;
    //             }
    //         }
    //     }
    //     return answer;
    // }
}
