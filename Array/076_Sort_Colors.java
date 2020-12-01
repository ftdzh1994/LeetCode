class Solution {
    public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1;
        if (r <= 0) return;
        int curr = 0;
        while (curr <= r) {
            if (nums[curr] == 0){
                swap(nums, curr, l);
                curr ++;
                l ++;
                continue;
            } else if (nums[curr] == 2) {
                swap(nums, curr, r);
                r--;
                continue;
            } else {            // nums[curr] == 1;
                curr ++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}