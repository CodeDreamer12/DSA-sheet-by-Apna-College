class Tree {
    // Function to find the minimum element in the given BST.
  
   
    int minValue(Node node) {
       if(node==null){
           return -1;
       }
       while(node.left!=null){
           node=node.left;
       }
       return node.data;
    }
}
