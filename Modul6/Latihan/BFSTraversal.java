import java.io.*;
import java.util.*;

public class BFSTraversal {
    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> que;

    BFSTraversal(int v) {
        node = v;
        adj = new LinkedList[node];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<Integer>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int n) {
        boolean nodes[] = new boolean[node];
        int a = 0;
        nodes[n] = true;
        que.add(n);

        while (!que.isEmpty()) {
            n = que.poll();
            System.out.print(n + " ");

            for (int i = 0; i < adj[n].size(); i++) {
                a = adj[n].get(i);
                if (!nodes[a]) {
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFSTraversal graph = new BFSTraversal(12);
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

        System.out.println("Breadth First Traversal(BFS):");
        graph.BFS(1);
    }
}