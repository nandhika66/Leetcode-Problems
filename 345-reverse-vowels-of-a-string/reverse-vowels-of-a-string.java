import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        StringBuilder sub = new StringBuilder(s);
        int left =0, right= s.length()-1;
        String vowels = "AEIOUaeiou";
        while(left<right){
            if (!vowels.contains(Character.toString(sub.charAt(left)))) {
                left++;
            }else if(vowels.contains(Character.toString(sub.charAt(right)))){
                char temp = sub.charAt(left);
                sub.setCharAt(left,sub.charAt(right));
                sub.setCharAt(right,temp);
                left++;
                right--;
            }else{
                right--;
            }
        }
        return sub.toString();
    }
}