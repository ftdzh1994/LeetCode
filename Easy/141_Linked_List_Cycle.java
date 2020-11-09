/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while(head != null) {
            if(!seen.add(head)) {
                return false;
            }
            head = head.next;
        }
    }
}

// Hash set
    //  Boolean set.add()

// Two pointer