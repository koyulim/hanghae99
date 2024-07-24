import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
       
        String[] case1 = {"sun", "bed", "car"};
        String[] case2 = {"abce", "abcd", "cdx"};

        String[] result = solution(case1, 1);
        for (String num : result) {
            System.out.print(num + " ");
        }
    }
    
    // Solution 1
    public static String[] solution(String[] strings, int n) {
        String temp;
        for (int i = 0 ; i < strings.length; i++){
            for (int j = i+1; j < strings.length; j++){
                if (strings[i].charAt(n) > (strings[j].charAt(n))) {
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                } else if (strings[i].charAt(n) == (strings[j].charAt(n))){
                    if (strings[i].compareTo(strings[j]) > 0) {
                        temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }
                }
            }
        }
        return strings;
    }

    // Solution 2
    // public static String[] solution(String[] strings, int n) {
    //     Arrays.sort(strings, new Comparator<String>() {
    //         @Override
    //         public int compare(String o1, String o2) {
    //             if (o1.charAt(n) != o2.charAt(n)){
    //                 return o1.charAt(n) - o2.charAt(n);
    //             } return o1.compareTo(o2);
    //         }
    //     });
        
    //     return strings;
    // }
}
