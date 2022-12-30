class Solution
{
    public int lrs(int m, int n, String str, String str1, int dp[][]){
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(str.charAt(i-1)==str1.charAt(j-1) && i!=j){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
        
    }
    
    public int LongestRepeatingSubsequence(String str)
    {
        String str1="";
        for(int i=0; i<str.length(); i++){
            str1=str1+str.charAt(i);
        }
        int m=str.length();
        int n=str1.length();
        int dp[][]=new int[m+1][n+1];
        int ans=lrs(m,n,str,str1,dp);
        return ans;
    }
}
