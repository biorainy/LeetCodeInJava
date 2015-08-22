/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    List<Integer> nums = new ArrayList<Integer>();
    public int sumNumbers(TreeNode root) {
        int num = 0;
        findNums(root, num);
        int sum = 0;
        for (int m : nums) {
            sum += m;
        }
        return sum;
    }
    
    public void findNums(TreeNode root, int num) {
        if (root == null)
            return;        
            
        num = num * 10 + root.val;
        
        if (root.left == null && root.right == null) {
            nums.add(num);
        } else {
            findNums(root.left, num);
            findNums(root.right, num);
        }
        
    }
}