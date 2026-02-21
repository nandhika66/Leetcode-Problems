import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, max = 0;
        for(int right = 0; right < s.length() ; right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch,0)+1);
            while(map.get(ch) != 1){
                char leftch = s.charAt(left);
                map.put(leftch,map.get(leftch)-1);
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}