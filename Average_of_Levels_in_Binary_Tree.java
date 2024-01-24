/*
 * LeetCode 637
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/description/ 
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
class Average_of_Levels_in_Binary_Tree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null)
        {
            return result;

        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int levelSize= q.size();
            double max = 0.0;
            for(int i = 0 ; i< levelSize ; i++)
            {
                TreeNode curr = q.remove();
                max+=curr.val;
                if(curr.left != null)
                {
                    q.add(curr.left);
                }
                if(curr.right != null)
                {
                    q.add(curr.right);
                }
            }
            result.add(max/levelSize);
        }
        return result;
        
    }
}