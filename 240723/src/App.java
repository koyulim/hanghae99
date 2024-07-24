import java.util.Arrays;
import java.util.Comparator;
public class App {
    public static void main(String[] args) throws Exception {

    }
    class Solution {
        public String[] solution(String[] strings, int n) {
            Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int index = n;
                while(o1.charAt(index) != o2.charAt(index))index++;
                return o1.charAt(index) - o2.charAt(index);
            }
        });
            return strings;
        }
    }
}