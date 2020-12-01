class Solution {
    public int maxProduct(int[] nums) {
        // product[i][0] stores the maximum product subarray ends at i
        // product[i][1] stores the minimum product subarray ends at i
        int[][] product = new int [nums.length][2];  
        int max = nums[0];
        for (int i = 0; i < product.length; i++) {
            if (i == 0) {
                product[i][0] = product[i][1] = nums[i];
                max = product[i][0];
            } else {
                product[i] = update(nums[i], product[i - 1][0] * nums[i], product[i - 1][1] * nums[i]);
                max = Math.max(max, product[i][0]);
            }
        }
        return max;
    }

    public int[] update(int x, int y, int z){
        int max = x, min = x;
        if (y > max) max = y;
        if (z > max) max = z;
        if (y < min) min = y;
        if (z < min) min = z;
        return new int[] { max , min};
    }
}