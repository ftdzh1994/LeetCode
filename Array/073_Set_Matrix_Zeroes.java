class Solution {
    boolean visited[][];
    int m;
    int n;
    public void setZeroes(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        visited = new boolean [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j]) continue;
                if (matrix[i][j] == 0) {
                    visited[i][j] = true;
                    helper(matrix, i , j, visited);
                }
            }
        }
    }

    public void helper(int[][] matrix, int center_i, int center_j, boolean[][] visited) {
        for(int i = 0; i < n; i++) {
            if (visited[i][center_j]) continue;
            visited[i][center_j] = true;
            if(matrix[i][center_j] == 0) {
                helper(matrix, i , center_j, visited);
            }
            matrix[i][center_j] = 0;
            
        }
        for(int j = 0; j < m; j++) {
            if (visited[center_i][j]) continue;
            visited[center_i][j] = true;
            if(matrix[center_i][j] == 0) {
                helper(matrix, center_i , j, visited);
            }
            matrix[center_i][j] = 0;
            
        }
    }
}

//标记法