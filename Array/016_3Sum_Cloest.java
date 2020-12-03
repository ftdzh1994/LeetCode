class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = Integer.MAX_VALUE;
        int minDif = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = n - 1;
        }
        return ans;
    }
}