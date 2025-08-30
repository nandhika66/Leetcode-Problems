import java.util.*;
class Solution {
    public boolean dfs(int i,int j,int r,int c,char board[][],int index, String word, boolean visited[][]){
        if(word.length()==index){
            return true;
        }
        if(i<0 || j<0 || i>=r || j>=c || visited[i][j] || board[i][j]!=word.charAt(index)){
            return false;
        }

        boolean flag = false;
        if(word.charAt(index)==board[i][j]){
            visited[i][j] = true;
            flag = dfs(i,j+1,r,c,board,index+1,word,visited) || dfs(i,j-1,r,c,board,index+1,word,visited) || dfs(i+1,j,r,c,board,index+1,word,visited) || dfs(i-1,j,r,c,board,index+1,word,visited);
        }
        visited[i][j]=false;
        return flag;
    }
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        boolean found =false;
        boolean visited[][] = new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(word.charAt(0)==board[i][j]){
                    if(dfs(i,j,r,c,board,0,word,visited)){
                        found = true;
                    }
                }
            }
        }
        return found;
    }
}