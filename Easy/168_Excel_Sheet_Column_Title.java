class Solution {
    public String convertToTitle(int n) {
        String title = "";
        int quotient = (n - 1) / 26;
        int remainder = (n - 1) % 26;
        while (quotient != 0) {
            title = Character.toString((char)(remainder + 65)) + title;
            remainder = (quotient - 1) % 26;
            quotient = (quotient - 1) / 26;
        }
        return Character.toString((char)(remainder + 65)) + title;
    }
}


// Used StringBuilder
    // StringBuilder.append(Character)
    // StringBuilder.reverse().toString()