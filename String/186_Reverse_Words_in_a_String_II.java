class Solution {
    public void reverseWords(char[] s) {
        String concat = new String(s);
        List<String> words = Arrays.asList(concat.split(" "));
        Collections.reverse(words);
        String newConcat = String.join(" ", words);
        char[] newChars = newConcat.toCharArray();
        for (int i = 0; i < s.length; i++) {
            s[i] = newChars[i];
        }
    }
}

// In-place Approach
    // reverse two times