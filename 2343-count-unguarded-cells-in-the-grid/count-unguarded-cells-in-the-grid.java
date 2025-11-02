class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n]; // 0 empty, 1 wall, 2 guard, 3 guarded

        for (int[] w : walls) grid[w[0]][w[1]] = 1;
        for (int[] g : guards) grid[g[0]][g[1]] = 2;

        // For each guard, mark line of sight
        for (int[] g : guards) {
            int x = g[0], y = g[1];

            // up
            for (int i = x - 1; i >= 0 && grid[i][y] != 1 && grid[i][y] != 2; i--)
                grid[i][y] = 3;
            // down
            for (int i = x + 1; i < m && grid[i][y] != 1 && grid[i][y] != 2; i++)
                grid[i][y] = 3;
            // left
            for (int j = y - 1; j >= 0 && grid[x][j] != 1 && grid[x][j] != 2; j--)
                grid[x][j] = 3;
            // right
            for (int j = y + 1; j < n && grid[x][j] != 1 && grid[x][j] != 2; j++)
                grid[x][j] = 3;
        }

        int count = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 0)
                    count++;

        return count;
    }
}
