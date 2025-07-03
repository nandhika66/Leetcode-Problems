import java.util.*;
class Solution {
    public StringBuilder newWord(StringBuilder word){
        StringBuilder newWord = new StringBuilder();
        for(int i=0;i<word.length();i++){
            newWord.append((char) (word.charAt(i) +1));
        }
        word.append(newWord);
        return word;
    }
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while(k > word.length()){
            newWord(word);
        }
        return word.charAt(k-1);
    }
}