class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n - 1;
        int idx1 = -1, idx2 = -1;
        while(l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target && (mid == l || nums[mid-1] < target)) {
                idx1 = mid;
                break;
            }
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }w

        l = idx1 == -1? 0 : idx1;
        r = n - 1;
        while(l <= r) {
            int mid = (l + r) / 2; 
            if (nums[mid] == target && (mid == r || nums[mid+1] > target)) {
                idx2 = mid;
                break;
            }
            if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return new int[] {idx1, idx2};
    }
}