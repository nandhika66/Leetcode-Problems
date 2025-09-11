import java.util.*;
class Solution {
    public String sortVowels(String s) {
        StringBuilder ans = new StringBuilder();
        ArrayList<Character> arr = new ArrayList<>();
        String vowels = "AEIOUaeiou";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(vowels.contains(String.valueOf(ch))){
                arr.add(ch);
            }
        }
        Collections.sort(arr);
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(vowels.contains(String.valueOf(ch))){
                char nch = arr.get(j);
                ans.append(nch);
                j++;
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}