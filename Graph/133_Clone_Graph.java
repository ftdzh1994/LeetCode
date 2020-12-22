/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Integer, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Node node_copy = new Node(node.val);
        map.put(node.val, node_copy);
        for (Node neighbor : node.neighbors) {
            if (map.containsKey(neighbor.val)) {
                node_copy.neighbors.add(map.get(neighbor.val));
            } else {
                node_copy.neighbors.add(cloneGraph(neighbor));
            }
        }
        return node_copy;
    }
}