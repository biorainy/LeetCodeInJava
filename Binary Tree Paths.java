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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        
        if (root == null)
            return res;
            
        if (root.left == null && root.right == null) {
            res.add(Integer.toString(root.val));
            return res;
        } else {
            List<String> m = binaryTreePaths(root.left);
            List<String> n = binaryTreePaths(root.right);
            
            for (String s : m) {
                res.add(root.val + "->" + s);
            }
            
            for (String s : n) {
                res.add(root.val + "->" + s);
            }
        }
        
        return res;
    }
}