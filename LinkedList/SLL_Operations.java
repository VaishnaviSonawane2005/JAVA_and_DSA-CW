package LinkedList;

public class SLL_Operations {

    // ================= NODE DEFINITION =================
    // Each node stores data and reference to next node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head points to first node of linked list
    private Node head;

    // ================= BASIC OPERATIONS =================

    // Checks whether linked list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Inserts a node at the beginning (O(1))
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Inserts a node at the end (O(n))
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Inserts node at a given position (1-based index)
    public void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ================= DELETE OPERATIONS =================

    // Deletes first node of the list
    public void deleteFromBeginning() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Deletes last node of the list
    public void deleteFromEnd() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;
    }

    // Deletes node by value
    public void deleteByValue(int value) {
        if (isEmpty()) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value)
            temp = temp.next;

        if (temp.next == null)
            System.out.println("Value not found");
        else
            temp.next = temp.next.next;
    }

    // Deletes node at a given position
    public void deleteAtPosition(int position) {
        if (isEmpty() || position <= 0) return;

        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++)
            temp = temp.next;

        if (temp.next == null) {
            System.out.println("Position out of range");
            return;
        }

        temp.next = temp.next.next;
    }

    // ================= SEARCH OPERATIONS =================

    // Searches element using iteration
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // Searches element using recursion
    public boolean searchRecursive(Node node, int key) {
        if (node == null) return false;
        if (node.data == key) return true;
        return searchRecursive(node.next, key);
    }

    // ================= UTILITY OPERATIONS =================

    // Returns length of linked list
    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Displays linked list elements
    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ================= REVERSAL OPERATIONS =================

    // Reverses list using iteration
    public void reverse() {
        Node prev = null, curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Reverses list using recursion
    public Node reverseRecursive(Node node) {
        if (node == null || node.next == null)
            return node;

        Node rest = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;
        return rest;
    }

    // ================= ADVANCED OPERATIONS =================

    // Finds middle element using slow & fast pointer
    public void findMiddle() {
        if (isEmpty()) return;

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Element: " + slow.data);
    }

    // Detects loop using Floyd’s Cycle Detection
    public boolean detectLoop() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    // Removes loop if present
    public void removeLoop() {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
                return;
            }
        }
    }

    // Finds nth node from end using two-pointer technique
    public void nthFromEnd(int n) {
        Node first = head, second = head;

        for (int i = 0; i < n; i++) {
            if (first == null) return;
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        System.out.println(n + "th node from end: " + second.data);
    }

    // Removes duplicate elements from sorted list
    public void removeDuplicates() {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
    }

    // ================= MAIN METHOD =================
    public static void main(String[] args) {

        SLL_Operations list = new SLL_Operations();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtPosition(15, 3);

        list.display();

        list.deleteByValue(20);
        list.display();

        list.reverse();
        list.display();

        list.findMiddle();
        System.out.println("Length: " + list.length());
        System.out.println("Search 15: " + list.search(15));
    }
}
