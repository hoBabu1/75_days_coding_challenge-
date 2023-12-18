/**
 * https://leetcode.com/problems/reorder-list/description/
 * Question no. 143
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Reorder_LinkedList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
        {
            return;
        }
        ListNode secondStart = middle(head);
        ListNode reverseHead = reverse(secondStart); 
        merge(head , reverseHead );
    }
    public ListNode middle(ListNode head)
    {
        ListNode slow = head ;
        ListNode fast = head ;
        ListNode prev = null;
        while(fast != null && fast.next != null)
        {
            prev = slow ;
            slow = slow.next ;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
    public ListNode reverse(ListNode secondStart)
    {
        ListNode curr = secondStart;
        ListNode prev = null;
        ListNode temp = curr.next ;
        while(curr != null)
        {
            curr.next = prev;
            prev = curr;
            curr = temp ;
            if(temp != null)
            {
                temp = temp.next;
            }
        }
        return prev;
    }
    public void merge(ListNode head  , ListNode s)
    {
       ListNode f = head;
       while( f != null && s != null)
       {
           ListNode fcurr = f.next ;
           ListNode scurr = s.next ;
           f.next = s ;
           if(fcurr == null)
           {
               break;
           }
           else 
           {
               s.next = fcurr;

           }
           f = fcurr;
           s= scurr;
       }  
       if(s != null)
       {
           s.next = s.next ;
           s = s.next;
       }
    }
}