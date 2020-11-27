class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        Deque<Integer> path = new ArrayDeque<>();
        backTrack(candidates, target, 0, path, res);
        return res;
        
    }

    public void backTrack(int[] candidates, int target, int curr, Deque<Integer> path, List<List<Integer>> res) {
        if(target < 0 ) {
            return;
        }
        if(target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = curr; i < candidates.length; i++) {
            path.addLast(candidates[i]);
            backTrack(candidates, target - candidates[i], i, path, res);
            path.removeLast();
        }
    }
}