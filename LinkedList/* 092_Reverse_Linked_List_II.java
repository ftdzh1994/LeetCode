/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return head;;

        // Move to the (m-1)th node
        ListNode prev = null, curr = head;
        while(m > 1){
            prev = curr;
            curr = curr.next;
            m--;
            n--;
        }

        // Recorder some information for later Reconnections
        // reverse node from m to n
        ListNode con = prev, tail = curr, third = null;
        while(n > 0){
            third = curr.next;
            curr.next = prev;
            prev = curr;
            curr = third;
            n--;
        }

        // Reconnect the old list and reversed list
        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        } 
        tail.next = curr;
        return head;
    }
}