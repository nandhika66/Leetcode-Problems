class Solution {
    public void dfs(int x, int y, int dx, int dy, int dp[][], int m, int n){
        if(x<0 || y<0 || x>=m || y>=n || dp[x][y]==1 ||dp[x][y]==3){
            return;
        }
        if(dp[x][y]==0){
            dp[x][y] = 2;
        }
        dfs(x + dx, y + dy, dx, dy, dp, m, n);
    }
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int count =0;
        int dp[][] = new int[m][n];
        for(int i=0;i<walls.length;i++){
            dp[walls[i][0]][walls[i][1]] = 1;
        }
        for(int i=0;i<guards.length;i++){
            dp[guards[i][0]][guards[i][1]] = 3;
        }
        for (int[] g : guards) {
            dfs(g[0] + 1, g[1], 1, 0, dp, m, n);  
            dfs(g[0] - 1, g[1], -1, 0, dp, m, n); // up
            dfs(g[0], g[1] + 1, 0, 1, dp, m, n);  // right
            dfs(g[0], g[1] - 1, 0, -1, dp, m, n); // left
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dp[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }
}