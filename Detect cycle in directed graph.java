class Solution {
    // Function to detect cycle in a directed graph.
    public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean vis[], boolean recS[]){
        vis[v]=true;
        recS[v]=true;
        for(int n: adj.get(v)){
            if(!vis[n]){
                if(dfs(n,adj,vis,recS))
                return true;
            }
            else if(recS[n]){
                return true;
            }
        }
        recS[v]=false;
        return false;
    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean vis[]=new boolean[V];
        boolean recS[]=new boolean[V];
        for(int i=0; i<V; i++){
            if(!vis[i]){
                if(dfs(i,adj,vis,recS))
                return true;
            }
        }
        return false;
    }
}
