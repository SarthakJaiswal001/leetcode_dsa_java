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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Move second pointer n+1 steps ahead
        for (int i = 1; i <= n + 1; i++) {
            second = second.next;
        }
        
        // Move first and second pointers together until second reaches the end
        while (second != null) {
            first = first.next;
            second = second.next;
        }
        
        // Skip the nth node from the end
        first.next = first.next.next;
        
        return dummy.next; // Return the updated head
    }
    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}