class Solution
{
   Node binaryTreeToBST(Node root) {
       ArrayList<Integer> list = new ArrayList<>();
       inorder(root, list, true);
       list.sort(null);
       inorder(root, list, false);
       return root;
    }
    int pos=0;
    private void inorder(Node root, ArrayList<Integer> list, boolean add) {
        if(root != null) {
            inorder(root.left, list, add);
            if(add) {
                list.add(root.data);
            } else {
                root.data = list.get(pos++);
            }
            inorder(root.right, list, add);
        }

    }
}
