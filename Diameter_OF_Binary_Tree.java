import javax.swing.tree.TreeNode;

/**
 * https://leetcode.com/problems/diameter-of-binary-tree/ 
 * 
 * leet code 543 
 * 
 * 
 * 
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
class Diameter_OF_Binary_Tree {
     int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
     height(root);
     return diameter;
    }
    public int height(TreeNode node)
    {
        if(node == null)
        {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int dia = rightHeight+leftHeight;
        diameter= Math.max(dia , diameter);
        return Math.max(leftHeight ,rightHeight )+1;
    }
}