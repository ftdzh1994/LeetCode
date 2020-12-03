class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (Math.abs(nums[i]) <= n) { 
                int idx = Math.abs(nums[i]) - 1;      
                nums[idx] = - nums[idx]; 
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }
        return 0;
    }
}

// the loop for(int x : xs[]) can't change the value of array

// XOR ; bit operation can be used when it claims that only element between 0 and n occur in the array