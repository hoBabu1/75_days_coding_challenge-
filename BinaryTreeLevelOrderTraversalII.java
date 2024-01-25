/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
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
class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
        {
            return result ;
        }
        
        Stack<List<Integer>> s  = new Stack<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> al = new ArrayList<>();
            int levelSize= q.size();
            for(int i = 0 ; i<levelSize ; i++)
            {
                TreeNode curr = q.remove();
                al.add(curr.val);
                if(curr.left != null)
                {
                    q.add(curr.left);
                }
                if(curr.right != null)
                {
                    q.add(curr.right);
                }
            }
            s.push(al);
        }
        while(!s.isEmpty())
        {
            result.add(s.pop());
        }
        return result;

    }
}