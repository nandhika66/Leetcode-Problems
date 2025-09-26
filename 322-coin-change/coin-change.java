import java.util.*;
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[] = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=0;i<n;i++){
            for(int j=coins[i]; j<dp.length;j++){
                if(dp[j - coins[i]]!=Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j - coins[i]]+1,dp[j]);
                }
            }
        }
        if(dp[amount]==Integer.MAX_VALUE) return -1;
        return dp[amount];
    }
}