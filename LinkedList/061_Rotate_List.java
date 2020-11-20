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
    public ListNode rotateRight(ListNode head, int k) {
        // get the length n of ListNode
        // get the remainder of k % n, get the index of partition n - k % n
        // find the partition node (pivot) [the new tail], it's successor is
        // the new head 
        if (head == null) return head;
        ListNode prev = new ListNode(0, head);
        ListNode curr = prev;
        int n = 0;
        while(curr.next != null) {
            n++;
            curr = curr.next;
        }
        ListNode tail = curr;

        int pivotIndex = n - (k % n);

        if (pivotIndex == n) return head;

        curr = prev;
        while( pivotIndex != 0) {
            curr = curr.next;
            pivotIndex --;
        }
        ListNode newTail = curr;
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;
        return newHead;
    }
}