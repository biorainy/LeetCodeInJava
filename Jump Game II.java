public class Solution {
    public int jump(int[] nums) {
        if (nums.length < 2)
            return 0;
        int currentMax = 0, nextMax = 0;
        int i = 0, level = 0;
        
        while (true) {
            level++;
            for (; i <= currentMax; i++) {
                nextMax = Math.max(nextMax, nums[i] + i);
            }
            if (nextMax >= nums.length - 1)
                return level;
            if (currentMax < nextMax)    
                currentMax = nextMax;
            else
                return 0;
        }       
    }
}