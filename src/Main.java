import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Map<Character, Integer> currentString = new HashMap<>();
        int longest = 0;
        int startIndex = 0;
        for (int i = startIndex; i < s.length(); ) {
            if (i == s.length() - 1 && currentString.get(s.charAt(i)) == null) {
                currentString.put(s.charAt(i), 1);
                longest = Math.max(currentString.size(), longest);
                return longest;
            } else if (currentString.get(s.charAt(i)) != null) {
                longest = Math.max(currentString.size(), longest);
                currentString.clear();
                startIndex++;
                i = startIndex;
                continue;
            }
            currentString.put(s.charAt(i), 1);
            i++;
        }
        return longest;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}

