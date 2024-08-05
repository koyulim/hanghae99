public class App {
    public static void main(String[] args) throws Exception {
        
        String[] arr = {"apple"};
        WordFilter wordFilter = new WordFilter(arr);
        wordFilter.f("a", "e");
    }
}