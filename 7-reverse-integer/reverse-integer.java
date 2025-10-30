import java.util.*;
class Solution {
    public int reverse(int x) {
        boolean signed=false;
        if(x<0){
            signed=true;
            x=Math.abs(x);
        }
        long rev=0;
        while(x>0){
            rev=(rev*10)+(x%10);
            x/=10;
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                return 0;
            }
        }
        if(signed==true){
            rev=-rev;
        }
        return (int)rev;
    }
}