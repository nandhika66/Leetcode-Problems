class Solution {
    public boolean checkOnesSegment(String s) {
        boolean ones = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1' && !ones){
                ones = true;
            }else if(s.charAt(i)=='1' && s.charAt(i-1)=='0' && ones){
                return false;
            }
        }
        return true;
    }
}