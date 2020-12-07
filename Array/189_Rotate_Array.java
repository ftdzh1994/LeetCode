class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % (n);
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}



// Try one time travesal

/* 
（补充）关于上述两种情况何时出现：
其实是这样的，对于一个长度为 nn 的数组，整体移动 kk 个位置

当 nn 和 kk 的最大公约数 等于 1 的时候：1 次遍历就可以完成交换；比如 n = 5, k = 3n=5,k=3
当 nn 和 kk 的最大公约数 不等于 1 的时候：1 次遍历是无法完成的所有元素归位，需要 mm (最大公约数) 次

*/