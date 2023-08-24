import java.util.*;

class Graph {
    private int V; // Jumlah simpul (vertices)
    private List<Integer>[] adjList; // Daftar adjasensi

    // Konstruktor
    Graph(int v) {
        V = v;
        adjList = new List[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    // Menambahkan busur ke graf
    void addEdge(int n, int dst) {
        adjList[n - 1].add(dst);
    }

    // Algoritma DFS rekursif
    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print((v + 1) + " ");

        for (int n : adjList[v]) {
            if (!visited[n - 1]) {
                DFSUtil(n - 1, visited);
            }
        }
    }

    // Algoritma DFS
    void DFS(int start) {
        boolean[] visited = new boolean[V];
        System.out.println("Rute DFS (Depth First Search):");
        DFSUtil(start - 1, visited);
    }

    // Algoritma BFS
    void BFS(int start) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[start - 1] = true;
        queue.add(start);

        System.out.println("\nRute BFS (Breadth First Search):");
        while (!queue.isEmpty()) {
            start = queue.poll();
            System.out.print(start + " ");

            for (int n : adjList[start - 1]) {
                if (!visited[n - 1]) {
                    visited[n - 1] = true;
                    queue.add(n);
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int V = 11; // Jumlah simpul (vertices)
        Graph graph = new Graph(V);

        // Menambahkan busur ke graf
        graph.addEdge(1, 2);
        graph.addEdge(1,4);
        graph.addEdge(4, 6);
        graph.addEdge(2,1);
        graph.addEdge(2, 5);
        graph.addEdge(5,2);
        graph.addEdge(5, 3);
        graph.addEdge(5, 9);
        graph.addEdge(9, 5);
        graph.addEdge(5, 7);
        graph.addEdge(9, 8);
        graph.addEdge(8,9);
        graph.addEdge(8, 11);
        graph.addEdge(11,10);
        graph.addEdge(11,7);
        graph.addEdge(7,11);
        graph.addEdge(7,6);
        graph.addEdge(6, 7);
        

        int startVertex = 1; // Simpul awal

        // Menampilkan rute DFS
        graph.DFS(startVertex);

        // Menampilkan rute BFS
        graph.BFS(startVertex);
    }
}
