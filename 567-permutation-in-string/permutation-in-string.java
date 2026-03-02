class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l=0;
        int freq[] = new int[26];
        int size = s1.length();
        for(int i=0;i<size;i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int r=0;r<s2.length();r++){
            freq[s2.charAt(r)-'a']--;
            if(r-l+1 > size){
                freq[s2.charAt(l)-'a']++;
                l++;
            }
            if(check(freq)){
                return true;
            }
        }
        return false;
    }
    public boolean check(int freq[]){
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}