import java.util.*;
class Solution {
    public int climbStairs(int n, int[] costs) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        for(int i=1;i<=n;i++){
            dp[i] = Integer.MAX_VALUE;
            if(i-1>=0){
                dp[i]=Math.min(dp[i],dp[i-1]+costs[i-1]+(i-(i-1))*(i-(i-1)));
            }
            if(i-2>=0){
                dp[i]=Math.min(dp[i],dp[i-2]+costs[i-1]+(i-(i-2))*(i-(i-2)));
            }
            if(i-3>=0){
                dp[i]=Math.min(dp[i],dp[i-3]+costs[i-1]+(i-(i-3))*(i-(i-3)));
            }
        }
        return dp[n];
    }
}