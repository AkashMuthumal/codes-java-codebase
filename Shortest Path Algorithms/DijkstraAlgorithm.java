import java.util.*;

public class DijkstraAlgorithm {
    private static final int INF = Integer.MAX_VALUE;

    public static void dijkstra(int[][] graph, int startVertex) {
        int vertices = graph.length;
        int[] dist = new int[vertices];
        boolean[] visited = new boolean[vertices];

        // Initialize distances and visited array
        Arrays.fill(dist, INF);
        dist[startVertex] = 0;

        for (int i = 0; i < vertices - 1; i++) {
            int minDist = findMinDistance(dist, visited);

            visited[minDist] = true;

            for (int j = 0; j < vertices; j++) {
                if (!visited[j] && graph[minDist][j] != 0 && dist[minDist] != INF &&
                        dist[minDist] + graph[minDist][j] < dist[j]) {
                    dist[j] = dist[minDist] + graph[minDist][j];
                }
            }
        }

        // Print the shortest distances from the start vertex
        printShortestDistances(dist);
    }

    private static int findMinDistance(int[] dist, boolean[] visited) {
        int minDist = INF;
        int minDistVertex = -1;

        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] < minDist) {
                minDist = dist[i];
                minDistVertex = i;
            }
        }

        return minDistVertex;
    }

    private static void printShortestDistances(int[] dist) {
        System.out.println("Vertex \t Distance from Start Vertex");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " \t " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        int startVertex = 0;
        dijkstra(graph, startVertex);
    }
}

