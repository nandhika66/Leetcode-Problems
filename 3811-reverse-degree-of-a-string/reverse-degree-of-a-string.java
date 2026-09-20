class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int val = 26 - (ch - 97);
            ans += val * (i+1);
        }
        return ans;
    }
}