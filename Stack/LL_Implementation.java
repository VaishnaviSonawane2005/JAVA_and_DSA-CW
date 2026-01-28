package Stack;

class Node{
    int val;
    Node next;

    public Node(int val){
            this.val = val;
            this.next = null;
    }
}

class Stack{
    public Node head = null;
    int size = 0;
    public void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }
    public void display(){
        Node temp = head;
        System.out.println("Elements in Stack are: ");
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int pop(){
        if(head == null){
            System.out.println("Stack is Empty!");
            return -1;
        }
        int x = head.val;
        head = head.next;
        return x;
    }
    public int peek(){
        if(head == null){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return head.val;
    }
}
public class LL_Implementation {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(12);
        st.push(8);
        st.push(6);
        st.push(55);
        st.push(15);
        st.display();
        System.out.println("Peek element is: "+st.peek());
        System.out.println("Popped element is: "+st.pop());
        st.display();

    }
}
