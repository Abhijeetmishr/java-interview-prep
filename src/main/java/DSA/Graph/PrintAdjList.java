package DSA.Graph;

import java.util.ArrayList;
import java.util.List;

public class PrintAdjList {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> adjList = new ArrayList<>();
        
        for(int i = 0; i < V; i++){
            adjList.add(new ArrayList<>());
        }
        
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        return adjList;
    }
}
