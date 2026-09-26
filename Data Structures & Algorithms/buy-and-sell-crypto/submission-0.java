class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        int currMin = Integer.MAX_VALUE;
        int currProfit =0;
        for(int i =0;i<prices.length;i++){
            if(prices[i]< currMin){
                maxProfit = Math.max(maxProfit, currProfit);
                currProfit=0;
                currMin= prices[i];
            } else {
               currProfit  =  prices[i] - currMin;
              maxProfit = Math.max(maxProfit, currProfit);
            }
        }
        return  maxProfit;
    }
}
