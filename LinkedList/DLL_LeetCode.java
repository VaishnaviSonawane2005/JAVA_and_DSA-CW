package LinkedList;

import java.util.HashMap;


public class DLL_LeetCode {

    // =====================================================
    // COMMON DLL NODE
    // =====================================================
    static class Node {
        int key, val;
        Node prev, next;

        Node(int k, int v) {
            key = k;
            val = v;
        }
    }

    // =====================================================
    // 1. LRU CACHE (LC 146)
    // HashMap + DLL → O(1)
    // =====================================================
    static class LRUCache {
        int cap;
        HashMap<Integer, Node> map = new HashMap<>();
        Node head = new Node(0, 0), tail = new Node(0, 0);

        LRUCache(int capacity) {
            cap = capacity;
            head.next = tail;
            tail.prev = head;
        }

        int get(int key) {
            if (!map.containsKey(key)) return -1;
            Node n = map.get(key);
            remove(n);
            insertFront(n);
            return n.val;
        }

        void put(int key, int value) {
            if (map.containsKey(key))
                remove(map.get(key));
            else if (map.size() == cap)
                remove(tail.prev);

            Node n = new Node(key, value);
            insertFront(n);
            map.put(key, n);
        }

        void insertFront(Node n) {
            n.next = head.next;
            n.prev = head;
            head.next.prev = n;
            head.next = n;
        }

        void remove(Node n) {
            map.remove(n.key);
            n.prev.next = n.next;
            n.next.prev = n.prev;
        }
    }

    // =====================================================
    // 2. BROWSER HISTORY (LC 1472)
    // =====================================================
    static class BrowserHistory {
        static class Page {
            String url;
            Page prev, next;
            Page(String u) { url = u; }
        }

        Page curr;

        BrowserHistory(String homepage) {
            curr = new Page(homepage);
        }

        void visit(String url) {
            Page p = new Page(url);
            curr.next = p;
            p.prev = curr;
            curr = p;
        }

        String back(int steps) {
            while (steps-- > 0 && curr.prev != null)
                curr = curr.prev;
            return curr.url;
        }

        String forward(int steps) {
            while (steps-- > 0 && curr.next != null)
                curr = curr.next;
            return curr.url;
        }
    }

    // =====================================================
    // 3. FLATTEN MULTILEVEL DLL (LC 430)
    // =====================================================
    static class MultiNode {
        int val;
        MultiNode prev, next, child;
        MultiNode(int v) { val = v; }
    }

    static MultiNode flatten(MultiNode head) {
        dfs(head);
        return head;
    }

    static MultiNode dfs(MultiNode node) {
        MultiNode curr = node, last = null;

        while (curr != null) {
            MultiNode next = curr.next;
            if (curr.child != null) {
                MultiNode tail = dfs(curr.child);
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;

                if (next != null) {
                    tail.next = next;
                    next.prev = tail;
                }
                last = tail;
            } else last = curr;

            curr = next;
        }
        return last;
    }

    // =====================================================
    // 4. DESIGN CIRCULAR DEQUE (LC 641)
    // =====================================================
    static class MyCircularDeque {
        int size, cap;
        Node head = new Node(0, 0), tail = new Node(0, 0);

        MyCircularDeque(int k) {
            cap = k;
            head.next = tail;
            tail.prev = head;
        }

        boolean insertFront(int v) {
            if (size == cap) return false;
            Node n = new Node(0, v);
            n.next = head.next;
            n.prev = head;
            head.next.prev = n;
            head.next = n;
            size++;
            return true;
        }

        boolean insertLast(int v) {
            if (size == cap) return false;
            Node n = new Node(0, v);
            n.prev = tail.prev;
            n.next = tail;
            tail.prev.next = n;
            tail.prev = n;
            size++;
            return true;
        }

        boolean deleteFront() {
            if (size == 0) return false;
            head.next = head.next.next;
            head.next.prev = head;
            size--;
            return true;
        }

        boolean deleteLast() {
            if (size == 0) return false;
            tail.prev = tail.prev.prev;
            tail.prev.next = tail;
            size--;
            return true;
        }

        int getFront() { return size == 0 ? -1 : head.next.val; }
        int getRear() { return size == 0 ? -1 : tail.prev.val; }
    }

    // =====================================================
    // 5. DESIGN LINKED LIST (LC 707 – DLL VERSION)
    // =====================================================
    static class MyLinkedList {
        int size;
        Node head = new Node(0, 0), tail = new Node(0, 0);

        MyLinkedList() {
            head.next = tail;
            tail.prev = head;
        }

        int get(int index) {
            if (index < 0 || index >= size) return -1;
            Node cur = head.next;
            for (int i = 0; i < index; i++) cur = cur.next;
            return cur.val;
        }

        void addAtHead(int val) {
            Node n = new Node(0, val);
            n.next = head.next;
            n.prev = head;
            head.next.prev = n;
            head.next = n;
            size++;
        }

        void addAtTail(int val) {
            Node n = new Node(0, val);
            n.prev = tail.prev;
            n.next = tail;
            tail.prev.next = n;
            tail.prev = n;
            size++;
        }

        void deleteAtIndex(int index) {
            if (index < 0 || index >= size) return;
            Node cur = head.next;
            for (int i = 0; i < index; i++) cur = cur.next;
            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
            size--;
        }
    }

    // =====================================================
    // MAIN – ALL PROBLEMS CALLED
    // =====================================================
    public static void main(String[] args) {

        System.out.println("LRU Cache:");
        LRUCache lru = new LRUCache(2);
        lru.put(1, 10);
        lru.put(2, 20);
        System.out.println(lru.get(1)); // 10

        System.out.println("\nBrowser History:");
        BrowserHistory bh = new BrowserHistory("google.com");
        bh.visit("github.com");
        System.out.println(bh.back(1));

        System.out.println("\nCircular Deque:");
        MyCircularDeque dq = new MyCircularDeque(3);
        dq.insertLast(1);
        dq.insertFront(2);
        System.out.println(dq.getFront());

        System.out.println("\nDesign DLL:");
        MyLinkedList ll = new MyLinkedList();
        ll.addAtHead(10);
        ll.addAtTail(20);
        System.out.println(ll.get(1));
    }
}
