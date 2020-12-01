class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (n <= 0 || k <= 0) return res;
        List<Integer> path = new ArrayList<Integer>();
        if (n >= 9) {
            backtrack(9, k , 1, n, path, res);
        } else {
            backtrack(n, k, 1, n, path, res);
        }
        return res;
    }

    public void backtrack(int n, int k, int begin, int sum, List<Integer> path, List<List<Integer>> res) {
        if(path.size() == k) {
            if (sum == 0) {
                res.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = begin; i <= n; i++) {
            path.add(i);
            backtrack(n, k, i + 1, sum - i, path, res);
            path.remove(path.size() - 1);
        }
    }
}

// Enumeration Question