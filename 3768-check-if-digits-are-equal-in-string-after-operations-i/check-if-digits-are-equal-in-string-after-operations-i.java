class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder org = new StringBuilder(s);
        while(org.length()>2){
            StringBuilder temp = new StringBuilder();
            for(int i=1;i<org.length();i++){
                int val = ((int)org.charAt(i-1)+(int)org.charAt(i))%10;
                temp.append(val);
            }
            org = temp;
        }
        if(org.charAt(0)==org.charAt(1)){
            return true;
        }
        return false;
    }
}