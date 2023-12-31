/**
 * https://leetcode.com/problems/reverse-linked-list/
 * Question number 206
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
        {
            return head ;
        }
        ListNode prev = null;
        while(head.next != null)
        {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        head.next = prev;
        return head ;
        
    }
}