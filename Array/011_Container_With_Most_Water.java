class Solution {
    public int maxArea(int[] height) {
        // 从最宽处（两边）往内部推进
        // 由于内部的容器长度一定比外部小，所以只需要关注更高的边
        int left = 0, right = height.length - 1;
        int max = 0;
        while(left < right) {
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
            if (height[left] <= height[right]) {
                ++left;
            } else {
                --right;
            }
        }
        return max;
        // 完备性证明
    }
}