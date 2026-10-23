class Solution {
    public int maxProfit(int[] prices) {
        int lp = prices[0];
        int max = 0 ;
        for(int price : prices){
            if(price < lp){
                lp = price;
            }
            max = Math.max(max, price - lp);
        }
        return max;
    }
}
