// Leet code Problem NO : 876.
// Middle of the Linked List

import java.util.LinkedList;

public class P16 {

    // method to find middle node
    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // method to print entire linked list
    public static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        printList(head);

        ListNode mid = middleNode(head);
        System.out.println(mid.val); // Output: 3
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

