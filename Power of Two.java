public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 2) {
            if (n == 1)
             return true;
            else 
             return false;
        }
            
        while (n / 2 != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        
        if (n % 2 == 0)
            return true;
        else
            return false;
    }
}