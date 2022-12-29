class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,0);
        int ans=rec(n,dp);
        return ans;
    }
    public static int rec(int n, int dp[]){
        if(n<=1){
            return 1;
        }
        if(dp[n]>0){
            return dp[n];
        }
        int op1=rec(n-1,dp);
        int op2=rec(n-2,dp);
        dp[n]=op1+op2;
        return op1+op2;
    }
}
