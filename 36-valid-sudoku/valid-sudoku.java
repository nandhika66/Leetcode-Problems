class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean row[][] = new boolean[9][9];
        boolean col[][] = new boolean[9][9];
        boolean box[][] = new boolean[9][9];
        int val=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int k = (i/3)*3 +(j/3);
                if(board[i][j]!='.') val = board[i][j] - '0'-1;
                else continue;
                if(row[i][val] || col[j][val] || box[k][val]){
                    return false;
                }
                row[i][val] = true;
                col[j][val] = true;
                box[k][val] = true;
            }
        }
        return true;
    }
}