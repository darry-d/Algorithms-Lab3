import java.util.LinkedList;
import java.util.Queue;

public class Lab3BFS {
    public static void main(String[] args) {
        int [][] graph = {
                {1,2},
                {0,3,4},
                {0,5,6},
                {1},
                {1},
                {2},
                {2}

        };
        boolean[] visited = new boolean[7];
        bfs(graph,0, visited);
    }

    public static void bfs(int[][] graph, int startVertex, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startVertex);
        visited[startVertex] = true;

        while(!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " -> ");
            for (int neighbor : graph[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

    }
}
