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
// Recursion
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    // corner issue
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
    // base
        if (l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}


// Iteration






// The clue/mindset of recursion
// How to create a new linked list with empty/null head?