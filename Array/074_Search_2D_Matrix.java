class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        if (n == 0) return false;
        int m = matrix[0].length;
        int l = 0, r = n * m - 1;   // r = (n-1)*m + (m-1)
        while (l <= r) {
            int mid = (l + r) / 2;
            int row = mid / m;
            int column = mid % m;
            if (matrix[row][column] == target){
                return true;
            }
            if (matrix[row][column] < target) {
                l = m * row + column + 1;       // l = mid + 1
            } else {
                r = m * row + column - 1;       // r = mid - 1
            }
        }
        return false;
    }
}