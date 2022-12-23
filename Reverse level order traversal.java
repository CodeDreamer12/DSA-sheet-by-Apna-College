class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        Queue<Node> q = new LinkedList<>();
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        if(node==null){
            return al;
        }
        q.add(node);
        while(q.size()>0){
             Node tem = q.remove();
             st.push(tem);
           if(tem.right!=null){
               q.add(tem.right);
           } 
           if(tem.left!=null){
               q.add(tem.left);
           }
          }
        while(st.size()>0){
            al.add(st.pop().data);
        }
         return al; 
    }
}  
