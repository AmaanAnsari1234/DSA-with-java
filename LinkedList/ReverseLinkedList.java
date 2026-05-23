/*
LeetCode 206 - Reverse Linked List
Pattern: Linked List (Pointer Manipulation)
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class ReverseLinkedList {

    // reverse linked list
    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next; // store next node

            curr.next = prev; // reverse link

            prev = curr; // move prev forward
            curr = next; // move curr forward
        }

        return prev;
    }

    // print linked list
    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
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

        System.out.print("Original List: ");
        printList(head);

        ListNode reversed = reverseList(head);

        System.out.print("Reversed List: ");
        printList(reversed);
    }
}

// node class
class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
