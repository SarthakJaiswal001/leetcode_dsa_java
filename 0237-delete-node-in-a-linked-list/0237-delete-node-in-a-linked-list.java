/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // Check if the node is not the last node
        if (node != null && node.next != null) {
            // Copy the value of the next node to the current node
            node.val = node.next.val;
            // Update the current node's next pointer to skip the next node
            node.next = node.next.next;
        }  
    }
        // Helper method to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}