/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1)
            return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p = head;
        
        for (int i = 0; i < k; i++) {
            if (p == null)
                return head;
            p = p.next;
        }
        p = head;
        for (int i = 1; i <k; i++) {
            if (p != null && p.next != null) {
                ListNode oldHead = dummyHead.next;
                dummyHead.next = p.next;
                ListNode next = p.next.next;
                p.next.next = oldHead;
                p.next = next;
            } else
                return dummyHead.next;
        }
        p.next = reverseKGroup(p.next, k);
        
        return dummyHead.next;
    }
}