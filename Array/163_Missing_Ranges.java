class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        // Travesal Until the last num
        List<String> ans = new ArrayList<>();
        int i = 0, n = nums.length ;
        while(i < n) {
            if (nums[i] == lower) {
                lower = nums[i] + 1;
                i++;
            } else {
                String s = lower == nums[i] - 1 ? lower + "" : (lower + "->" + (nums[i] - 1));
                ans.add(s);
                lower = nums[i];
            }
        }
        // Compare the latest lower with upper
        if (lower <= upper) {
            String s = lower == upper ? lower + "" : (lower + "->" + upper);
            ans.add(s);
        }
        return ans;
    }
}