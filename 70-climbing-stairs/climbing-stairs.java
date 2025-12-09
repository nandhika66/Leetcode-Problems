class Solution{
    public int solve(int dp[],int n){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n] = solve(dp, n-1)+solve(dp, n-2);
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        return solve(dp,n);
    }
}