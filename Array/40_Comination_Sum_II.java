class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backTrack(candidates, target, 0, new ArrayList<>(), res);
        
        return res;
    }

    public void backTrack (int[] candidates, int target, int begin, ArrayList<Integer> path, List<List<Integer>> res) {
        if (target < 0) {
            return;
        }
        if(target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < candidates.length; ++i) {
            if(i > begin && candidates[i] == candidates[i-1]) {
                continue;
            }
            path.add(candidates[i]);
            backTrack(candidates, target - candidates[i], i + 1, path, res);
            path.remove(path.size() - 1);
        }
    }
}