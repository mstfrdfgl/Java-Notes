package org.example.algorithms.graf;

import java.util.Arrays;

public class Dijkstra {
    private int V; // Düğüm sayısı
    private int[][] graph; // Graf matrisi

    public Dijkstra(int v) {
        V = v;
        graph = new int[v][v];
    }

    // Graf'a kenar ekleme
    public void addEdge(int src, int dest, int weight) {
        graph[src][dest] = weight;
        graph[dest][src] = weight; // Yönlü olmayan graf
    }

    // Dijkstra algoritması
    public void dijkstra(int start) {
        int[] dist = new int[V]; // Başlangıç düğümüne olan mesafeler
        boolean[] visited = new boolean[V]; // Ziyaret edilen düğümler

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        for (int i = 0; i < V - 1; i++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        printSolution(dist);
    }

    // En küçük mesafeye sahip düğümü bulma
    private int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Sonuçları yazdırma
    private void printSolution(int[] dist) {
        System.out.println("Düğüm \t\t Başlangıca Olan Mesafe");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    public static void main(String[] args) {
        Dijkstra graph = new Dijkstra(5);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 7);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 1);

        System.out.println("Dijkstra Algoritması (0'dan başlayarak):");
        graph.dijkstra(0);
    }
}
