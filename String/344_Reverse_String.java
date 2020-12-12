class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int left = 0, right = n - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}