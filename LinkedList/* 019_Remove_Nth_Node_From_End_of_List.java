import java.util.HashMap;
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

 // HashMap
 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a HashMap to store the index of the node
        int index = 0;
        HashMap<Integer,ListNode> map = new HashMap<Integer,ListNode> ();
        while(head != null) {
            map.put(index++, head);
            head = head.next;
        }
        // Based on the given node, find the node we want to delete and its parent node
        index = index + 1 - n; 
        if (index == 0){
            map.get(index).next = null;
            return map.get(1);
        }
        ListNode prev = map.get(index - 1);
        ListNode next = map.containsKey(index + 1) ? map.get(index + 1) : null;
        prev.next = next;
        return map.get(0);

            // Be careful about the situation that we want to delete the head node
    }
}