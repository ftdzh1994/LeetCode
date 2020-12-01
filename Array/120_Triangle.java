class Solution {
    int min = Integer.MAX_VALUE;
    public int minimumTotal(List<List<Integer>> triangle) {
        int length = triangle.size();
        return dfs(triangle, length - 1, 0, 0);
    }

    public int dfs(List<List<Integer>> triangle, int maxLength, int level, int index) {
        int val = triangle.get(level).get(index);
        if ( level == maxLength ) {
            return val;
        }

        int leftSum = dfs(triangle, maxLength, level + 1, index);
        int rightSum = dfs(triangle, maxLength, level + 1, index + 1);
        return leftSum < rightSum ? leftSum + val : rightSum + val;
    }
}