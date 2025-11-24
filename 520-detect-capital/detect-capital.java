class Solution {
    public boolean detectCapitalUse(String word) {
    if (word.equals(word.toUpperCase())) {
        return true;
    }
    if (word.equals(word.toLowerCase())) {
        return true;
    }
    String first = word.substring(0,1);
    String rest = word.substring(1); 
    if (first.equals(first.toUpperCase()) && rest.equals(rest.toLowerCase())) {
        return true;
    }
    return false;
    }
}