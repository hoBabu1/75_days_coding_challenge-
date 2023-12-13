public class Insert_in_LL_Recursion {
    public static void main(String args[])
    {
        Insert_in_LL_Recursion ll = new Insert_in_LL_Recursion();
        ll.add(45);
        ll.add(46);
        ll.add(47);
        ll.add(48);
        ll.display();
        System.out.println();
       ll.insertRec(15,1);
        ll.display();


    }
    public class Node{
        int val ;
        Node next ;
        public Node(int val)
        {
            this.val = val ;
            this.next = null;
        }
        public Node(int val , Node node)
        {
            this.val = val;
            this.next = node;
        }
    }
    private Node head ;
    public void insertRec(int val , int index)
    {
        head = insertRecursio(val , index , head);
    }
    public Node insertRecursio(int val , int index , Node temp)
    {
        if(index == 0 )
        {
            Node newNode = new Node(val);
            newNode.next = temp ;
            //temp.next = newNode;
            return newNode; 
        }
        temp.next= insertRecursio(val , index-1 , temp.next);
        return temp;
    }
    public void display()
    {
        Node temp = head ;
        while(temp != null)
        {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
    }
    public void add(int val )
    {
        Node newNode = new Node(val);
         if(head== null)
         {
            head = newNode;
            return;
         }
         newNode.next = head;
         head = newNode;
    }
}
