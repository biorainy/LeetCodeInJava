public class Solution {
    public boolean isHappy(int n) {
        if (n <= 0)
            return false;
        HashSet<Integer> seen = new HashSet<>();
        int t = getSquareSum(n);
        seen.add(t);
        while (t != 1) {
            t = getSquareSum(t);
            if(!seen.add(t))
                return false;
        }
        
        return true;
    }
    
    public int getSquareSum(int n) {
        int res = 0;
        while (n > 0) {
            res += (n % 10) * (n % 10);
            n /= 10;
        }
        
        return res;
    }
}