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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((root.val < p.val && root.val > q.val) || (root.val > p.val && root.val < q.val))
            return root;

        else if (root.val == p.val)
            return p;
        else if (root.val == q.val)
            return q;
            
        else if (root.val < p.val && root.val < q.val) 
            return lowestCommonAncestor(root.right, p, q);
        
        else //(root.val > p.val && root.val > q.val) 
            return lowestCommonAncestor(root.left, p, q);
        
    }
}