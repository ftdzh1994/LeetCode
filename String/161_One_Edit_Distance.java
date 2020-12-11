class Solution {
    public boolean isOneEditDistance(String s, String t) {
        int ns = s.length(), nt = t.length();
        // s should be the shorter one
        if (nt < ns) {
            return isOneEditDistance(t, s);
        }
        // if longer than 1
        if (nt - ns > 1) {
            return false;
        }
        // base issue, compare one by one
        for (int i = 0; i < ns; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (ns == nt) {
                    return s.substring(i + 1).equals(t.substring(i + 1));
                } else {
                    return s.substring(i).equals(t.substring(i + 1));
                }
            }
        }
        return (nt == ns + 1);      // the edit distance is exactly 1
    }
}