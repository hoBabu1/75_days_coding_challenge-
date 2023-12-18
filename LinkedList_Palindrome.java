/**
 * https://leetcode.com/problems/palindrome-linked-list/submissions/
   Q234
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class LinkedList_Palindrome  {
    public boolean isPalindrome(ListNode head) {
        if(head == null  )
        {
            return true;
        }
        if(head.next == null)
        {
            return true ;
        }
        ListNode middle = Middle(head);
        ListNode last = reverse(middle);
        while(head != null && last != null)
        {
            if(head.val != last.val)
            {
                return false ;
            }
            head = head.next ;
            last = last.next;
        }
        return true ;


        
    }
    public ListNode Middle(ListNode head)
    {
        ListNode slow = head ;
        ListNode fast = head ;
        ListNode prev = null;

        while(fast != null && fast .next != null)
        {
            prev = slow ;
            slow = slow.next ;
            fast = fast.next.next;   
        }
        prev.next = null;
        return slow ;
    }
    public ListNode reverse(ListNode present)
    {
        ListNode curr = present ;
        ListNode prev = null;
        ListNode temp = curr.next;
        while(curr != null)
        {
            curr.next = prev;
            prev = curr;
            curr = temp;
            if(temp != null)
            {
                temp = temp.next; 
            }
        }
        return prev; 
    }
}