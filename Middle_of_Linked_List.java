/**
 * https://leetcode.com/problems/middle-of-the-linked-list/submissions/
 * Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Middle_of_Linked_List {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head ;
        ListNode slow = head ;
        while(fast  != null  && fast.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
        
        
    }
}