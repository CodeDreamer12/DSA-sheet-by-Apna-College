class Solution
{
    int levelOfLeaf;
    boolean solve(Node root, int level){
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            if(levelOfLeaf==0){
                levelOfLeaf=level;
                return true;
            }
            return levelOfLeaf==level;
        }
        return solve(root.left,level+1) && solve(root.right,level+1);
    }
   
    boolean check(Node root)
    {
	    return solve(root,1);
    }
}
