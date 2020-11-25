class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i;
        int compl = 0;
        for(i = 0; i < nums.length; i++) {
            compl = target - nums[i];
            if (map.containsKey(compl)) {
                return new int [] {map.get(compl), i};
            } else {
                map.put(nums[i], i);
            } 
        }
        return new int[0];
    }
}