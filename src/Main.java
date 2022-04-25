import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Map<Character, Integer> currentSet = new HashMap<>();
        int longest = 0;
        int startIndex = 0;
        for (int i = startIndex; i < s.length(); ) {
            if (i == s.length() - 1 && currentSet.get(s.charAt(i)) == null) {
                currentSet.put(s.charAt(i), 1);
                longest = Math.max(currentSet.size(), longest);
                return longest;
            } else if (currentSet.get(s.charAt(i)) != null) {
                longest = Math.max(currentSet.size(), longest);
                currentSet.clear();
                startIndex++;
                i = startIndex;
                continue;
            }
            currentSet.put(s.charAt(i), 1);
            i++;
        }
        return longest;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}

