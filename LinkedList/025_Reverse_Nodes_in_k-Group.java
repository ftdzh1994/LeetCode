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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode kStart = head;
        ListNode kEnd = null;
        ListNode nextKStart ;
        ListNode curr = head;
        ListNode newHead = null;
        int length = 0;
        while(curr != null) {
            length ++;
            curr = curr.next;
        }

        while(k <= length + 1){
            curr = kStart;
            for (int i = 0; i < k - 1; i++) {
                kEnd = curr.next;
                curr = curr.next;
            }
            if(newHead == null){
                newHead = kEnd;
            }
            nextKStart = kEnd.next;

            while(kStart != kEnd) {
                curr = kStart;
                curr.next = kEnd.next;
                kEnd.next = curr;
                kStart = kStart.next;
            }

            kStart = nextKStart;
            length = length + 1 - k;
        }
        return newHead;
    }
}