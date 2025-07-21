import java.util.*;
class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        ans.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                count=1;
            }
            if((count<=2 && s.charAt(i)==s.charAt(i-1)) || s.charAt(i)!=s.charAt(i-1) ){
                ans.append(s.charAt(i));
            }else if(count>2 && s.charAt(i)!=s.charAt(i-1)){
                ans.append(s.charAt(i));
            }

        }
        
        return ans.toString();
    }
}