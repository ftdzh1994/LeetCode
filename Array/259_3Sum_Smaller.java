class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int ans = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < target) {
                    ans = ans + right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}

// Duplication is allowed