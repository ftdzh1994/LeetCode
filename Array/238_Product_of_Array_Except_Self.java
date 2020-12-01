class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        // fulfill res[] with the suffix of element in nums[]
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                res[i] = 1;
                continue;
            }
            res[i] = res[i + 1] * nums[i + 1];
        }
        // fulfill nums[] with prefix
        int prevNum = nums[0];
        for (int i = 0; i < n; i ++) {
            if (i == 0) {
                prevNum = nums[0];
                nums[0] = 1;
                continue;
            }
            int temp = nums[i];
            nums[i] = nums[i - 1] * prevNum;
            prevNum = temp;
        }

        for (int i = 0; i < n; i ++) {
            res[i] = res[i] * nums[i];
        }
        return res;
    }
}

// it can still be optimized