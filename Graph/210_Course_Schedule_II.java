import java.util.LinkedList;
import java.util.Queue;

// dfs
class Solution {
    List<List<Integer>> edges;
    int[] visited;
    int[] ans;
    boolean valid = true;
    int index;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<List<Integer>>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<Integer>());
        }
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
        }
        visited = new int[numCourses];
        ans = new int[numCourses];
        index = numCourses - 1;
        
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }

        if (!valid) {
            return new int[0];
        }
        return ans;
    }

    public void dfs (Integer u) {
        visited[u] = 1;
        for (int v : edges.get(u)) {
            if (visited[v] == 0) {
                dfs(v);
            } else if (visited[v] == 1) {
                valid = false;
                return;
            }
        }
        ans[index--] = u;
        visited[u] = 2;
    }
}

//bfs

class Solution {
    List<List<Integer>> edges;
    int[] ans;
    int[] indeg;
    boolean valid = true;
    int index;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<List<Integer>>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<Integer>());
        }
        indeg = new int [numCourses];
        ans = new int[numCourses];
        index = 0;
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
            indeg[info[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indeg[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int u = queue.poll();
            ans[index++] = u;
            for (int v : edges.get(u)) {
                indeg[v]--;
                if (indeg[v] == 0) {
                    queue.offer(v);
                }
            }
        }

        if (index != numCourses) {
            return new int[0];
        }

        return ans;
    }
}