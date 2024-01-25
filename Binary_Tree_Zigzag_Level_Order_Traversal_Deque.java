/**
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/ 
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
class Binary_Tree_Zigzag_Level_Order_Traversal_Deque {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int currSize = q.size();
            List<Integer> currList = new ArrayList<>(currSize);

            for (int i = 0; i < currSize; i++) {
                TreeNode curr = leftToRight ? q.removeFirst() : q.removeLast();
                currList.add(curr.val);

                if (leftToRight) {
                    if (curr.left != null) {
                        q.addLast(curr.left);
                    }
                    if (curr.right != null) {
                        q.addLast(curr.right);
                    }
                } else {
                    if (curr.right != null) {
                        q.addFirst(curr.right);
                    }
                    if (curr.left != null) {
                        q.addFirst(curr.left);
                    }
                }
            }

            result.add(currList);
            leftToRight = !leftToRight; // Toggle the direction after each level
        }

        return result;
    }

        
    }