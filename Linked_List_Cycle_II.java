/*
   https://leetcode.com/problems/linked-list-cycle-ii/submissions/
   Q142 Linked List Cucle List II

*//**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Linked_List_Cycle_II {
    public ListNode detectCycle(ListNode head) {
        int length = Length(head);
        ListNode slow = head ;
        ListNode fast = head ; 
        if(length == 0 )
        {
            return null;
        }
        while(length> 0)
        {
            slow = slow.next ;
            length--;

        }
        while(slow != fast )
        {
            slow = slow.next ;
            fast = fast .next ;
        }
        return slow ;   
    }
    public int Length(ListNode head)
    {
        ListNode fast = head ; 
        ListNode slow = head ;
        int length = 0 ;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next ;
            if(slow == fast )
            {
                ListNode temp = slow ;
                // cycle detetcted 
                do 
                {
                    temp = temp.next ;
                    length ++;
                }while(slow != temp);
                break;
            }
        }
        return length ;
    }

}