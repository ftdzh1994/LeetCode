class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        // initialize f[0]
        int f[] = new int[m];
        f[0] = grid[0][0];
        for (int j = 1; j < m; j++) {
            f[j] = f[j - 1] + grid[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == 0) {
                    f[0] = grid[i][0] + f[0];
                } else {
                    f[j] = grid[i][j] + Math.min(f[j-1], f[j]);
                }
            }
        }
        return f[m-1];
    }
}