/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0, lengthB = 0;
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        
        while (pointerA != null) {
            pointerA = pointerA.next;
            lengthA++;
        }
        
        while (pointerB != null) {
            pointerB = pointerB.next;
            lengthB++;
        }
        
        pointerA = headA;
        pointerB = headB;
        
        if (lengthA > lengthB) {
            int lenDiff = lengthA - lengthB;
            while (lenDiff > 0) {
                pointerA = pointerA.next;
                lenDiff--;
            }
            
         
        }
        else {
            int lenDiff = lengthB - lengthA;
            while (lenDiff > 0) {
                pointerB = pointerB.next;
                lenDiff--;
            }
        }
        
           while (pointerA != null) {
                if (pointerA == pointerB)
                    return pointerA;
                else {
                    pointerA = pointerA.next;
                    pointerB = pointerB.next;
                }
            }
            return null;
    }
}