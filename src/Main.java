import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Set<Character> currentSet = new HashSet<>();
        int longest = 0;
        int startIndex = 0;
        for (int i = startIndex; i < s.length(); ) {
            if (i == s.length() - 1 && !currentSet.contains(s.charAt(i))) {
                currentSet.add(s.charAt(i));
                longest = Math.max(currentSet.size(), longest);
                return longest;
            } else if (i == s.length() - 1 && currentSet.contains(s.charAt(i))){
                longest = Math.max(currentSet.size(), longest);
                return longest;
            } else if (currentSet.contains(s.charAt(i))) {
                longest = Math.max(currentSet.size(), longest);
                currentSet.clear();
                startIndex++;
                i = startIndex;
                continue;
            }
            currentSet.add(s.charAt(i));
            i++;
        }
        return longest;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}

