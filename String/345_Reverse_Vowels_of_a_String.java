class Solution {
    public String reverseVowels(String s) {
        char [] strArr = s.toCharArray();
        int n = strArr.length;
        if (n == 0) return s;

        int left = 0, right = n - 1;
        while(left < right) {
            while(!isVowel(strArr[left]) && left < right) {
                left++;
            }
            while(!isVowel(strArr[right]) && left < right) {
                right--;
            }
            char tmp = strArr[left];
            strArr[left] = strArr[right];
            strArr[right] = tmp;
            left++;
            right--;
        } 
        return new String (strArr);
    }

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}