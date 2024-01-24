/*
 * Leet Code 102 
 * https://leetcode.com/problems/binary-tree-level-order-traversal/description/ 
*/
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
class LeveLOrderraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
        Queue<TreeNode> q  = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int levelSize = q.size();
            List<Integer> currLevelList = new ArrayList<>(levelSize);
            for(int i = 0 ; i<levelSize ; i++)
            {
                TreeNode curr = q.remove();
                currLevelList.add(curr.val);
                if(curr.left != null)
                {
                    q.add(curr.left);
                }
                if(curr.right != null)
                {
                    q.add(curr.right);
                }
            }
            result.add(currLevelList);
        }

     return result;
        
    }
}