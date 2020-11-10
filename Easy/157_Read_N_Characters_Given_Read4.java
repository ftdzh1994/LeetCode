/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4);
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        char tempBuf[] = new char[4];
        int tempLength;
        int bufIdx = 0;
        while( (tempLength = read4(tempBuf)) != 0) {
            for (int i = 0; i < tempLength && bufIdx < n; i++) {
                buf[bufIdx] = tempBuf[i];
                bufIdx ++;
            }
        }
        return bufIdx;
    }
}
 

// how to use given API 