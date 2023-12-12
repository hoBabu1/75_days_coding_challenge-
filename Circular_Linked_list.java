/*
   create a new circular linked list 
   insert 
   print circular linked list 
   delete a node in circular linked list 

*/
public class Circular_Linked_list {
    public static void main(String[] args) {
        Circular_Linked_list cll = new Circular_Linked_list();
        cll.insert(8);
        cll.insert(9);
        cll.insert(1);
        cll.insert(5);
        cll.display();
        cll.delete(1);

        cll.display();

        
    }
    public class Node 
    {
        int val ;
        Node next ;
        public Node(int val)
        {
            this.next = null;
            this.val = val;;
        }
    }
    private Node head ;
    private Node tail;
    public void insert(int val) 
    {
        Node newNode = new Node(val);
        if(head == null)
        {
            head = tail = newNode;
            return ;
        }
        tail.next = newNode;
        newNode.next = head ;
        tail = newNode;
    }
    public void display()
    {
        Node temp = head ;
        do
        {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }while(temp != head);
        System.out.println(("HEAD"));
    }
    public void delete(int val)
    {
        Node temp = head ;
        if(temp == null)
        {
            return ;
        }
        if(temp.val == val)
        {
            head = head.next ;
            tail.next = head ;
            return;
        }
        do {
            Node n = temp.next;
            if(n.val == val)
            {
                temp.next = n.next ;
                break;
            }
           temp = temp.next ;

        }while(temp != null);
    }
}
