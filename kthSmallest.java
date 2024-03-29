/**
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
class Solution {

    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
        {
            return -1;
        }
        if(k == 0)
        {
            return -1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        ksmall(root , list);
        return list.get(k-1);
    }
    void ksmall(TreeNode root, ArrayList<Integer> list)
    {
        if(root == null )
        {
            return ;
        }
        ksmall(root.left , list );
        list.add(root.val);
        ksmall(root.right , list );

    }
}