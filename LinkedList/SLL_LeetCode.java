package LinkedList;

public class SLL_LeetCode {

    // ================= ListNode =================
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // ================= Utility =================

    static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int x : arr) {
            curr.next = new ListNode(x);
            curr = curr.next;
        }
        return dummy.next;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // ================= 1. Reverse Linked List =================
    static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    // ================= 2. Middle of Linked List =================
    static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // ================= 3. Detect Cycle =================
    static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // ================= 4. Remove Nth Node From End =================
    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy, second = dummy;

        for (int i = 0; i <= n; i++)
            first = first.next;

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummy.next;
    }

    // ================= 5. Merge Two Sorted Lists =================
    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    // ================= 6. Remove Duplicates =================
    static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }

    // ================= 7. Palindrome Linked List =================
    static boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverseList(slow.next);
        ListNode first = head;

        while (second != null) {
            if (first.val != second.val)
                return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }

    // ================= 8. Intersection of Two Lists =================
    static ListNode getIntersectionNode(ListNode a, ListNode b) {
        if (a == null || b == null) return null;

        ListNode p1 = a, p2 = b;
        while (p1 != p2) {
            p1 = (p1 == null) ? b : p1.next;
            p2 = (p2 == null) ? a : p2.next;
        }
        return p1;
    }

    // ================= 9. Odd Even Linked List =================
    static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode odd = head, even = head.next, evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    // ================= 10. Rotate List =================
    static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;

        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        k %= len;
        if (k == 0) return head;

        tail.next = head;

        for (int i = 0; i < len - k; i++)
            tail = tail.next;

        head = tail.next;
        tail.next = null;
        return head;
    }

    // ================= DRIVER METHOD =================
    static void performAllOperations() {

        System.out.println("1. Reverse Linked List");
        ListNode a = createList(new int[]{1, 2, 3, 4});
        printList(reverseList(a));

        System.out.println("\n2. Middle of Linked List");
        ListNode b = createList(new int[]{1, 2, 3, 4, 5});
        System.out.println(middleNode(b).val);

        System.out.println("\n3. Detect Cycle");
        ListNode c = createList(new int[]{1, 2, 3});
        c.next.next.next = c.next; // create cycle
        System.out.println(hasCycle(c));

        System.out.println("\n4. Remove Nth Node From End");
        ListNode d = createList(new int[]{1, 2, 3, 4, 5});
        printList(removeNthFromEnd(d, 2));

        System.out.println("\n5. Merge Two Sorted Lists");
        ListNode l1 = createList(new int[]{1, 3, 5});
        ListNode l2 = createList(new int[]{2, 4, 6});
        printList(mergeTwoLists(l1, l2));

        System.out.println("\n6. Remove Duplicates");
        ListNode e = createList(new int[]{1, 1, 2, 3, 3});
        printList(deleteDuplicates(e));

        System.out.println("\n7. Palindrome Check");
        ListNode f = createList(new int[]{1, 2, 2, 1});
        System.out.println(isPalindrome(f));

        System.out.println("\n8. Intersection of Two Lists");
        ListNode common = createList(new int[]{8, 9});
        ListNode x = new ListNode(1);
        x.next = new ListNode(2);
        x.next.next = common;

        ListNode y = new ListNode(3);
        y.next = common;

        System.out.println(getIntersectionNode(x, y).val);

        System.out.println("\n9. Odd Even Linked List");
        ListNode g = createList(new int[]{1, 2, 3, 4, 5});
        printList(oddEvenList(g));

        System.out.println("\n10. Rotate List");
        ListNode h = createList(new int[]{1, 2, 3, 4, 5});
        printList(rotateRight(h, 2));
    }

    // ================= MAIN =================
    public static void main(String[] args) {
        performAllOperations();
    }
}
