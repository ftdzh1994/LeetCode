class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // loop 1   (skip the duplicate element)
        for (int first = 0; first < n; first++) {
            int third = n - 1;
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
        // loop 2   (skip the duplicate element)
            for (int second = first + 1; second < n; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }

                // from right to left, find the third element
                while (second < third && nums[first] + nums[second] + nums[third] > 0) {
                    --third;
                }

                if (second == third) {
                    break;
                }

                if (nums[first] + nums[second] + nums[third] == 0) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
}