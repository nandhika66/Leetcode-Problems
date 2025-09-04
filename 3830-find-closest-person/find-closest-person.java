import java.util.*;
class Solution {
    public int findClosest(int x, int y, int z) {
        x = Math.abs(z-x);
        y = Math.abs(z-y);
        if(x<y){
            return 1;
        }else if(y<x){
            return 2;
        }else{
            return 0;
        }
    }
}