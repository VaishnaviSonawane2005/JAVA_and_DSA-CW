package LinkedList;

public class SLL_Operations {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;

    public boolean isEmpty(){
        return head == null;
    }

    public void insertAtBegin(int data){
        Node nn = new Node(data);
        nn.next = head;
        head = nn;
    }

    public void insertAtEnd(int data){
        Node nn = new Node(data);
        if(isEmpty()) {
            head = nn;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = nn;
    }

    public void insertAtPos(int data, int pos){

        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        Node nn = new Node(data);
        if(pos == 1) {
            insertAtBegin(data);
            return;
        }
        else{
            Node temp = head;
            for(int i = 0; i < pos-1 && temp != null; i++){
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            nn.next = temp.next;
            temp.next = nn;
        }
    }

    public void deleteFromBegin(){
        if(head == null){
            System.out.println("List is empty");
        }
        head = head.next;
    }

    public void deleteFromEnd(){
        if(head == null){
            System.out.println("List is empty");
        }
        if(head.next == null){
            deleteFromBegin();
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void display(){
        if(isEmpty())
            System.out.println("Empty LL");
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        SLL_Operations list = new SLL_Operations();
        list.insertAtBegin(5);
        list.insertAtEnd(12);
        list.insertAtEnd(12);
        list.display();
        list.insertAtPos(2, 2);
        list.display();
        list.insertAtEnd(12);
        list.display();
        list.insertAtEnd(4);
        list.display();
        list.deleteFromBegin();
        list.display();
        list.deleteFromEnd();
        list.display();

    }
}
