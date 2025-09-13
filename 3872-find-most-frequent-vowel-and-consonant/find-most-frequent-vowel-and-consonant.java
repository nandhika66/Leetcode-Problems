import java.util.*;
class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> cons = new HashMap<>();
        Map<Character, Integer> vow = new HashMap<>();
        String vowels = "aeiou";
        for(int i=0;i<s.length();i++){
            if(vowels.contains(String.valueOf(s.charAt(i)))){
                vow.put(s.charAt(i),vow.getOrDefault(s.charAt(i),0)+1);
            }else{
                cons.put(s.charAt(i),cons.getOrDefault(s.charAt(i),0)+1);
            }
        }
        int maxcons = 0, maxvow = 0;
        for(Integer val : cons.values()){
            maxcons = Math.max(maxcons,val);
        }
        for(Integer val : vow.values()){
            maxvow = Math.max(maxvow,val);
        }
        return maxcons + maxvow;
    }
}