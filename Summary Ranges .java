public class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> s = new ArrayList<>();
        if (nums.length == 0)
            return s;
        StringBuilder sb = new StringBuilder();
        int begin = 0;
        sb.append(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1] + 1) {
                if (begin != i - 1) {
                    sb.append("->");
                    sb.append(nums[i-1]);
                }
                s.add(sb.toString());
                begin = i;
                sb = new StringBuilder();
                sb.append(nums[i]);
            }
        }

        if (sb.length() > 0) {
            if (begin < nums.length - 1) {
                sb.append("->");
                sb.append(nums[nums.length - 1]);
            }
            
            s.add(sb.toString());
        }
            
        
        return s;
    }
}