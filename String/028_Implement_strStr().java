class Solution {
    public int strStr(String haystack, String needle) {
        int[] shift = getShift(needle);
        int n = haystack.length(), m = needle.length();
        int i = m - 1;
        while (i < n) {
            int l = 0;
            while (l < m && haystack.charAt(i - l) == needle.charAt(m - 1 - l)) {
                l++;
            }
            if (l == m) {
                return i - (m - 1);
            } else {
                int index = charToIndex(haystack.charAt(i));
                i += shift[index];
            }
        }
        return -1;
    }

    public int[] getShift(String pattern) {
        int shift[] = new int[26];
        int n = pattern.length();
        Arrays.fill(shift, n);
        for(int i = 0; i < n - 1; i++) {
            int index = charToIndex(pattern.charAt(i));
            shift[index] = n - (i + 1);
        }
        return shift;
    }

    public int charToIndex(char c) {
        return (int) c - 'a';
    }
}