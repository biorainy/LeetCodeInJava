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
    ArrayList<Integer> al = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inOrderTraversal(root, k);
        return al.get(k - 1);
    }
    
    public void inOrderTraversal(TreeNode root, int k) {
        if (root == null)
            return;
        inOrderTraversal(root.left, k);
        al.add(root.val);
        if (al.size() >= k)
            return;
        inOrderTraversal(root.right, k);
    }
}