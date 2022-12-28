class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public void inorder(Node root, ArrayList<Integer> list){
        if(root!=null){
            inorder(root.left,list);
            list.add(root.data);
            inorder(root.right,list);
        }
    }
    public int kthLargest(Node root,int K)
    {
        ArrayList <Integer> list=new ArrayList<>();
        inorder(root,list);
        Collections.reverse(list);
        int ans=list.get(K-1);
        return ans;
    }
}
