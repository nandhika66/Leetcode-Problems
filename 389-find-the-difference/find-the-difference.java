class Solution {
    public char findTheDifference(String s, String t) {
        int alph[] = new int[26];
        
        for(int i=0;i<s.length();i++){
            int ch1 = s.charAt(i) - 'a';
            alph[ch1]++;
        }

        for(int i=0;i<t.length();i++){
            int ch2 = t.charAt(i) - 'a';
            alph[ch2]--;
        }

        char ans = '\0';
        for(int i=0;i<26;i++){
            if(alph[i] == -1){
                ans = (char)(i + 'a');
                break;
            }
        }
        return ans;
    }
}
