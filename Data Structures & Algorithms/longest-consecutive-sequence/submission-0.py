class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        maxLen = 0 
        for num in nums :
            path = []
            curr = num 
            path.append(curr)
            while curr + 1 in nums :
                path.append(curr+1)
                curr = curr + 1
            maxLen = max(maxLen,len(path)) 
        return maxLen 
            
        