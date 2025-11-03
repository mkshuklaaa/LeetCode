class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char[][] grid = new char[m][n];

        // Mark walls and guards
        for (int[] w : walls) grid[w[0]][w[1]] = 'W';
        for (int[] g : guards) grid[g[0]][g[1]] = 'G';

        // Directions: up, down, left, right
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        // Mark all guarded cells
        for (int[] g : guards) {
            for (int[] d : dirs) {
                int r = g[0] + d[0];
                int c = g[1] + d[1];
                while (r >= 0 && c >= 0 && r < m && c < n && grid[r][c] != 'W' && grid[r][c] != 'G') {
                    if (grid[r][c] == 0) grid[r][c] = 'X'; // mark as guarded
                    r += d[0];
                    c += d[1];
                }
            }
        }

        // Count unguarded cells
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) count++;
            }
        }

        return count;
    }
}
