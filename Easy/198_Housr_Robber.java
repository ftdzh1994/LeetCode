class Solution {
    public int rob(int[] nums) {
        int l = nums.length;
        if (l == 0) return 0;
        if (l == 1) return nums[0];
        if (l == 2) return Math.max(nums[0],nums[1]);

        int rob[] = new int[l];
        rob[0] = nums[0];
        rob[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < l; i++) {
            rob[i] = Math.max(rob[i-2] + nums[i], rob[i-1]);
            System.out.println("index: " + i + "  robb:  " + rob[i]);
        }
        return rob[l-1];
    }
}

//Dynamic Programming Equation