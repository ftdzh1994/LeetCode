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
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy;
        ListNode swapNode = null;
        while(head == null || head.next != null){
            swapNode = head.next;
            head.next = swapNode.next;
            swapNode.next = head;
            prev.next = swapNode;
            prev = head;
            head = head.next;
        }
        return dummy.next;
    }
}