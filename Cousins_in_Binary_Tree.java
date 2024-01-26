/**
 * https://leetcode.com/problems/cousins-in-binary-tree/description/ 
 * leet code 993
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
class Cousins_in_Binary_Tree {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null)
        {
            return false ;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean  xTemp  ;
        boolean yTemp ;

        while(!q.isEmpty())
        {
            xTemp = false  ;
            yTemp = false ;
            int levelSize = q.size();
            for(int i = 0 ; i < levelSize ; i++)
            {
                TreeNode curr = q.remove();
                if(((curr.left != null)&&(curr.left.val == x || curr.left.val == y )) && ((curr.right != null)&&(curr.right.val == x || curr.right.val == y ) ))
                {
                    return false ;
                }
                if(curr.val == x )
                {
                    xTemp = true ;
                }
                 if(curr.val == y)
                {
                    yTemp = true ;
                }
                if(xTemp == true &&  yTemp == true )
                {
                    return true ;
                }
                if(curr.left != null)
                {
                    q.add(curr.left);
                }
                if(curr.right != null)
                {
                    q.add(curr.right);
                }
            }
        }
        return false ;
    }
}