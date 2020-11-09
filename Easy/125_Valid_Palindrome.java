class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        int length = s.length();
        if (length == 0) return true;

        int leftIdx, rightIdx;
        if ( length % 2 == 1){
            leftIdx = length / 2;
            rightIdx = length / 2;
        } else {
            leftIdx = length / 2 - 1;
            rightIdx = length / 2;
        }
        while (leftIdx >= 0 && rightIdx <= length - 1) {
            if ( s.charAt(leftIdx) != (s.charAt(rightIdx))) {
                return false;
            }
            leftIdx = leftIdx - 1;
            rightIdx = rightIdx + 1;
        }

        return true;

    }
}



// String strNew = str.replaceAll("[^A-Za-z0-9]", "");

/*      本题考查的是语言中常用字符（串）相关 API 的使用。
 * Character.toLowerCase()
 * Character.isLetterOrDigit
 * StringBuffer
 * StringBuffer().reverse()
 * StringBuffer().toString()
 */

 // 没有必要分奇偶，双指针从左右往中间，判断条件为 left < right