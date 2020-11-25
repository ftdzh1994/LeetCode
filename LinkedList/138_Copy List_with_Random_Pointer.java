/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
// Backtracking
class Solution {
    HashMap<Node, Node> added = new HashMap<Node, Node>();
    
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        
        if (added.containsKey(head)){
            return added.get(head);
        }

        Node node = new Node(head.val);
        this.added.put(head, node);
        node.random = this.copyRandomList(head.random);
        node.next = this.copyRandomList(head.next);
        
        return node;
    }
}

// Time Space O(1) Approach