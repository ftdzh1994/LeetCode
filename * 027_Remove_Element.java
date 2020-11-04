class Solution {
    public int removeElement(int[] nums, int val) {
        // corner issue: only val element in nums[]
        //               the last one
        //               null array
        int i = 0;
        int j = nums.length - 1;

        while (i <= j ) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }
        }
        return i;
    }
}

// Java  if else if structure
// be careful about the courner issue
// two-pointer approach