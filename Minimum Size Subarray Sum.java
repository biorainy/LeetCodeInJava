public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int len = Integer.MAX_VALUE;
        boolean flag = false;
        int fast = 0, slow = 0;
        
        if (nums.length == 0)
            return 0;
        int sum = nums[0];    
        while (fast < nums.length) {
            
            if (fast - slow + 1 >= len) {
                sum -= nums[slow++];
                continue;
            } else {
                if (sum >= s) {
                    len = fast - slow + 1;
                    sum -= nums[slow++];
                    if (slow > fast)
                        return len;
                    flag = true;
                }
                else
                    if (fast == nums.length - 1)
                        return flag == true ? len : 0;
                    else
                        sum+= nums[++fast];
            }
        }
        return flag == true ? len : 0;
    }
}