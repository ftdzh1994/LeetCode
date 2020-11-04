class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0, h = n - 1, ans = n;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (target <= nums[mid]) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}


// Binaray search approach structure
// get the equation through the condition and then implement it
// Be careful when there target val is duplicated in array, which requires to return the index of the firstly occurred element.\
// Java: >>  <<  >>>