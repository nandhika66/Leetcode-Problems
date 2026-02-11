class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean flag = false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ' && !flag){
                flag = true;
            }
            if(s.charAt(i)==' ' && flag){
                break;
            }else if(flag){
                count++;
            }
        }
        return count;
    }
}