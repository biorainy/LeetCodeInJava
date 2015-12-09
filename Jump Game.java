public class Solution {
    public boolean canJump(int[] nums) {
       if (nums.length == 0)
        return false;
        
       int max = nums[0];
       for (int i = 0; i <= max; i++) {
            if (max >= nums.length - 1)
                return true;
            max = Math.max(i + nums[i], max);
       }
       
       return false;
       // return canJump(nums, nums.length - 1);
    }
    
/*    public boolean canJump(int[] nums, int last) {
        if (nums[0] >= last)
            return true;
            
        for (int i = 1; i < last; i++) {
            if (nums[i] >= last - i)
                canJump(nums, i);
        }
        
        return false;
    }*/
}