package org.example.algorithms.graf;

import java.util.LinkedList;

public class DFS {
    private int V; // Düğüm sayısı
    private LinkedList<Integer> adj[]; // Komşuluk listesi

    public DFS(int v) {
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

    // DFS algoritması (yardımcı fonksiyon)
    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        // Tüm komşuları ziyaret et
        for (int neighbor : adj[v]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // DFS algoritması
    public void dfs(int start) {
        boolean[] visited = new boolean[V];
        dfsUtil(start, visited);
    }

    public static void main(String[] args) {
        DFS graph = new DFS(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("DFS (2'den başlayarak):");
        graph.dfs(2);
    }
}
