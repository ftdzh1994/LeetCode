class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // loop 1   (skip the duplicate element)
        for (int first = 0; first < n; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
        // loop 2   (skip the duplicate element)
            for (int second = first + 1; second < n; second++) {
                int fourth = n - 1;
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }

                // loop 3 
                for (int third = second + 1; third < n; ++third) {
                    if (third > second + 1 && nums[third] == nums[third - 1]) {
                        continue;
                    }
                    // from right to left, find the third element
                    while (third < fourth && nums[first] + nums[second] + nums[third] + nums[fourth] > target) {
                        --fourth;
                    }

                    if (third == fourth) {
                        break;
                    }

                    if (nums[first] + nums[second] + nums[third] + nums[fourth] == target) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[first]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        list.add(nums[fourth]);
                        ans.add(list);
                    }
                }
            }
        }
        return ans;
    }
}