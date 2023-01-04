class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean vis[], ArrayList<Integer> ans){
        vis[v]=true;
        ans.add(v);
        for(int n:adj.get(v)){
            if(!vis[n]){
                dfs(n,adj,vis,ans);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[]=new boolean[V];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0; i<V; i++){
            if(!vis[i]){
                dfs(i,adj,vis,ans);
            }
        }
        return ans;
    }
}
