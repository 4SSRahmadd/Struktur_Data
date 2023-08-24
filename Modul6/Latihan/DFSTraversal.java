import java.util.*;
public class DFSTraversal {
    private LinkedList<Integer> adj[];
    private boolean visited[];
    
    DFSTraversal(int V)
    {
        adj = new LinkedList[V];
        visited = new boolean[V];
        
        for (int i = 0; i < V; i++)
            adj[i] = new LinkedList<Integer>();
    }
    
    void addEdge (int src, int dest){
        adj[src].add(dest);
    }
    
    void DFS (int vertex){
        visited[vertex] = true;
        System.out.print(vertex + " ");
        
        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()){
            int n = it.next();
            if (!visited[n])
                DFS(n);
        }
    }
    
    public static void main(String[] args) {
        DFSTraversal graph = new DFSTraversal(12);
        
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
        
        System.out.print("Depth First Traversal (DFS) : ");
        graph.DFS(1);
    }
}