class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
       ArrayList<Integer> list=new ArrayList<>();
       boolean vis[]=new boolean[V];
       Queue<Integer> q=new LinkedList<>();
       q.add(0);
       while(q.isEmpty()==false){
           int curr=q.remove();
           if(vis[curr]==false){
               list.add(curr);
               vis[curr]=true;
               for(int i:adj.get(curr)){
                   q.add(i);
               }
           }
       }
       return list;
    }
}
