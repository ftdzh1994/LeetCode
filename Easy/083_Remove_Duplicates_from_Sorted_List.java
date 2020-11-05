/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode cur = head;
        ListNode next = head.next;
        while (next != null) { //while (current != null && current.next != null) 
            if (next.val != cur.val) {
                cur.next = next;
                cur = cur.next;
            }
            next = next.next;
        }
        cur.next = null;
        return head;
    }
}


// be careful that the end of the ListNode must point to null.