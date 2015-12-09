public class Solution {
    public int numSquares(int n) {
/*        Double d = Math.sqrt(n);
        int m = d.intValue();*/
        int[] nums = new int[n + 1];
        Arrays.fill(nums, Integer.MAX_VALUE);
        
        nums[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j*j <= i; j++) {
                nums[i] = Math.min(nums[i], nums[i - j * j] + 1);
            }
        }

        return nums[n];
    }
}