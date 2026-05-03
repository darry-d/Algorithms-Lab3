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
        int[] parent = new int[7];
        bfs(graph,0, visited, parent);

        System.out.println();
        int finish = 6;

        String path = String.valueOf(finish);
        int edgesCount = 0;

        while (finish != 0) {
            finish = parent[finish];
            path = finish + " -> " + path;

            edgesCount++;

        }
        System.out.println("Найкоротший шлях: " + path);
        System.out.println("Довжина шляху: " + edgesCount + " ребер");

    }

    public static void bfs(int[][] graph, int startVertex, boolean[] visited, int[] parent) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startVertex);
        visited[startVertex] = true;

        while(!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " -> ");
            for (int neighbor : graph[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = currentVertex;
                    queue.add(neighbor);
                }
            }
        }

    }
}
