/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) { 
            
        char[] toRead = new char[4];
        int count;
        int cur = 0;
        while (cur < n) {
            count = read4(toRead);

            if (count < 4) {
                int step = 0;
                for (; step < count; step++) {
                    if(cur + step == n)
                        return n;
                    else {
                        buf[cur + step] = toRead[step];
                    }
                }
                return cur + step ;
            } else {//count == 4
                int step = 0;
                for (; step < count; step++) {
                    if(cur + step == n)
                        return n;
                    else {
                        buf[cur + step] = toRead[step];
                    }
                }
                cur += count;
            }
        }
        
        return n;
    }
}