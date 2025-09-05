import java.util.*;
class Solution {
    public void dfs(char[][] grid, int i,int j,int r,int c,int count,boolean visited[][]){
        if(i<0 || j<0 || i>=r || j>=c || grid[i][j]=='0' || visited[i][j]){
            return;
        }
        visited[i][j] = true;
        dfs(grid,i+1,j,r,c,count,visited);
        dfs(grid,i-1,j,r,c,count,visited);
        dfs(grid,i,j+1,r,c,count,visited);
        dfs(grid,i,j-1,r,c,count,visited);
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        int r = grid.length;
        int c = grid[0].length;
        boolean visited[][] = new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(grid,i,j,r,c,count,visited);
                    count++;
                }
            }
        }
        return count;
    }
}