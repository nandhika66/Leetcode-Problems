import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, maxFreq = 0, maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(ch));

            int len = right - left + 1;

            if ((len - maxFreq) > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            } else {
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}
