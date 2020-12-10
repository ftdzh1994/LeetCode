import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int right = -1, ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (n != 0) {
                set.remove(s.charAt(i- 1))；
            }
            while(right + 1 < n && !set.contains(s.charAt(right + 1))) {
                set.add(s.charAt(right + 1));
                ++right;
            }
            ans = Math.max(ans, right - i + 1);
        }
        return ans;
    }
}