class Solution {
    public int solve(int n,int dp[],int nums[]){
        if(n==0) return dp[0]=nums[0];
        if(n==1) return dp[1]=Math.max(nums[0],nums[1]);
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = Math.max(solve(n-1,dp,nums), solve(n-2,dp,nums)+nums[n]);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) {
            return nums[0];
        }
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n-1,dp,nums);
    }
}