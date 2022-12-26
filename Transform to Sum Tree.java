class Solution{
    int sum(Node root){
        if(root==null){
            return 0;
        }
        int old_val=root.data;
        root.data=sum(root.left)+sum(root.right);
        return root.data+old_val;
    }
    public void toSumTree(Node root){
         sum(root);
    }
}
