/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode p = newHead;
        
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else
              p = p.next;
            
        }
        
        return newHead.next;
    }
}