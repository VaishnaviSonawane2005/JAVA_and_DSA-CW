package LinkedList;

public class DLL {

    // ================= NODE =================
    // Each node has data, previous pointer, and next pointer
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Head of DLL
    private Node head;

    // ================= BASIC CHECK =================

    // Check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // ================= INSERT OPERATIONS =================

    // Insert at beginning (O(1))
    public void insertAtBeginning(int data) {
        Node nn = new Node(data);

        if (isEmpty()) {
            head = nn;
            return;
        }

        nn.next = head;
        head.prev = nn;
        head = nn;
    }

    // Insert at end (O(n))
    public void insertAtEnd(int data) {
        Node nn = new Node(data);

        if (isEmpty()) {
            head = nn;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = nn;
        nn.prev = temp;
    }

    // Insert at given position (1-based index)
    public void insertAtPosition(int data, int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        Node nn = new Node(data);
        nn.next = temp.next;
        nn.prev = temp;

        if (temp.next != null)
            temp.next.prev = nn;

        temp.next = nn;
    }

    // ================= DELETE OPERATIONS =================

    // Delete from beginning (O(1))
    public void deleteFromBeginning() {
        if (isEmpty()) return;

        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // Delete from end (O(n))
    public void deleteFromEnd() {
        if (isEmpty()) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.prev.next = null;
    }

    // Delete by value
    public void deleteByValue(int value) {
        if (isEmpty()) return;

        if (head.data == value) {
            deleteFromBeginning();
            return;
        }

        Node temp = head;
        while (temp != null && temp.data != value)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        if (temp.next != null)
            temp.next.prev = temp.prev;

        temp.prev.next = temp.next;
    }

    // ================= SEARCH =================

    // Search an element (O(n))
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // ================= DISPLAY =================

    // Display forward direction
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display backward direction (uses prev pointer)
    public void displayBackward() {
        if (isEmpty()) return;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // ================= UTILITY =================

    // Find length of DLL
    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Reverse the DLL (BEST approach using swapping pointers)
    public void reverse() {
        Node curr = head;
        Node temp = null;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        if (temp != null)
            head = temp.prev;
    }

    // ================= DRIVER METHOD =================

    // Demonstrates ALL operations
    public void performAllOperations() {

        System.out.println("---- INSERT OPERATIONS ----");
        insertAtBeginning(10);
        insertAtBeginning(5);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtPosition(15, 3);
        displayForward();

        System.out.println("---- DISPLAY BACKWARD ----");
        displayBackward();

        System.out.println("---- DELETE OPERATIONS ----");
        deleteFromBeginning();
        deleteFromEnd();
        deleteByValue(15);
        displayForward();

        System.out.println("---- SEARCH ----");
        System.out.println("Search 20: " + search(20));
        System.out.println("Search 100: " + search(100));

        System.out.println("---- LENGTH ----");
        System.out.println("Length: " + length());

        System.out.println("---- REVERSE DLL ----");
        reverse();
        displayForward();
    }

    // ================= MAIN =================
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.performAllOperations();
    }
}
