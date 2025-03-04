package org.example.algorithms.graf;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private int V; // Düğüm sayısı
    private LinkedList<Integer> adj[]; // Komşuluk listesi

    public BFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Graf'a kenar ekleme
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // BFS algoritması
    public void bfs(int start) {
        boolean[] visited = new boolean[V]; // Ziyaret edilen düğümler
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            // Tüm komşuları kuyruğa ekle
            for (int neighbor : adj[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS graph = new BFS(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("BFS (2'den başlayarak):");
        graph.bfs(2);
    }
}
