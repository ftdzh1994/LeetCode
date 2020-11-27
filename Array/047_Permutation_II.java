import java.util.Arrays;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        boolean[] used = new boolean [n];
        Arrays.sort(nums);
        dfs(nums, used, path, res);
        return res;
    }

    public void dfs(int[] nums, boolean[] used, List<Integer> path, List<List<Integer>> res){
        if (path.size() == nums.length) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i] || (i > 0 && used[i] == used[i-1] && !used[i-1])) {
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            dfs(nums, used, path, res);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}