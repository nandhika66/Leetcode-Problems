class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while(num>0){
            num -= i;
            i+=2;
        }
        if(num==0){
            return true;
        }
        return false;
    }
}
//sq nums format: 1+3+5..(odd nums)=n^2 - so subtacting all odd nums, then checking if it cancels out