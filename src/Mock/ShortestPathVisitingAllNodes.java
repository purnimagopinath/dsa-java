package Mock;
/*Problem:
Problem: Shortest Path Visiting All Nodes

You are given an undirected connected graph with n nodes.

Return the length of the shortest path that visits every node at least once.

You may:

* start at any node
* revisit nodes
* reuse edges

Input:
graph = [[1,2,3],[0],[0],[0]]

Output:
4

1 -> 1 <= n <= 12

One optimal path
0 -> 2 -> 0 -> 3

Constraints
1 <= n <= 12

 */

/*Assumptions:

 */

import java.util.*;


public class ShortestPathVisitingAllNodes {
    public int lengthOfShortestPath(int[][] graph){
        int n = graph.length;
        //If there is one node, we can only visit in one way
        if(n==1) return 1;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int node:graph[i]){
                adj.get(i).add(node);
            }
        }
        int path = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            //starting from every index
            path = Math.min(path, bfs(adj, n, i, new HashSet<>()));
        }

        return path==Integer.MAX_VALUE ? 0 : path;
    }

    public int bfs(List<List<Integer>> adj, int totalNodes, int start, Set<Integer> visited ){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        int pathLength = 0;
        visited.add(start);
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int nei:adj.get(curr)){
                q.offer(nei);
                visited.add(nei);
                pathLength++;
            }
            if(visited.size()==totalNodes) return pathLength;
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args){
        ShortestPathVisitingAllNodes obj = new ShortestPathVisitingAllNodes();
        int[][] graph = {{1,2,3}, {0}, {0}, {0}};
        System.out.println("Shortest length is :"+obj.lengthOfShortestPath(graph));
    }


}