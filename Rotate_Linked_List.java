
    /**
     * https://leetcode.com/problems/rotate-list/submissions/
     * Q61 on leetCode
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Rotate_Linked_List {
    public ListNode rotateRight(ListNode head, int k) {
        if( k < 0 || head == null || head.next == null)
        {
            return head ;
        }
        int length = 1 ;
        ListNode last = head ;
        while(last.next != null)
        {
            last = last.next ;
            length++;
        }
        last.next = head ;
        int rotate = k%length;
        int skip = length - rotate;
        ListNode newEnd = head ;
        for(int i = 0 ; i<skip-1 ; i++)
        {
            newEnd = newEnd.next ;
        }
        head = newEnd.next ;
        newEnd.next = null;
        return head ;
}
}
    
}
