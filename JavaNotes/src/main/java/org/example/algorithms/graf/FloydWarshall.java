package org.example.algorithms.graf;

public class FloydWarshall {
    private int V; // Düğüm sayısı
    private int[][] dist; // Mesafe matrisi

    public FloydWarshall(int v) {
        V = v;
        dist = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (i == j) {
                    dist[i][j] = 0;
                } else {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }
    }

    // Graf'a kenar ekleme
    public void addEdge(int src, int dest, int weight) {
        dist[src][dest] = weight;
    }

    // Floyd-Warshall algoritması
    public void floydWarshall() {
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        printSolution();
    }

    // Sonuçları yazdırma
    private void printSolution() {
        System.out.println("Tüm düğüm çiftleri arasındaki en kısa yollar:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == Integer.MAX_VALUE) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FloydWarshall graph = new FloydWarshall(4);
        graph.addEdge(0, 1, 3);
        graph.addEdge(0, 2, 6);
        graph.addEdge(1, 2, 2);
        graph.addEdge(2, 3, 1);
        graph.addEdge(3, 0, 1);

        System.out.println("Floyd-Warshall Algoritması:");
        graph.floydWarshall();
    }
}
