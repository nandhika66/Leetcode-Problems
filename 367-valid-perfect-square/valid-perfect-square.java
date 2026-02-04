class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int l = 1;
        int r = num/2;
        while(l<=r){
            long mid = (l+r)/2;
            if(mid*mid==num){
                return true;
            }else if(mid*mid>num){
                r=(int) mid-1;
            }else{
                l=(int) mid+1;
            }
        }
        return false;
    }
}
//sqrt always lies in n/2. Finding mid and checking square of mid meets num.
