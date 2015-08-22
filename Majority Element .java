public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int counter = 1;
        int lastSeen = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (lastSeen == nums[i]) {
                counter++;
                if (counter > nums.length / 2)
                    return lastSeen;
            } else {
                lastSeen = nums[i];
                counter = 1;
            }
        }
        return lastSeen;
    }
}