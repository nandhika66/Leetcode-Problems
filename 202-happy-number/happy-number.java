import java.util.*;
class Solution {
    public boolean isHappy(int n) {
       Set<Integer> seen = new HashSet<>();
       do{
        if(seen.contains(n)) return false;
        seen.add(n);
        int sum =0;
        while(n>0){
            sum+= (n%10)*(n%10);
            n/=10;
        }
        n=sum;
       }while(n!=1);
        return true;
    }
}