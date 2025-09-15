import java.util.*;
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        boolean broken = false;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' ' && broken==false){
                count++;
            }else if(text.charAt(i)==' ' && broken == true){
                broken = false;
            }else{
                if(brokenLetters.contains(String.valueOf(text.charAt(i)))){
                    broken = true;
                }
            }
        }
        if(broken==false) count++;
        return count;
    }
}