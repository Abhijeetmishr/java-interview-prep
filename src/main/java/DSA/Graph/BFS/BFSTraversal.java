package DSA.Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean[] visited = new boolean[V];
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        
        while(!queue.isEmpty()){
            int u = queue.poll();
            if(!visited[u]){
                visited[u] = true;
                res.add(u);
                for(int v : adj.get(u)){
                    if(!visited[v]){
                        queue.add(v);
                    }
                }
            }
        }
        return res;
    }
}
