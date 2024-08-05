import java.util.HashMap;

public class WordFilter {

    HashMap<String, Integer> map = new HashMap<>();

    public WordFilter(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j <= words[i].length(); j++) {
                for (int z = 0; z <= words[i].length(); z++) {
                    String pref = words[i].substring(0, j);
                    String suff = words[i].substring(words[i].length() - z);
                    String key = pref + "," + suff;
                    map.put(key, i);
                }
            }
        }
    }
    
    public int f(String pref, String suff) {
        String key = pref + "," + suff;
        return map.getOrDefault(key, -1);
    }
}