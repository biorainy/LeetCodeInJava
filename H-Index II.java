public class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0, right = n - 1, mid = 0;
        int res = 0;
        while (left <= right) {
            mid = (left + right) / 2;

            if (citations[mid] >= n - mid) {
                res = n - mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            
        }
        
        return res;
    }
}