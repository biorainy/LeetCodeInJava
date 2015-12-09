public class Solution {
    public int mySqrt(int x) {
        if (x <= 1)
            return x;
        int left = 1;
        int right = x;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid * mid == x)
                return mid;
            else if (mid < x / mid)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left  > x / left ? left - 1 : left;
    }
}