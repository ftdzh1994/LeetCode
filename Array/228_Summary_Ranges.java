class Solution {
    public List<String> summaryRanges(int[] nums) {
        // check the length of nums
        List<String> res = new ArrayList<String>();
        if (nums.length <= 0) return res;

        int start = nums[0], end = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1 ) {
                end = nums[i];
            } else {
                String range = start == end ? (Integer.toString(start)) : (start + "->" + end);
                res.add(range);
                start = end = nums[i];
            }
        }
        String range = start == end ? (Integer.toString(start)) : (start + "->" + end);
        res.add(range);
        return res;
    }
}