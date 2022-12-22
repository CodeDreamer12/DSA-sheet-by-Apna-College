public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
       return isBSTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    boolean isBSTree(Node node, int min, int max){
        if(node==null){
            return true;
        }
        if(node.data<min || node.data>max){
            return false;
        }
        return (isBSTree(node.left,min,node.data-1) && isBSTree(node.right,node.data+1,max));
    }
}
