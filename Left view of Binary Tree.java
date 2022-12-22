class Tree
{
     public static void printLeftViewRes(Node root, ArrayList<Integer> list, int level){
        if(root==null){
            return;
        }
        if(level==list.size()){
            list.add(root.data);
        }
        printLeftViewRes(root.left,list,level+1);
        printLeftViewRes(root.right,list,level+1);
    } 
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> list=new ArrayList<>();
        printLeftViewRes(root,list,0);
        return list;
    }
}
