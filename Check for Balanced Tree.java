class Tree
{
    int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
        if(root==null){
            return true;
        }
        if((!isBalanced(root.left)) ||(!isBalanced(root.right))){
            return false;
        }
        if(Math.abs(height(root.left)-height(root.right))<=1){
            return true;
        }
        else{
            return false;
        }
	    
    }
}
