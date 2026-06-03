class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        lp = prices[0]
        mprofit = 0 
        for i in range(len(prices)):
            if prices[i] < lp :
                lp = prices[i]
            mprofit = max(mprofit,abs(prices[i]-lp))
        return mprofit            
