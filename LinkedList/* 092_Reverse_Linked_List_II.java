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
        ListNode prev = new ListNode(0, head);
        ListNode reverseTail = null, reverseHead = null, curr = prev, beforeReverse = null;
        int index = 0;
        while(curr !=null ) {
            if ( index = m-1) {
                beforeReverse = curr;
            }
            if (m <= index || index <= n) {
                if (index == m) {
                    prev = null;
                    reverseTail = reverseTail = curr;
                } else {
                    reverseTail.next = curr;
                    reverseTail = curr;
                }

                if(index == n){
                    reverseTail.next = 
                }


            }





            index = index + 1;

        }
    }
}