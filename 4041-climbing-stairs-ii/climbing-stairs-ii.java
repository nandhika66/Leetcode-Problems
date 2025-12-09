class Solution {
    public int solve(int n,int dp[],int costs[]){
        if(n==0) return dp[0] = 0;
        if(n==1) return dp[1] = costs[0]+1;
        if(n==2) return dp[2] = Math.min(costs[1]+4, solve(1,dp,costs)+costs[1]+1);
        if(n==3) return dp[3] = Math.min(
            Math.min(costs[2]+9, solve(1,dp,costs)+costs[2]+4),
            solve(2,dp,costs)+costs[2]+1);
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = Math.min(
        Math.min((solve(n-1,dp,costs)+costs[n-1]+(n-(n-1))*(n-(n-1))),
        (solve(n-2,dp,costs)+costs[n-1]+(n-(n-2))*(n-(n-2)))),
        (solve(n-3,dp,costs)+costs[n-1]+(n-(n-3))*(n-(n-3)))
        );
    }
    public int climbStairs(int n, int[] costs) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp,costs);
    }
}