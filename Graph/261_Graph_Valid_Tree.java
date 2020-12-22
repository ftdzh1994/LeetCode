class Solution {
    int[][] graph;
    int[] visited;
    int n;
    int cnt = 0;
    boolean valid = true;

    public boolean validTree(int n, int[][] edges) {
        graph = new int[n][n];
        this.n = n;
        for (int[] edge : edges) {
            graph[edge[0]][edge[1]] = 1;
            graph[edge[1]][edge[0]] = 1;
        }
        visited = new int[n];

        boolean flag = visit(0);
        // 连通量为1 && 无环
        return cnt == n && flag;
    }

    public boolean visit(int u) {
        visited[u] = 1;
        cnt ++;
        for (int i = 0; i < this.n ; i++) {
            if (graph[u][i] == 1) {
                if (visited[i] == 0) {
                    graph[u][i] = 0;
                    graph[i][u] = 0;
                    visit(i);
                } else if (visited[i] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}