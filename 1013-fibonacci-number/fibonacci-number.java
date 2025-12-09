class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        if(n==0){
            return 0;
        }
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<n+1;i++){
            dp[i] = dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
}