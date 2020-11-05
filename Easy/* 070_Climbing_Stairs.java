class Solution {
    public int climbStairs(int n) {
        int memo[] = new int[n+1];
        memo[1] = 1;
        memo[2] = 2;
        for (int i = 3; i < memo.length; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }
}

