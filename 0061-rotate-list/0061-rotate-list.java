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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        // Step 1: Find the length of the linked list
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Step 2: Calculate effective rotation value
        int effectiveRotation = k % length;

        // Step 3: If no rotation is needed, return the original list
        if (effectiveRotation == 0) {
            return head;
        }

        // Step 4: Break the linked list into two parts
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < effectiveRotation; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Step 5: Connect the end of the second part to the head of the first part
        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;

    }
}