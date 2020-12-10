class Solution {
    public String longestCommonPrefix(String[] strs) {
        // corner issue
        if(strs.length <= 0) {          // strs == null
            return "";
        }
        // base
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(i == strs[j].length() || c != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}

// TODO: Divide and conquer