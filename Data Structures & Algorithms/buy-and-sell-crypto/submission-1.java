class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int lp = prices[0];
        int max = 0 ;
        for(int i = 1 ; i < n ; i++){
            if(prices[i] < lp){
                lp = prices[i];
            }
            max = Math.max(max,prices[i]-lp);
        }
        return max;
    }
}
