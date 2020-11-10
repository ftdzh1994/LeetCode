import java.util.HashSet;

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

 // 1. HashSet  Space Complexity O(n)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> sets = new HashSet<ListNode>();
        while(headA != null || headB != null) {
            if (headA != null){
                if (!sets.add(headA)){
                    return headA;
                } else {
                    headA = headA.next;
                }
            }

            if (headB != null){
                if (!sets.add(headB)){
                    return headB;
                } else {
                    headB = headB.next;
                }
            }
        }
        return null;
    }
}

// 2. Two Pointer  Space Complexity O(1)

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null? headB : pA.next;
            pB = pB == null? headA : pB.next;
        }
        return pA;
    }
}