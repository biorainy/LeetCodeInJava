public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length < 2)
            return nums[0];
            
        int[] amount = new int[nums.length + 1];
        amount[0] = 0;
        amount[1] = nums[0];
        
        for (int i = 2; i <= nums.length; i++) {
            amount[i] = Math.max(amount[i-1], amount[i -2] + nums[i - 1]);
        }
     
        return amount[nums.length];   
    }
}