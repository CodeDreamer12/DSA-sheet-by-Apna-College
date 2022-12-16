class Solution{
    static List<Integer> minPartition(int N)
    {
        Vector<Integer> ans=new Vector<>();
        int[] notes = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int a=notes.length;
        for(int i=a-1; i>=0; i--){
            while(N>=notes[i]){
                N=N-notes[i];
                ans.add(notes[i]);
            }
        }
        return ans;
    }
}
