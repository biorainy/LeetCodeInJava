public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) {
            nums[i] = i + 1;
        }
        return combinationSum3(nums, k, n, 0);
    }
    
    public List<List<Integer>> combinationSum3(int[] nums, int k, int n, int start) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (k == 0)
            return res;
        
        for (int i = start; i < nums.length; i++) {
            if (nums[i] < n) {
                for (List<Integer> lst : combinationSum3(nums, k - 1, n - nums[i], i + 1)) {
                    lst.add(0, nums[i]);
                    res.add(lst);
                }
            } else if (nums[i] == n && k == 1) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                res.add(temp);
            } else 
                break;
        }
        
        return res;
    }
    
}