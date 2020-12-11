class Solution {
    public int compareVersion(String version1, String version2) {
        String[] strArr1 = version1.split("\\.");
        String[] strArr2 = version2.split("\\.");
        int n1 = strArr1.length;
        int n2 = strArr2.length;
        for (int i = 0; i < Math.max(n1, n2); i++) {
            int v1 = i < n1 ? Integer.parseInt(strArr1[i]) : 0;
            int v2 = i < n2 ? Integer.parseInt(strArr2[i]) : 0;
            if (v1 > v2) {
                return 1;
            } else if (v1 < v2) {
                return -1;
            }
        }
        return 0;
    }
}

/** API
 *  version2.split("\\.");
 *  new Pair(0, p);
 */ 
