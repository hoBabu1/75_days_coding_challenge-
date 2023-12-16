public class Reverse_LinkedList_Recursion {
    public static void main(String args[])
    {
        Reverse_LinkedList_Recursion ll = new Reverse_LinkedList_Recursion();
        ll.add(78);
        ll.add(101);
        ll.add(77);
        ll.add(58);
        ll.add(85);
        ll.add(2);
        ll.add(96);
        ll.add(98);
        ll.display();
        System.out.println();
        ll.reverse(ll.head);
        ll.display();


    }
    public void reverse(Node node )
    {
        if(node == tail )
        {
            head = tail;
            return ;
        }
        reverse(node.next);
        tail.next = node ;
        tail = node ;
        tail.next = null;

    }
    public  class Node 
    {
        int val ;
        Node next;
        public Node(int val )
        {
            this.val = val;
            this.next = null;
        }
        public Node(int val  , Node next )
        {
            this.val = val;
            this.next = null;  
        }
    }
    
    private Node head ;
    private Node tail;
    public  void add(int val)
    {
        // 1 --> to create  a new node 
        Node newNode = new Node(val);
        if(head == null)
        {
            head = newNode;
            tail = head;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void display()
    {
        Node temp = head ;
        while(temp!= null)
        {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
}
