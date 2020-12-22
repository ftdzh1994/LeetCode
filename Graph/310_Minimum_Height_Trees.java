class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> graph = new ArrayList<List<Integer>>();
        int[] degree = new int[n];
        if (n == 1) {
            ans.add(0);
            return ans;
        }

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int[] e : edges) {
            degree[e[0]]++;
            degree[e[1]]++;
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) {
                queue.offer(i);
            }
        }
        int rest = n;
        while (rest > 2) {
            int size = queue.size();
            rest -= size;
            while (size > 0) {
                int u = queue.poll();
                for (int v : graph.get(u)) {
                    degree[v]--;
                    if (degree[v] == 1) {
                        queue.offer(v);
                    }
                }
                size--;
            }
        }

        while (!queue.isEmpty()) {
            ans.add(queue.poll());
        }
        
        return ans;
    }
}