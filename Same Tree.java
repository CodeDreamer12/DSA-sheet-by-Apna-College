class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if((p==null && q!=null)||(p!=null  && q==null)){
            return false;
        }

        if(p.val!=q.val){
            return false;
        }
        boolean leftTree=isSameTree(p.left,q.left);
        boolean rightTree=isSameTree(p.right,q.right);
        return leftTree && rightTree;
        
    }
}
