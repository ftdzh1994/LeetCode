class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int ans[] = new int[length];
        for (int[] update : updates) {
            ans[update[0]] += update[2];
            if (update[1] < length - 1) {
                ans[update[1] + 1] -= update[2];
            }
        }

        for(int i = 1; i < length; i++) {
            ans[i] = ans[i - 1] + ans[i];
        }
        return ans;
    }
}

//差分数列 difference sequence/progression

//如果有一个初始输入数组，该如何变化