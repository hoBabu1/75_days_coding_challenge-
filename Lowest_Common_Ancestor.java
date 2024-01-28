/**
 * LeetCode - 236
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/ 
 * 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Lowest_Common_Ancestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == p || root == q || root == null)
        {
            return root ;
        }
        TreeNode right = lowestCommonAncestor(root.left , p , q );
        TreeNode left = lowestCommonAncestor(root.right , p , q);
        if(left != null && right != null )
        {
            return root ;
        }
        if(left == null )
        {
            return right ;
        }
        return left ;
        
    }
}