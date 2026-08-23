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
        // while(node.next != null)
        // {

        // slect the next node to delete copy of cuurent not value to be delte add ther the not to be delete value and do according
            node.val = node.next.val;
            node.next = node.next.next;
// 
        // }
        // node.next = null;
    }
}