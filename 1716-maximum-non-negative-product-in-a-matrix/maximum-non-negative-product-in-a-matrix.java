class Solution {
    public int maxProductPath(int[][] grid) {
        final int mod = 1000000000 + 7;
        int m = grid.length;
        int n = grid[0].length;
        long dpMin[][] = new long[m][n];
        long dpMax[][] = new long[m][n];
        dpMin[0][0] = grid[0][0];
        dpMax[0][0] = grid[0][0];
        for(int i=1;i<m;i++){ // for first col, to check the next cols
            dpMin[i][0] = dpMin[i-1][0] * grid[i][0];
            dpMax[i][0] = dpMin[i][0]; // because there is only one value prior to it
        }
        for(int i=1;i<n;i++){ // for first row
            dpMin[0][i] = dpMin[0][i-1] * grid[0][i];
            dpMax[0][i] = dpMin[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if (grid[i][j] >= 0) {
                    dpMax[i][j] =
                        Math.max(dpMax[i][j - 1], dpMax[i - 1][j]) * grid[i][j];
                    dpMin[i][j] =
                        Math.min(dpMin[i][j - 1], dpMin[i - 1][j]) * grid[i][j];
                } else {
                    dpMax[i][j] =
                        Math.min(dpMin[i][j - 1], dpMin[i - 1][j]) * grid[i][j];
                    dpMin[i][j] =
                        Math.max(dpMax[i][j - 1], dpMax[i - 1][j]) * grid[i][j];
                }
            }
        }
        if(dpMax[m-1][n-1]< 0) return -1;
        return (int) (dpMax[m-1][n-1] % mod);
    }
}