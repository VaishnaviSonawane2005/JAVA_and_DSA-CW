package LinkedList;

public class SLL_Complete {

    // ================= NODE =================
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // ================= UTILITIES =================
    static ListNode create(int[] arr) {
        ListNode dummy = new ListNode(0), cur = dummy;
        for (int x : arr) {
            cur.next = new ListNode(x);
            cur = cur.next;
        }
        return dummy.next;
    }

    static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // ================= CORE OPERATIONS =================

    // 1. Reverse Linked List
    static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    // 2. Middle of Linked List
    static ListNode middle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 3. Detect Cycle
    static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // 4. Start of Cycle
    static ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if (fast == null || fast.next == null) return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    // 5. Remove Nth Node From End
    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode f = dummy, s = dummy;

        for (int i = 0; i <= n; i++) f = f.next;
        while (f != null) {
            f = f.next;
            s = s.next;
        }
        s.next = s.next.next;
        return dummy.next;
    }

    // 6. Merge Two Sorted Lists
    static ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0), cur = dummy;
        while (a != null && b != null) {
            if (a.val <= b.val) { cur.next = a; a = a.next; }
            else { cur.next = b; b = b.next; }
            cur = cur.next;
        }
        cur.next = (a != null) ? a : b;
        return dummy.next;
    }

    // 7. Remove Duplicates (Sorted)
    static ListNode removeDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val)
                cur.next = cur.next.next;
            else
                cur = cur.next;
        }
        return head;
    }

    // 8. Remove All Duplicates
    static ListNode removeAllDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val)
                    head = head.next;
                prev.next = head.next;
            } else {
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }

    // 9. Palindrome Linked List
    static boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = reverse(slow.next);
        while (second != null) {
            if (head.val != second.val) return false;
            head = head.next;
            second = second.next;
        }
        return true;
    }

    // 10. Intersection of Two Lists
    static ListNode intersection(ListNode a, ListNode b) {
        if (a == null || b == null) return null;
        ListNode p1 = a, p2 = b;
        while (p1 != p2) {
            p1 = (p1 == null) ? b : p1.next;
            p2 = (p2 == null) ? a : p2.next;
        }
        return p1;
    }

    // 11. Odd Even List
    static ListNode oddEven(ListNode head) {
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

    // 12. Rotate List
    static ListNode rotate(ListNode head, int k) {
        if (head == null) return null;
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

    // 13. Reorder List
    static void reorder(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = reverse(slow.next);
        slow.next = null;

        ListNode first = head;
        while (second != null) {
            ListNode t1 = first.next;
            ListNode t2 = second.next;
            first.next = second;
            second.next = t1;
            first = t1;
            second = t2;
        }
    }

    // 14. Swap Nodes in Pairs
    static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null && cur.next.next != null) {
            ListNode a = cur.next;
            ListNode b = cur.next.next;
            a.next = b.next;
            b.next = a;
            cur.next = b;
            cur = a;
        }
        return dummy.next;
    }

    // 15. Reverse in K Group
    static ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        int count = 0;
        while (cur != null && count < k) {
            cur = cur.next;
            count++;
        }
        if (count < k) return head;

        ListNode prev = null, next = null, temp = head;
        for (int i = 0; i < k; i++) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head.next = reverseKGroup(temp, k);
        return prev;
    }

    // 16. Add Two Numbers
    static ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0), cur = dummy;
        int carry = 0;
        while (a != null || b != null || carry != 0) {
            int sum = carry;
            if (a != null) { sum += a.val; a = a.next; }
            if (b != null) { sum += b.val; b = b.next; }
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
        }
        return dummy.next;
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        System.out.println("Reverse:");
        print(reverse(create(new int[]{1,2,3,4})));

        System.out.println("Middle:");
        System.out.println(middle(create(new int[]{1,2,3,4,5})).val);

        System.out.println("Remove Nth:");
        print(removeNthFromEnd(create(new int[]{1,2,3,4,5}), 2));

        System.out.println("Merge:");
        print(merge(create(new int[]{1,3,5}), create(new int[]{2,4,6})));

        System.out.println("Remove Duplicates:");
        print(removeDuplicates(create(new int[]{1,1,2,3,3})));

        System.out.println("Remove All Duplicates:");
        print(removeAllDuplicates(create(new int[]{1,1,2,3,3,4})));

        System.out.println("Palindrome:");
        System.out.println(isPalindrome(create(new int[]{1,2,2,1})));

        System.out.println("Odd Even:");
        print(oddEven(create(new int[]{1,2,3,4,5})));

        System.out.println("Rotate:");
        print(rotate(create(new int[]{1,2,3,4,5}), 2));

        System.out.println("Swap Pairs:");
        print(swapPairs(create(new int[]{1,2,3,4})));

        System.out.println("Reverse K Group:");
        print(reverseKGroup(create(new int[]{1,2,3,4,5}), 2));

        System.out.println("Add Two Numbers:");
        print(addTwoNumbers(create(new int[]{2,4,3}), create(new int[]{5,6,4})));
    }
}
