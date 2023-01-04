class Solution
{
    //Function to return list containing vertices in Topological order. 
    static void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean vis[], Stack<Integer> st){
        vis[v]=true;
        for(int n:adj.get(v)){
            if(!vis[n]){
                dfs(n,adj,vis,st);
            }
        }
        st.push(v);
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean vis[]=new boolean[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<V; i++){
            if(!vis[i]){
                dfs(i,adj,vis,st);
            }
        }
        int ans[]=new int[V];
        int i=0;
        while(!st.isEmpty()){
            ans[i++]=st.pop();
        }
        return ans;
    }
}
