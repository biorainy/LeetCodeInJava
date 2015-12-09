public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        return helper(nums, nums.length);            
    }
    
     public List<List<Integer>> helper(int[] nums, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (k == 0) {
            res.add(new ArrayList<Integer>());         
            return res;
        }
            
        for (List<Integer> list : helper(nums, k - 1)) {
            res.add(list);
            List<Integer> temp = new ArrayList<>();
            temp.addAll(list);
            temp.add(nums[k - 1]);
            res.add(temp);
        }
        
        return res;
                    
    }
}