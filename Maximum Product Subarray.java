public class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) 
            return 0;
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        max[0] = nums[0];
        min[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max[i] = Math.max(Math.max(max[i-1]*nums[i], min[i-1] * nums[i]), nums[i]);
            min[i] =  Math.min(Math.min(max[i-1]*nums[i], min[i-1] * nums[i]), nums[i]);
             if (max[i] > res)
                res = max[i];
        }

        return res;
    }
}