class Solution {
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
     public static TreeInfo diameter1(Node root) {
       if(root == null) {
           return new TreeInfo(0, 0);
       }
 
       TreeInfo left = diameter1(root.left);
       TreeInfo right = diameter1(root.right);
 
       int myHeight = Math.max(left.ht, right.ht) + 1;
 
       int diam1 = left.ht + right.ht + 1;
       int diam2 = left.diam;
       int diam3 = right.diam;
 
       int myDiam = Math.max(diam1, Math.max(diam2, diam3));
       TreeInfo myInfo=new TreeInfo(myHeight,myDiam);
 
       return myInfo;
   }
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        return diameter1(root).diam;
    }
}
