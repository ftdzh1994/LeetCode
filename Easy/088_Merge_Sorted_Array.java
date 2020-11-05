class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] copyNums1 = Arrays.copyOf(nums1, m+n);
        int i = 0, j=0, k=0;
        while (i < m && j < n){
            if (copyNums1[i] <= nums2[j]) {
                nums1[k] = copyNums1[i];
                k++;
                i++;
            } else {
                nums1[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i < m) {
            nums1[k] = copyNums1[i];
            i++;
            k++;
        }
        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}


// sort from right to left, so that no need to use auxiliary space, because the element in that position is already compared and sorted.

// Deep Copy in Java