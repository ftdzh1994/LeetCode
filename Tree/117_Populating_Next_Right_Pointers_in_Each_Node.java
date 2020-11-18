/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    Node prev;
    Node nextLevelStart;

    public Node connect(Node root) {
        if (root == null) return null;
        Node curr = root;
        while (curr != null) {
            prev = null;
            nextLevelStart = null;
            for (Node p = curr; p != null; p = p.next){
                if (curr.left != null) {
                    handle(curr.left);
                } 
                if (curr.right != null) {
                    handle(curr.right);
                }
            }
            curr = nextLevelStart;
        }
        return root;
    }

    public void handle(Node p) {
        if (prev != null){
            prev.next = p;
        }
        if (nextLevelStart == null) {
            nextLevelStart = p;
        }
        prev = p;
    }
}