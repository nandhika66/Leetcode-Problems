class Solution {
    public int solve(int row, int n,char grid[][]){
        if(row==n){
            return 1;
        }
        int count = 0;
        for(int col=0;col<n;col++){
            if(isSafe(row,col,n,grid)){
                grid[row][col]='Q';
                count += solve(row+1,n,grid);
                grid[row][col]='.';
            }
        }
        return count;
    }
    public boolean isSafe(int row,int col,int n,char grid[][]){
        for(int i=row-1;i>=0;i--){
            if(grid[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(grid[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(grid[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public int totalNQueens(int n) {
        if(n==2||n==3) return 0;
        char grid[][] = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(grid[i],'.');
        }
        int count = 0;
        return solve(0,n,grid);
    }
}