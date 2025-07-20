import java.util.Scanner;

class Node{
    int data;
    Node left,right;

    public Node(int x){
        data=x;
        left=right=null;
    }
}

class Tree{
    Node root;

    public void insert(int x)
    {
        Node nn=new Node(x);

        if(root==null)
        {
            root=nn;
        }
        else
        {
            insertAt(root,nn);
        }

    }
    private void insertAt(Node recentNode,Node nn)
    {
        Scanner read=new Scanner(System.in);
        do{
            System.out.println("ELEMENT "+recentNode.data+" IS PRESENT...");
            System.out.println("CHOOSE WHERE TO INSERT CURRENT NODE:\n 1. Left \n 2. Right\n");
            int enter=read.nextInt();
            if(enter==1)
            {
                if(recentNode.left==null)
                {
                    recentNode.left=nn;
                    break;
                }
                recentNode=recentNode.left;
            }
            else if(enter==2)
            {
                if(recentNode.right==null)
                {
                    recentNode.right=nn;
                    break;
                }
                recentNode=recentNode.right;
            }
            else
            {
                System.out.println("INVALID CHOICE ENTERED...!PLEASE ENTER 1 FOR LEFT AND 2 FOR RIGHT.");
            }
        }
        while(true);

    }
    public void display(){
        System.out.print("INORDER TRAVERSAL IS:");
        inorderTraversal(root);
    }

    private void inorderTraversal(Node current)
    {
        if(current!=null)
        {
            inorderTraversal(current.left);
            System.out.print(current.data+" ");
            inorderTraversal(current.right);
        }
    }

    public int count(){
        return count(root);
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        else{
            int count=1;
            count+=count(root.left);
            count+=count(root.right);
            return count;
        }
    }

}


public class Binaryt {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Tree b=new Tree();
        int c,x;

        int choice;

        do{
            System.out.println("Enter your choice:\n1.INSERT\n2.DISPLAY\n3.COUNT NODES");
            choice=read.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the data:");
                    x=read.nextInt();
                    b.insert(x);
                    break;

                case 2:
                    b.display();
                    break;

                case 3:
                    System.out.print("NODES ARE:"+b.count(b.root));
                    break;

                default:
                    System.out.println("INVALID CHOICE...!");

            }
            System.out.println(" DO YOU WANT TO CONTINUE? YES=1,NO=0");
            c=read.nextInt();
        }
        while(c!=0);

    }
}
