class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0, max = 0;
        boolean present = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1' && !present){
                present = true;
            }else if(s.charAt(i)=='1' && present){
                count++;
                max = Math.max(count,max);
                count=0;
            }else if(present){
                count++;
            }
        }
        return max;
    }
}