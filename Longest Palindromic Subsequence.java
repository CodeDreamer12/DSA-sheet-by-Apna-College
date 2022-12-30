class Solution
{
    public int lps(int m, int n, String S, String R, int dp[][]){
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(S.charAt(i-1)==R.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public int longestPalinSubseq(String S)
    {
       String R="";
       for(int i=S.length()-1; i>=0; i--){
           R=R+S.charAt(i);
       }
       int m=S.length();
       int n=R.length();
       int dp[][]=new int[m+1][n+1];
       int ans=lps(m,n,S,R,dp);
       return ans;
    }
}
