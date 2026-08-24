public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) {
            return null;
        }

        ListNode headA = head1;
        ListNode headB = head2;

        while (headA != headB) {
            if (headA == null) {
                headA = head2;
            } else {
                headA = headA.next;
            }

            if (headB == null) {
                headB = head1;
            } else {
                headB = headB.next;
            }
        }

        return headA;
    }
}