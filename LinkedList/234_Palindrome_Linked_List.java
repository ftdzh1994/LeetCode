/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        // find the middle node
        ListNode mid = middleNode(head);
        System.out.println(mid.val);
        // reverse the latter list
        ListNode l1 = head;
        ListNode l2 = mid.next;
        l2 = reverseList(l2);
        ListNode curr = l2;
        while(curr != null) {
            curr = curr.next;
        }
        // compare
        while(l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode next_tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next_tmp;
        }
        return prev;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}