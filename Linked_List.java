/*
  create a node 
  add a element in starting of the linked List 
  print the linked list 
  add a element at the last position of the linked List 
  delete at first 
  delete at last via using prev Node 
  delete at last via using size
  delete at particular index
*/
public class Linked_List {
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.add_first(5);
        ll.add_first(4);
        ll.add_first(3);
        ll.add_first(2);
        ll.add_first(1);
        ll.add_first(0);
        ll.add_Last(6);
        ll.add_Last(7);
        ll.add_Last(8);
         ll.display();
        ll.addInMiddle(15,1);
       // System.out.println(ll.delete_first());
        // System.out.println(ll.deleteViaIndex());
        // System.out.println(ll.deleteViaIndex());
        // System.out.println(ll.deleteViaIndex());
        // System.out.println(ll.deleteViaIndex());
        System.out.println(ll.deleteAtParticularIndex(5));


        // System.out.println(ll.delete_first());
        //ll.display(); 
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
    private int size ;
    private Node head ;
    private Node tail;
    public  void add_first(int val)
    {
        // 1 --> to create  a new node 
        Node newNode = new Node(val);
        size++;
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
        System.out.print("NULL");
    }
    public void add_Last(int val)
    {
        if(head == null)
        {
            add_first(val);
            return;
        }
        Node newNode = new Node(val);
        size++;
        tail.next = newNode;
        tail = newNode;
    }
    public void addInMiddle(int val , int index )
    {
        if(size-1 == index)
        {
            add_Last(val);
            return;
        }
        else if(index == 0 )
        {
            add_first(val);
            return;
        }
        else if(index < 0 || index > size-1)
        {
            System.out.print("Enter a valid index");
        }
        else 
        {
            Node newNode = new Node(val);
            size++;
            Node temp = head;
            for(int i = 1 ; i<index ; i++)
            {
                temp = temp.next ;
            }
            Node temp2 = temp.next;
            temp.next = newNode ;
            newNode.next = temp2;
        }
    }
    public int delete_first()
    {
        Node temp = head ;
        head = head.next ;
        size--;
        if(head == null)
        {
            tail= null;
        }
        return temp.val;
    }
    public int delete_Last()
    {
        Node prev = null ;
        Node temp = head;
        while(temp.next != null)
        {
            prev = temp ;
            temp = temp.next;
        }
        prev.next = null;
        tail = prev;
        size--;
        return temp.val;
    }
    public int deleteViaIndex()
    {
        if(size < 1)
        {
            return delete_first();
        }
        Node temp = getNode(size);
        int val = temp.next.val;
        temp = temp.next;
        tail = temp;
        size--;
        return val;
    }
    public Node getNode(int size)
    {
        Node temp = head ;
        for(int i = 1 ; i<size-1 ; i++)
        {
            temp = temp.next;
        }
        return temp;
    }
    public int deleteAtParticularIndex(int index )
    {
        if(index == 0 )
        {
            return delete_first();
        }
        if(index == size-1)
        {
           return deleteViaIndex();
        }
        else if(index < 0 || index >=size)
        {
            return -1 ; 
        }
        else 
        {
            Node temp = head ;
            for(int i = 0 ; i<index ; i++)
            {
                temp = temp.next;
            }
            int val = temp.next.val ;
            temp = temp.next.next;
            return val;

        }
    }
}
