public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        return combinationSum2(candidates, target, 0);
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target, int start) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <target) {
                for (List<Integer> ar : combinationSum2(candidates, target - candidates[i], i + 1)) {
                    ar.add(0, candidates[i]);
                    res.add(ar);
                }
                while (i + 1 < candidates.length && candidates[i+1] == candidates[i])
                    i++;
            } else if (candidates[i] == target) {
                List<Integer> lst = new ArrayList<>();
                lst.add(candidates[i]);
                res.add(lst);
                break;
            } else
                break;
        }
        return res;
    }
}