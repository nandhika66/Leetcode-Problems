class Solution {
    public int rec(int n, int dp[]){
        if(n<=1) return dp[n];
        if(dp[n]!=0) return dp[n];
        dp[n] = rec(n-1,dp)+rec(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        int dp[]= new int[n];
        if(n==1){
            return 1;
        }
        dp[0] =1;
        dp[1] = 2;
        return rec(n-1,dp);
    }
}