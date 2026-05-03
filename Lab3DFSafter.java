public class Lab3DFS {
    public static void main(String[] args) {

        int[][] graph = {
                {1, 2},
                {0, 3, 4},
                {0, 5, 6},
                {1},
                {1},
                {2},
                {2},

                {8},
                {7}
        };
        boolean[] visited = new boolean[9];
        int components = 0;
        for (int i = 0; i < 9; i++) {

            if (!visited[i]) {
                components++;
                 System.out.println("Острів " + components + ": ");
                 dfs(graph, i, visited);
                 System.out.println();
            }
        }
        System.out.println("Загальна кількість зв'язних компонент: " + components);

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
