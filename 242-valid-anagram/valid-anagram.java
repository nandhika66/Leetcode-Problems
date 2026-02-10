class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char S[] =s.toCharArray();
        char T[] = t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        for(int i=0;i<s.length();i++){
            if(S[i]!=T[i]) return false;
        }
        return true;
    }
}