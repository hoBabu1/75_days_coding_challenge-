import java.util.*;
// Implementatiob by Linked representation

public class BinaryTreeImplementation {
    public static void main(String args[])
    {
        BinaryTreeImplementation bt = new BinaryTreeImplementation();
        Scanner sc = new Scanner(System.in);
        bt.insert(sc);
        bt.Display(root,"");
        prettyDisplay(root , 0);
    }
    public static class Node 
    {
        Node right ;
        Node left ;
        int val ;
        public Node(int val)
        {
            this.val = val ;
            this.right = null;
            this.left = null;
        }
    }
    private static Node root ;
    public static void insert(Scanner sc )
    {
        System.out.println("Enter the Value of root node");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc , root);
    }
    public static void populate(Scanner sc , Node node)
    {
        System.out.println("Do you want to enter value at the left :"+node.val);
        boolean left = sc.nextBoolean();
        if(left)
        {
            System.out.println("Enter the value that u want to add at left");
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc, node.left );
        }
        System.out.println("Do you want to enter value at the right :"+node.val);
        boolean right = sc.nextBoolean();
        if(right)
        {
            System.out.println("Enter the value that u want to add at right");
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right );
        }
    }
    public static void Display(Node node , String indent)
    {
        if(node == null)
        {
            return;
        }
        System.out.println(indent + node.val);
        Display(node.left , indent+"\t");
        Display(node.right,indent+"\t");
    }
    public static void prettyDisplay(Node root , int level)
    {
        if(root == null)
        {
            return ;
        }
        prettyDisplay(root.right , level+1);
        if(level != 0)
        {
            for(int i = 0 ; i<level-1 ; i++)
            {
                System.out.print("|\t\t");
            }
             System.out.println("|---------->"+root.val);
        }
        else{
            System.out.println(root.val);
        }
         prettyDisplay(root.left , level+1);
    }
    
}
