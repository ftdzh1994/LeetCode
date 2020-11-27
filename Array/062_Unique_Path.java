class Solution {
    public int uniquePaths(int m, int n) {
        return combat(m + n -2, m-1);
    }

    public static int combat(int m, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return m;
        if (n > m / 2)
            return combat(m, m - n);
        if (n > 1)
            return combat(m - 1, n - 1) + combat(m - 1, n);
        return -1;
        Math.
    }

    public static void main(String[] args) {
        System.out.println(combat(3, 2));
    }
}


// How to implement Combination (公式、模拟)
// How to implement Permutation (公式、模拟)