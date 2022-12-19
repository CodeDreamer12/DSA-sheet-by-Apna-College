class Solution {
    public static int minimumCostOfBreaking(int[] X, int[] Y,int M,int N) {
        Arrays.sort(X);
        Arrays.sort(Y);
        int i=X.length-1;
        int j=Y.length-1;
        int v=1;
        int h=1;
        int ans=0;
        while(i>=0 && j>=0){
            if(X[i]>Y[j]){
                ans=ans+(X[i]*v);
                h++;
                i--;
            }
            else{
                ans=ans+(Y[j]*h);
                v++;
                j--;
            }
        }
        while(i>=0){
            ans=ans+(X[i]*v);
                i--;
        }
        while(j>=0){
            ans=ans+(Y[j]*h);
                j--;
        }
        return ans;
        
    }
}
