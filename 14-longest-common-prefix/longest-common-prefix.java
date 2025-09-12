import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s = new StringBuilder(strs[0]);
        for(int i=1;i<strs.length;i++){
            String str = strs[i];
            int j = 0;
            while(j<str.length() && j<s.length()){
                if(s.charAt(j)==str.charAt(j)){
                    j++;
                }else{
                    break;
                }
            }
            s.setLength(j);
            if(s.length()==0) return "";
        }
        return s.toString();
    }
}