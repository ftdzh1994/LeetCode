class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            int val = nums[index];
            if (val < 0){
                ans.add(index + 1);
            }
            nums[index] = - nums[index];        // line 11
        }
        return ans;
    }
}


// 1 ≤ a[i] ≤ n 的形式可以试用原地哈希

// line 11 仅针对题目所给特定条件。
// 若有元素重复两次以上（且希望返回元组），则需要判断 nums[i] 是否小于 0
// 若要返回不存在的元素，则 line 11 对每个 index 只执行一次，再寻找 nums[] 中的正值