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
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode prev = null, tail = null, p1 = head, p2 = head.next;
        int count = 0;
        while(p2 != null){
            if (p2.val == p1.val){
                count ++;
            } else if (count == 0){
                if(prev == null){
                    prev = tail = p1;
                } else {
                    tail.next = p1;
                    tail = p1;
                }
                p1 = p2;
            }
            p2 = p2.next;
        }
        return prev;
    }
}