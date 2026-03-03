class Solution {
    public String minWindow(String s, String t) {
        int window = t.length();
        int freq[] = new int[128];
        int l=0;
        int min = Integer.MAX_VALUE;
        String ans = new String();
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
        }
        for(int r=0;r<s.length();r++){
            if(freq[s.charAt(r)]>0){
                window--;
            }
            freq[s.charAt(r)]--;
            while(window==0){
                if(r-l+1 < min){
                    min = r-l+1;
                    ans = s.substring(l,r+1);
                }
                freq[s.charAt(l)]++;
                if(freq[s.charAt(l)] > 0){
                    window++;
                }
                l++;
            }
        }
        return ans;
    }
}