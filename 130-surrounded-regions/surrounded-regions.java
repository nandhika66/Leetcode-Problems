import java.util.*;
class Solution {
    public void dfs(char[][] board, int i,int j,int r,int c){
        if(i<0 || j<0 || i>=r || j>=c || board[i][j]!='O'){
            return;
        }
        if(board[i][j]=='O'){
            board[i][j] = '#';
        }
        dfs(board,i-1,j,r,c);
        dfs(board,i+1,j,r,c);
        dfs(board,i,j-1,r,c);
        dfs(board,i,j+1,r,c);
    }
    public void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='O'){
                    if(i-1<0 || j-1<0 || i+1>=r || j+1>=c){
                        dfs(board,i,j,r,c);
                    }
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j]=='#'){
                    board[i][j]='O';
                }
            }
        }
    }
}