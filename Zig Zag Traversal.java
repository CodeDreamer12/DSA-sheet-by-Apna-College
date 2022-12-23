class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
          List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean level=false;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> currlevel=new ArrayList<>();
            while(size-- > 0){
             TreeNode curr=q.remove();
             currlevel.add(curr.val);
             if(curr.left!=null) q.add(curr.left);
             if(curr.right!=null) q.add(curr.right);
            }
            if(level){
                Collections.reverse(currlevel);
            }
            result.add(currlevel);
            level=!level;
        }
        return result;
        
    }
}
