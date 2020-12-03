class Solution {
    public int findDuplicate(int[] nums) {
        String seen = "|";
        for(int num : nums) {
            String s = Integer.toString(num);
            if ( seen.contains("|" + s + "|")) {
                return num;
            } else {
                seen = seen + s + "|";
            }
        }
        return -1;
    }
}