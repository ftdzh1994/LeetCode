class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i += 1;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}



// In Java, the input array is passed in by reference

// Deleting the duplicate elements in the original array means all the elements are put in the left side of array, 
// each of which occurs only once and in-place.