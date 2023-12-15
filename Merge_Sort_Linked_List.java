 /**
  * https://leetcode.com/problems/sort-list/
  Q148
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 /*
     find middle  (create a helper function)
     sort the remaining part 
     make sure to make prev of next pointing to null
     merge two linked list
  */
public class Merge_Sort_Linked_List {
class Solution { 
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head ;
        }

        ListNode mid = middle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left ,right);
    }
    public ListNode merge(ListNode left , ListNode right)
    {
        ListNode ans= new ListNode();
        ListNode tail = ans;
        while(left != null && right != null)
        {
            if(left.val < right.val)
            {
                tail.next = left ;
                left = left.next ;
                tail = tail.next;
            }
            else 
            {
                tail.next = right ;
                right = right.next ;
                tail = tail.next;
            }
          
        }
        while(left != null)
        {
            tail.next = left ;
            left = left.next;
            tail = tail.next;
        }
        while(right != null)
        {
            tail.next = right ;
            right = right.next ;
            tail = tail.next;
        }
        return ans.next;
    }
    public ListNode middle(ListNode head )
    {
        // ListNode midprev = null ;
        // while(head != null && head.next != null)
        // {
        //     midprev = (midprev == null)?head :midprev.next;
        //     head = head.next.next ;
        // }
        // ListNode mid = midprev.next;
        // midprev.next = null;
        // return mid;
        ListNode fast = head ;
        ListNode slow = null ; 
        while(fast != null && fast.next != null)
        {
            if(slow == null)
            {
                slow = head ;
            }
            else 
            {
                slow = slow.next ;
            }
            fast = fast.next.next ;
        }
        ListNode mid = slow.next ;
        slow.next = null;
        return mid ;

    }
}
    
}
