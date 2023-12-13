/*
Q83 --> Leet Code 
  Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
  Return the linked list sorted as well.
*/


public class Remove_Duplicates_from_Sorted_List {
    public static void main(String args[])
    {
        Remove_Duplicates_from_Sorted_List ll = new Remove_Duplicates_from_Sorted_List();
        ll.add_first(5);
        ll.add_first(4);
        ll.add_first(4);
        ll.add_first(4);
        ll.add_first(3);
        ll.add_first(2);
        ll.add_first(2);
        ll.add_first(1);
        ll.add_first(1);
        ll.add_first(1);
        ll.display();
        System.out.println();
      //  ll.deleteDuplicates();
        ll.mentosMethod();
        ll.display();
    }
    public  class ListNode 
    {
        int val ;
        ListNode next;
        public ListNode(int val )
        {
            this.val = val;
            this.next = null;
        }
        public ListNode(int val  , ListNode next )
        {
            this.val = val;
            this.next = null;  
        }
    }
    private ListNode head ;
    public ListNode deleteDuplicates() {
        ListNode prev = head ;
        if(head == null)
        {
            return head ;
        }
        ListNode curr = head.next;
        while(curr != null)
        {
            if(curr.val == prev.val )
            {
                curr = curr.next ;
                prev.next = curr;
            }
            else 
            {
                curr = curr.next ;
                prev = prev.next ;
            }
        }
        return head ;
    }
       public  void add_first(int val)
    {
        // 1 --> to create  a new node 
        ListNode newNode = new ListNode(val);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void display()
    {
        ListNode temp = head ;
        while(temp!= null)
        {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    // without using prev node 
    public void mentosMethod()
    {
        ListNode temp = head ;
        while(temp.next != null)
        {
            if(temp.val == temp.next.val)
            {
                temp.next = temp.next.next;
            }
            else 
            {
                temp = temp.next ;

            }
        }

    }
    
}
