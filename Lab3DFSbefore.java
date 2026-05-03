public class Lab3DFS {
    public static void main(String[] args) {

        int[][] graph = {
                {1, 2},
                {0, 3, 4},
                {0, 5, 6},
                {1},
                {1},І
                {2},
                {2}
        };
        boolean[] visited = new boolean[7];
        dfs(graph, 0, visited);

    }
    public static void dfs(int[][] graph, int currentVertex, boolean[] visited) {
        visited[currentVertex] = true;

        System.out.print(currentVertex + " -> ");

        for (int neighbor : graph[currentVertex]) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }
}
