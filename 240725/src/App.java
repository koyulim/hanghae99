public class App {
    public static void main(String[] args) throws Exception {
        String case1 = solution("  for the what 1what  ");
        String case2 = solution("3people unFollowed me");
        String case3 = solution("for the last week");

        System.out.print(case1);
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        sb.setCharAt(0, Character.toUpperCase(s.charAt(0)));
        int findIndex = s.indexOf(" ");
        
        while (findIndex >= 0 && findIndex + 1 < s.length()) {
            char first = Character.toUpperCase(s.charAt(findIndex + 1));
            sb.setCharAt(findIndex + 1, first);
            findIndex = s.indexOf(" ", findIndex + 1);
        }
        return sb.toString();
    }
}
