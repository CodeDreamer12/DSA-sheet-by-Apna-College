class Solution {
    public int lcs(int m, int n, String text1, String text2, int dp[][]){
       for(int i=1; i<=m; i++){
           for(int j=1; j<=n; j++){
               if(text1.charAt(i-1)==text2.charAt(j-1)){
                   dp[i][j]=1+dp[i-1][j-1];
               }
               else{
                   dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
               }
           }
       }
          return dp[m][n];
      }
    
    public int longestCommonSubsequence(String text1, String text2){
     int m=text1.length();
     int n=text2.length();
     int dp[][]=new int[m+1][n+1];
    
        int ans=lcs(m,n,text1,text2,dp);
        return ans;
    }
}
