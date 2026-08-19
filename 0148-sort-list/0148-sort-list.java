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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> n1 = new ArrayList<>();
        ListNode temp = head;
        while(temp != null)
        {
            n1.add(temp.val);
            temp = temp.next;
        }
        // n1.sort();
        Collections.sort(n1);
        ListNode temp1 = head ;
        int i =0;
         while(temp1 != null)
        {
            temp1.val = n1.get(i++);
            temp1 = temp1.next;
        }
        
        return head;
    }
}