import java.util.*;
class Solution {
    public int rec(int n, int[] nums, int[] dp) {
        if (dp[n] != -1) return dp[n];
        if (n == 0) return nums[0];
        if (n == 1) return Math.max(nums[0], nums[1]);
       
        dp[n] = Math.max(nums[n] + rec(n - 2, nums, dp), rec(n - 1, nums, dp));
        return dp[n];
    
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        if(n==1) return nums[0];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        return rec(n-1,nums,dp);

    }
}