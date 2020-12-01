class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0], count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == major) {
                count ++;
            } else {            // nums[0] != major
                if (count > 0) {
                    count --;
                } else {
                    major = nums[i];
                }
            }
        }
        return major;
    }
}