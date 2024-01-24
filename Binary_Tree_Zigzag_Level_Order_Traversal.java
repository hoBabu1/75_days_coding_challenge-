
/**
 * leetcode 103
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
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
class  Binary_Tree_Zigzag_Level_Order_Traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>>  result = new ArrayList<>();
        if(root == null)
        {
            return result ;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int counter = 0 ; 
        while(!q.isEmpty())
        {
            int currSize = q.size();
            List<Integer> currList = new ArrayList<>(currSize);
            
            for(int i = 0 ; i<currSize ; i++)
            {
                TreeNode curr = q.remove();
                 currList.add(curr.val);
                if(curr.left != null)
                  {
                     q.add(curr.left);
                  }
                if(curr.right != null)
                  {
                     q.add(curr.right);
                 }
            }
            if(counter%2==0)
            {
                result.add(currList);
            }
            else 
            {
                result.add( reverse(currList));
            }
            counter = counter+1 ;
        }
        return result;
    }
     public List<Integer> reverse(List<Integer> curr) 
     {
         List<Integer> result1 = new ArrayList<>();
         int arr[] = new int[curr.size()];
          for (int i = 0; i < curr.size(); i++) {
        arr[i] = curr.get(i);
    }
         for(int i = 0 ; i<arr.length/2 ; i++ )
         {
            int temp = arr[i];
             arr[i] = arr[arr.length-i-1];
            arr[arr.length-1-i] = temp;
         }
         for(int i = 0 ; i< arr.length ; i++)
         {
             result1.add(arr[i]);
         }
         return result1;
     }
    
}