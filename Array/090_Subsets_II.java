class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> set = new ArrayList<Integer>();
        res.add(set);
        boolean used[] = new boolean[nums.length];
        Arrays.sort(nums);

        backtrack(nums, 0, used, set, res);
        return res;
    }

    public void backtrack (int[] nums, int begin, boolean[] used, List<Integer> set, List<List<Integer>> res){
        for (int i = begin; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            set.add(nums[i]);
            used[i] = true;
            res.add(new ArrayList<>(set));
            backtrack(nums, i + 1, used, set, res);
            set.remove(set.size() - 1);
            used[i] = false;
        }
    }
}
