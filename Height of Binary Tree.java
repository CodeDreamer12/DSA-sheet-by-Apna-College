class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        if(node==null){
            return 0;
        }
        int leftH=height(node.left);
        int rightH=height(node.right);
        return Math.max(leftH,rightH)+1;
    }
}
