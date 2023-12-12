public class Doubly_Linked_list {
    public static void main(String args[])
    {
        Doubly_Linked_list dll = new Doubly_Linked_list();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.add(4);
        dll.add(5);
        dll.addAtLastWithoutTail(15);
        dll.addAtLastWithoutTail(16);
        dll.addAtLastWithoutTail(17);
        dll.addAtLastWithoutTail(18);
        dll.display();
        dll.addAfterA_value(16,19);
        dll.display();
        // dll.reverse_display();
        // dll.diplay_without_tail();
    }
    public class Node 
    {
        Node prev ;
        Node next ;
        int val ;
        public Node (int val)
        {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head ;
    private Node tail ;
    int size = 0;
    public void add(int val)
    {
         // create a new Node 
         Node newNode = new Node(val);
        if(head == null)
        {
            head = newNode ;
            tail = newNode ;
            return;
        }
        newNode.next = head ;
        head.prev =newNode ;
        head = newNode; 
    }
    public void reverse_display()
    {
        Node temp = tail ;
        while(temp != null)
        {
            System.out.print(temp.val+"->");
            temp = temp.prev;
        }
        System.out.println("NULL");
    } 
    public void diplay_without_tail()
    {
        Node temp = head ;
        Node last = null;
        while(temp != null)
        {
            last = temp;
            temp = temp.next;
        }
        while(last != null)
        {
            System.out.print(last.val +"->");
            last = last.prev;
        }
        System.out.println("NULL");
    }
    public void addAtLastWithoutTail(int val)
    {
        if(head == null)
        {
            add(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head ;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        newNode.prev = temp;
        temp.next = newNode ;
        newNode.next = null;
    }
    public void addAfterA_value(int tgt , int val )
    {
        Node temp = head ;
        while(temp != null && temp.next != null)
        {
            if(temp.val == tgt && temp.next != null)
            {
                Node newNode = new Node(val);
                newNode.next = temp.next ;
                temp.next = newNode ;
                temp.next.prev = newNode;
                newNode.prev = temp;
                return ;
            }
            else 
            {
                temp = temp.next ;
            }
        }
         if(temp.next == null && temp.val == tgt )
        {
           // simple logic add at last 
           Node newNode = new Node(val);
           temp.next  = newNode;
           newNode.prev = temp;
           newNode.next = null;
           return ;
        }
         System.out.println("value is not present ");

    }
     public void display()
    {
        Node temp = head ;
        while(temp != null)
        {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    } 
}
