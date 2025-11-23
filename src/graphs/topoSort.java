package graphs;

import java.util.*;

public class topoSort {

    public static void topologicalOrder(List<List<Integer>> adj){

        int n = adj.size();
        int[] freq = new int[n];
        for (List<Integer> integers : adj) {
            for (int v : integers) {
                freq[v]++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        //Priority Q comparator syntax
        for(int i=0;i<n;i++){
            if(freq[i]==0){
                ans.add(i);
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.poll();
            for(int nei:adj.get(curr)){
                freq[nei]--;
                if(freq[nei]==0){
                    ans.add(nei);
                    q.add(nei);
                }
            }
        }

        System.out.println("Order is : "+ ans);
    }

    public static List<List<Integer>> constructAdj(int[][] edges, int n){
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] edge:edges){
            int u = edge[0], v = edge[1];
            adj.get(u).add(v);
        }
        return adj;
    }


    public static void main(String[] args) {
        int[][] input1 = {{0,1}, {1,2}, {2,4}, {3,2}, {3,5}};
        //0->1, 1->2, 2->4, 3->2, 5
        int n = 6;
        //System.out.println("Input array: "+ Arrays.toString(input1));
        System.out.println("\nInput: 0->1, 1->2, 2->4, 3->2, 5");

        topologicalOrder(constructAdj(input1, n));

        int[][] input2 = {{0,1}, {0,2}, {1,3}, {2,4}};

        System.out.println("Input : 0->{1,2}, 1->{3}, 2{4}, 3->{}, 4->{}");
        n=5;
        topologicalOrder(constructAdj(input2, n));


    }
}

/*Sample Output:

Input: 0->1, 1->2, 2->4, 3->2, 5
Order is : [0, 3, 1, 5, 2, 4]
Input : 0->{1,2}, 1->{3}, 2{4}, 3->{}, 4->{}
Order is : [0, 1, 2, 3, 4]

 */
