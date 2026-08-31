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
public ListNode reverseKGroup(ListNode head, int k) {

    // Dummy node
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    // Node before the current group
    ListNode groupPrev = dummy;

    while (true) {

        // Find kth node
        ListNode kth = groupPrev;

        for (int i = 0; i < k; i++) {

            kth = kth.next;

            // Less than k nodes remaining
            if (kth == null) {
                return dummy.next;
            }
        }

        // First node after current group
        ListNode groupNext = kth.next;

        // Save first node of current group
        ListNode groupStart = groupPrev.next;

        // Reverse the group
        ListNode prev = groupNext;
        ListNode curr = groupStart;

        while (curr != groupNext) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        // Connect previous part to reversed group
        groupPrev.next = kth;

        // Move to the next group
        groupPrev = groupStart;
    }
}
}