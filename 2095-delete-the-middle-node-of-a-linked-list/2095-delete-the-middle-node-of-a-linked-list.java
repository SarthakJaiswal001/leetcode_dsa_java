/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
      if (head == null || head.next == null) {
            return null; // There is no middle node for a list with 0 or 1 element
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Use two pointers to find the middle node
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Remove the middle node
        if (prev != null) {
            prev.next = slow.next;
        } else {
            head = head.next;
        }

        return head;  
    }
      // Helper function to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}