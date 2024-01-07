/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/ 
 * leet code 94
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Inorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorderTraversal1(root , ans);
        return ans;

    }
    public void  inorderTraversal1(TreeNode root , List<Integer> ans) {
        
        if(root == null)
        {
            return;
        }
        inorderTraversal1(root.left , ans);
        ans.add(root.val);
        inorderTraversal1(root.right , ans);
    }
}