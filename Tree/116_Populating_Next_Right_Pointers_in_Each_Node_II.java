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
// Level Traversal
class Solution {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        if (root == null) return null;
        // Node root_copy = root;
        Node curr = null;
        queue.offer(root);
        while(!queue.isEmpty()) {
            int curr_size = queue.size();
            while(curr_size != 0){
                curr = queue.poll();
                curr.next = curr_size == 1 ? null : queue.peek();
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
                curr_size --;
            }
        }
        return root;
    }
}

// 方法二：使用已建立的 next 指针