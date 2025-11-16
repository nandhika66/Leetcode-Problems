class Solution {
    public int numSub(String s) {
        int count = 0, ones = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
                count =(count+ ones)%1000000007;
            } else {
                ones = 0;
            }
        }
        return count;
    }
}
