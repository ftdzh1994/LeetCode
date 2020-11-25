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
    public ListNode oddEvenList(ListNode head) {
        // corner issue
        if (head == null) return null;

        // two pointer record the head of odd and even list. ptr1 ptr2
        ListNode p1 = head, p2 = head.next;
        ListNode l1_head = p1, l2_head = p2;
        ListNode p1_tmp = null, p2_tmp = null;

        // swap operation
        while( p1.next != null && p2.next != null) {
            p1.next = p2 != null ? p2.next : null;
            p1 = p1.next;

            p2.next = p1.next;
            p2 = p2.next;
        }

        // connect odd list and even list
        p1.next = l2_head;
        return l1_head;
    }
}