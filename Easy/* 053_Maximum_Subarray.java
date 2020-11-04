class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums){
            pre = Math.max(pre + x, x);
            maxAns = Math.max(pre, maxAns);
        }
        return maxAns;
    }
}




/*          Initializing an array
 * 1. int[] array = new int[5];
 * 2. int[] array; array = new int[]{1,2,3,4,5};
 * 3. int[] array = {11,12,13,14,15};
 */

 // Dynamic Programming: How to list equation and implement

 // Divide and counquer: Status tree