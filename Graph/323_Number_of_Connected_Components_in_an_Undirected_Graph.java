class Solution {
    List<List<Integer>> graph;
    int[] visited;
    public int countComponents(int n, int[][] edges) {
        graph = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        visited = new int[n];
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                cnt++;
                dfs(i);
            }
        }
        return cnt;
    }

    public void dfs(int u) {
        visited[u] = 1;
        for (int v : graph.get(u)) {
            if (visited[v] == 0) {
                dfs(v);
            }
        }
    }
}