/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
       ListNode middle = findMiddle(head);
       ListNode newHead = reverseLinkedList(middle);
       
       while (newHead != null) {
           if (head.val != newHead.val)
                return false;
            
            head = head.next;
            newHead = newHead.next;
       }
         
        return true;
    }
    
    public ListNode findMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        if (head == null || head.next == null)
            return null;

        while (fast.next != null && fast.next.next != null) {
             fast = fast.next.next;
             slow = slow.next;
        }
        
        if (fast.next != null)
            slow = slow.next;
        return slow;
    }
    
    public ListNode reverseLinkedList(ListNode head) {
        if (head == null)
            return null;
        ListNode dummyHead = new ListNode(0);
        ListNode cur = head;
        dummyHead.next = head;
        
        while (cur.next != null) {
            ListNode t = dummyHead.next;
            dummyHead.next = cur.next;
            ListNode nn = cur.next.next;
            cur.next.next = t;
            cur.next = nn;
        }
        
        return dummyHead.next;
    }
}