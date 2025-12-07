import java.util.HashSet;
import java.util.Set;

public class DSA3 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> hashSet = new HashSet<>();

        int left = 0, maxLen = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            while(hashSet.contains(c)){
                hashSet.remove(s.charAt(left));
                left++;
            }

            hashSet.add(c);

            maxLen = Math.max(maxLen, i - left + 1);

        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
    }
}
