class Solution {
    public int dfs(int row, int col, int m, int n, int[][] dp){
        if(row>=m || col>=n){
            return 0;
        }
        if(row==m-1 && col==n-1){
            return 1;
        }
        if(dp[row][col]!=0){
            return dp[row][col];
        }
        dp[row][col] = dfs(row+1,col,m,n,dp) + dfs(row,col+1,m,n,dp);
        return dp[row][col];
    }
    public int uniquePaths(int m, int n) {
        int[][] dp= new int[m][n];
        return dfs(0,0,m,n,dp);
    }
}