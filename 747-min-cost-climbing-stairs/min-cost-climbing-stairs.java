class Solution {
    public int solve(int n,int dp[],int cost[]){
        if(n==0||n==1){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = Math.min(solve(n-1,dp,cost)+cost[n-1],solve(n-2,dp,cost)+cost[n-2]);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp,cost);
    }
}