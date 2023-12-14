/*
  Leet Code 
  Q 21  Merge Two Sorted Lists
 */
public class Merge_Two_Sorted_Lists
{
    public static void main(String args[])
    {
        Merge_Two_Sorted_Lists head1 = new Merge_Two_Sorted_Lists();
        head1.add_first(15);
        head1.add_first(10);
        head1.add_first(7);
        head1.add_first(7);
        head1.add_first(3);
        head1.add_first(1);
        head1.add_first(1);
        System.out.println("List1");
        head1.display();
        Merge_Two_Sorted_Lists head2 = new Merge_Two_Sorted_Lists();
        head2.add_first(100);
        head2.add_first(99);
        head2.add_first(78);
        head2.add_first(5);
        head2.add_first(5);
        head2.add_first(0);
        System.out.println("List2");
        head2.display();
        System.out.println();
        Merge_Two_Sorted_Lists ans =Merge_Two_Sorted_Lists.merge(head1,head2);
        ans.display();
        
    }
    public static Merge_Two_Sorted_Lists  merge(Merge_Two_Sorted_Lists head1 , Merge_Two_Sorted_Lists head2)
    {
        Node f = head1.head;
        Node s = head2.head;
        Merge_Two_Sorted_Lists ans  = new Merge_Two_Sorted_Lists();
        while(f!= null && s !=null )
        {
            if(f.val <= s.val)
            {
                ans.add_Last(f.val);
                f = f.next ;
            }
            else 
            {
                ans.add_Last(s.val);
                s = s.next;
            }
        }
        while(f!= null)
        {
            ans.add_Last(f.val);
            f = f.next ;
        }
        while(s!= null)
        {
            ans.add_Last(s.val);
            s = s.next ;
        }
        return ans;

    }
    // Node creation 
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
     public  void add_first(int val)
    {
        // 1 --> to create  a new node 
        Node newNode = new Node(val);
    
        if(head == null)
        {
            head = newNode;
            tail= newNode;
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
    public void add_Last(int val)
    {
        if(head == null)
        {
            add_first(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
    }
    
}