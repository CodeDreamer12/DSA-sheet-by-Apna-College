class Solution {
    public int maxProfit(int[] prices) {
      int maxProfit=0;
      int minN=prices[0];
      for(int i=0; i<prices.length; i++){
           minN=Math.min(minN,prices[i]);
          int profit=prices[i]-minN;
           maxProfit=Math.max(profit,maxProfit);
      }
      return maxProfit;  
    }
}
