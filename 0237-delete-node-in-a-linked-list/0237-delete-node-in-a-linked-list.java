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
        ListNode n1 = node ;
          ListNode n2 = node ;
        while(n1.next != null)
        {
            n1.val = n1.next.val;
            n2 = n1;
            n1 = n1.next;
        }
        n2.next = null;
    }
}