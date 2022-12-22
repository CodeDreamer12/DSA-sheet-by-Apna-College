class Solution{
    //Function to return list containing elements of right view of binary tree.
    public static void printRightView(Node node, ArrayList<Integer> list, int level){
        if(node==null){
            return;
        }
        if(level==list.size()){
            list.add(node.data);
        }
        printRightView(node.right,list,level+1);
        printRightView(node.left,list,level+1);
    }
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> list=new ArrayList<>();
        printRightView(node,list,0);
        return list;
    }
}
