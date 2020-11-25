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
// #1 HashSet 
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while(head != null) {
            if(!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

// #2 Two Pointer
// 仍可以优化
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p1 = dummy, p2 = head;
        while(p1 != null){              // 可以优化
            if (p1 == p2){
                return true;
            } else {
                p1 = p1.next;
                p2 = p2 != null? p2.next : dummy;   //指向dummy，防止第一个节点自循环
                p2 = p2 != null? p2.next : dummy;   
            }
        }
        return p1 != null;
    }
}