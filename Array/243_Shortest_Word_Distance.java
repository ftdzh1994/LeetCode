class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int index1 = -1, index2 = -1;
        int minDis = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(word1)) {
                index1 = i;
            }
            if(words[i].equals(word2)) {
                index2 = i;
            }
            if(index1 != -1 && index2 != -1) {
                minDis = Math.min(minDis, Math.abs(index1 - index2));
            }
        }
        return minDis;
    }
}