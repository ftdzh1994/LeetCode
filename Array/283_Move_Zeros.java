class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else if (zeroCount > 0){
                nums[i - zeroCount] = nums[i];
            }
        }
        for (int i = n - zeroCount; i < n; i++) {
            nums[i] = 0;
        }
    }
}

// To be optimized