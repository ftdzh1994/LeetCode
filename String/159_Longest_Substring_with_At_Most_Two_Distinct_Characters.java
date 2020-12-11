class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int n = s.length();
        if (n <= 2) {
            return n;
        }

        Character ch1 = null, ch2 = null;
        int left = 0, right = 0, cnt1 = 0, cnt2 = 0;
        int maxL = 0;
        while(right < n) {
            // Move right
            if (ch1 == null || ch1 == s.charAt(right)) {
                ch1 = s.charAt(right);
                cnt1 += 1;
                ++right;
                continue;
            }
            if (ch2 == null || ch2 == s.charAt(right)) {
                ch2 = s.charAt(right);
                cnt2 += 1;
                ++right;
                continue;
            }
            // Move left
            maxL = Math.max(maxL, (cnt1 + cnt2));
            if (ch1.equals(s.charAt(left))) {
                cnt1 -= 1;
                ch1 = cnt1 == 0 ? null : ch1;
            } else if (ch2.equals(s.charAt(left))) {
                cnt2 -= 1;
                ch2 = cnt2 == 0 ? null : ch2;
            }
            ++left;
        }
        maxL = Math.max(maxL, (cnt1 + cnt2));
        return maxL;
    }
}

/* API
/ Collections.min(hashmap.values());
/ hashmap.size()
*/