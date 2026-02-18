class Solution {
    public boolean hasAlternatingBits(int n) {
        String val = Integer.toBinaryString(n);
        for(int i=0;i<val.length()-1;i++){
            if(val.charAt(i)==val.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}