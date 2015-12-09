/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p = dummyHead;
        ListNode cur = dummyHead;
        while (p.next != null) {
            if (p.next.val < x) {
                if (p == cur) {
                    p = p.next;
                    cur = cur.next;
                } else {
                    ListNode t = cur.next;
                    cur.next = p.next;
                    p.next = p.next.next;
                    cur = cur.next;
                    cur.next = t;
                }
            }
            else {
                p = p.next;
            }
        }
        
        return dummyHead.next;
    }
}