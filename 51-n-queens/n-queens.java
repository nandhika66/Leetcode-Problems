class Solution {
    public void solve(int row, int n,char grid[][],List<List<String>> ans){
        if(row==n){
            append(n,grid,ans);
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(row,col,n,grid)){
                grid[row][col]='Q';
                solve(row+1,n,grid,ans);
                grid[row][col]='.';
            }
        }
    }
    public void append(int n, char grid[][], List<List<String>> ans){
        List<String> oneLine = new ArrayList<>();
        for(int i=0;i<n;i++){
            oneLine.add(new String(grid[i]));
        }
        ans.add(oneLine);
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
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        if(n==2||n==3) return ans;
        char grid[][] = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(grid[i],'.');
        }
        solve(0,n,grid,ans);
        return ans;
    }
}