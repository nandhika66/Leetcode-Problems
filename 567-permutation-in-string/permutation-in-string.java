import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> s2freq = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int left = 0, right = 0 , windowSize = s1.length();
        while(right < s2.length()){
            char ch = s2.charAt(right);
            s2freq.put(ch, s2freq.getOrDefault(ch,0)+1);
            if(right-left+1 == windowSize){
                if(map.equals(s2freq)){
                    return true;
                }
                s2freq.put(s2.charAt(left), s2freq.get(s2.charAt(left))-1);
                if(s2freq.get(s2.charAt(left)) == 0){
                    s2freq.remove(s2.charAt(left));
                }
                left++;
            }
            right++;
        }
        return false;
    }
}