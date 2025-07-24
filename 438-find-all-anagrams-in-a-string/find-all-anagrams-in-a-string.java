import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> pfreq = new HashMap<>();
        HashMap<Character,Integer> winfreq = new HashMap<>();
        for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            pfreq.put(ch,pfreq.getOrDefault(ch,0)+1);
        }
        int left = 0, right = 0, window = p.length();
        List<Integer> ans = new ArrayList<>();
        while(right<s.length()){
            char rch = s.charAt(right);
            winfreq.put(rch,winfreq.getOrDefault(rch,0)+1);
            if(right-left+1 == window){
                if(pfreq.equals(winfreq)){
                    ans.add(left);
                }
                char lch = s.charAt(left);
                winfreq.put(lch,winfreq.get(lch)-1);
                if(winfreq.get(lch)==0){
                    winfreq.remove(lch);
                }
                left++;
            }
            right++;
        }
        return ans;
    }
}