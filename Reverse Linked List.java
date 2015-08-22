/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(0);
        
        ListNode p = head;
        
        while (p != null) {
            ListNode curHead = dummy.next;
            ListNode nextP = p.next;
            dummy.next = p;
            p.next = curHead;
            p = nextP;
        }
        
        return dummy.next;
    }
}