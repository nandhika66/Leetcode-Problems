class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    count++;
                    change(grid,i,j,m,n);
                }
            }
        }
        return count;
    }
    private void change(char grid[][],int i, int j,int m,int n){
        if(i<0 || j<0 || i==m || j==n || grid[i][j]!='1'){
            return;
        }
        grid[i][j]='5';
        change(grid,i-1,j,m,n);
        change(grid,i+1,j,m,n);
        change(grid,i,j-1,m,n);
        change(grid,i,j+1,m,n);
    }
}