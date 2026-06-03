class Solution:
    def trap(self, height: List[int]) -> int:
        n = len(height)
        left = [0] * n
        right = [0] * n 
        currMax1 = float('-inf')
        currMax2 = float('-inf')
        for i in range(n) :
            left[i] = max(currMax1,height[i])
            if currMax1 < height[i] :
                currMax1 = height[i]
        for i in range(n-1,-1,-1) :
            right[i] = max(currMax2,height[i]) 
            if currMax2 < height[i]:
                currMax2 = height[i] 
        
        total = 0 
        for i in range(n) :
            mini = min(left[i],right[i]) 
            tpd = mini - height[i]
            total += tpd 
        return total