import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> currentSet = new HashSet<>();
        char[] arr = s.toCharArray();
        int longest = 0;
        boolean duplicateHappened = false;
        for (int i = 0; i < arr.length; i++) {
            if(currentSet.contains(arr[i])) {
                duplicateHappened = true;
                longest = Math.max(currentSet.size(), longest);
                currentSet.clear();
                currentSet.add(arr[i]);
                continue;
            } currentSet.add(arr[i]);

        } return duplicateHappened ? longest: s.length();
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("aab"));

    }
}

